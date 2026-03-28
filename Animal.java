/* Christine Tobias
 * CIT-63-18779-2026SP - Module 4 - ANIMAL class [file creation 03/08/26]
 */
public class Animal {

  //instance variables
  private String name;
  private int age;
  private String species;

  //constructor
  public Animal(String name, int age, String species) {
    this.name = name;
    this.age = age;
    this.species = species;
  }

  //getters
  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public String getSpecies() {
    return species;
  }

  //setters
  public void setName(String name) {
    this.name = name;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void setSpecies(String species) {
    this.species = species;
  }
}
