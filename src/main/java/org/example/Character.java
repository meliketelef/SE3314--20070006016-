package org.example;



/**
 * Represents an individual with specified attributes including name, race, and age.
 */
public class Character {
    private String name;
    private String race;
    private int age;

    /**
     * Constructs a new instance of Character.
     *
     * @param name the name of the individual
     * @param race the ethnic background of the individual (e.g., "Hobbit", "Elf", "Human")
     * @param age  the chronological age of the individual
     */

    public Character(String name, String race, int age) {
        this.name = name;
        this.race = race;
        this.age = age;
    }

    /**
     * Displays information about the character based on specific criteria.
     * Outputs are conditionally formatted:
     * If the individual belongs to the Hobbit race, it displays "Character is a Hobbit".
     * If the individual is aged 50 years or more, it displays "Character is 50 or older".
     * If the individual's name is "Frodo", it displays "Character is Frodo".
     */

    public void printDetails() {

        // Added braces around the if statement for clarity.
        if (race.equals("Hobbit")) {
            System.out.println("Character is a Hobbit");
        }
        else

            // Added braces around the if statement for clarity.
            if (age >= 50) {
                System.out.println("Character is 50 or older");
            } else if (name.equals("Frodo")) {
                System.out.println("Character is Frodo");
            }
    }
}