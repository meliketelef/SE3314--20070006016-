package org.example;



import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

    public class MiddleEarthMap {
        // Encapsulation: 'locations' is set to private to limit access from outside this class.
        private ArrayList<String> locations;

        public MiddleEarthMap() {
            try {
                // Exception Handling: Try to read locations from a file, handle any file not found exceptions.
                loadLocations("map.txt");
            } catch (FileNotFoundException e) {
                // Error Handling: Alert the user if the file is not found.
                System.err.println("Error: File not found. Please check the filename and try again.");
                // Additional actions might include error logging or throwing a new exception.
            }
        }

        // Data Access Method: Allows controlled retrieval of the locations data.
        public ArrayList<String> getLocations() {
            // Encapsulation: Return a new list based on 'locations' to avoid external changes.
            return new ArrayList<>(locations);
        }

        // Modular Design: Isolate the file loading functionality into a dedicated method.
        private void loadLocations(String fileName) throws FileNotFoundException {
            locations = new ArrayList<>();
            File file = new File(fileName);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                locations.add(scanner.nextLine());
            }
            scanner.close(); // Resource Management: Ensure the scanner is closed to free up resources.
        }
    }


