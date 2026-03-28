<!-- Christine Tobias -->
<!-- Module 5 - Spring2026 -->

##Design Plan - “Zookeeper’s Challenge”:

1. Open the arrivingAnimals.txt file using file I/O.
2. Open the animalNames.txt file using file I/O.
3. Read each animal description line from arrivingAnimals.txt.
4. Parse each line into separate data fields using an ArrayList for temporary storage while parsing.
5. Create an Animal object for each parsed record.
6. Store all Animal objects in an ArrayList so the animals remain in memory for processing.
7. Use a static int variable inside the Animal class to help generate sequential unique IDs for each animal by species.
8. Assign a unique ID to each animal based on its species and sequence number, such as Hy01 for the first hyena or Li01 for the first lion.
9. Use the data from animalNames.txt to assign a unique name to each animal.
10. Call the genBirthDay() method to calculate each animal’s birth date from the given age and birth season information, using ISO 8601 date format.
11. Determine the correct habitat for each animal based on its species.
12. Organize the animals into habitat groups for the final report.
13. Format each animal’s information into a clean report line including ID, name, birthday, color, sex, weight, origin, and arrival date.
14. Write the organized habitat data to zooPopulation.txt.
15. Close all file readers and writers properly to prevent resource leaks.
16. Review the output file to verify that all animals are correctly grouped, uniquely identified, and formatted according to the assignment requirements.
