/* Christine Tobias
 * CIT-63-18779-2026SP - Module 4 - MAIN class (main file) [file creation 03/08/26]
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {

  public static void main(String[] args) {
    ArrayList<String> namesList = new ArrayList<>();
    ArrayList<Animal> zooInventory = new ArrayList<>();
    HashMap<String, Integer> speciesCounts = new HashMap<>();

    try (
      BufferedReader nameReader = new BufferedReader(
        new FileReader("animalNames.txt")
      )
    ) {
      String line;
      while ((line = nameReader.readLine()) != null) {
        if (!line.trim().isEmpty() && !line.contains("Names")) {
          String[] names = line.split(",");
          for (String name : names) {
            namesList.add(name.trim());
          }
        }
      }
    } catch (IOException e) {
      System.out.println("Error reading animalNames.txt: " + e.getMessage());
    }

    try (
      BufferedReader animalReader = new BufferedReader(
        new FileReader("arrivingAnimals.txt")
      )
    ) {
      String line;
      int nameIndex = 0;
      while ((line = animalReader.readLine()) != null) {
        String[] parts = line.split(" ");
        int age = Integer.parseInt(parts[0]);
        String species = parts[4].replace(",", "").toLowerCase();

        String assignedName = namesList.isEmpty()
          ? "Unknown"
          : namesList.get(nameIndex % namesList.size());
        nameIndex++;

        switch (species) {
          case "hyena" -> zooInventory.add(
            new Hyena(assignedName, age, "Laughing")
          );
          case "lion" -> zooInventory.add(new Lion(assignedName, age, true));
          case "tiger" -> zooInventory.add(
            new Tiger(assignedName, age, "Thin")
          );
          case "bear" -> zooInventory.add(new Bear(assignedName, age, "Brown"));
          default -> {}
        }
      }
    } catch (IOException e) {
      System.out.println(
        "Error reading arrivingAnimals.txt: " + e.getMessage()
      );
    }

    for (Animal animal : zooInventory) {
      String speciesKey = animal.getSpecies();
      speciesCounts.put(
        speciesKey,
        speciesCounts.getOrDefault(speciesKey, 0) + 1
      );
    }

    try (
      PrintWriter writer = new PrintWriter(new FileWriter("newAnimals.txt"))
    ) {
      writer.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
      writer.println("         ZOO REPORT         ");
      writer.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");

      writer.println("\n~~~ Animal Inventory ~~~\n");
      for (Animal animal : zooInventory) {
        writer.println(
          "Name: " +
          animal.getName() +
          " | " +
          "Age: " +
          animal.getAge() +
          " | " +
          "Species: " +
          animal.getSpecies()
        );
      }

      writer.println("\n~~~ Species Totals ~~~\n");
      for (String species : speciesCounts.keySet()) {
        writer.println(species + ": " + speciesCounts.get(species));
      }

      System.out.println(
        "Process Complete. Check 'newAnimals.txt' for the Animal Inventory Report!"
      );
    } catch (IOException e) {
      System.out.println("Error writing report: " + e.getMessage());
    }
  }
}
