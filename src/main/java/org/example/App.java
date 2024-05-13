package org.example;



/**
 * Primary application class to showcase how the Character, MiddleEarthMap, and Quest classes are utilized.
 */
public class App
{
    /**
     * The main method serves as the entry point to the application.
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {

        Character frodo = new Character("Frodo", "Hobbit", 50);
        frodo.printDetails();
        MiddleEarthMap map = new MiddleEarthMap();
        // fixed isSecrectPassage boolean is missing
        map.navigate("Mordor", true);
        // fixed isRingBearer boolean is missing
        Quest quest = new Quest();
        quest.completeQuest(100, true);
    }
}
