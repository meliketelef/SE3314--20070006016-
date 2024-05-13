package org.example;



/**
 * Depicts a map of Middle-earth utilized for navigation to diverse locations.
 */
public class MiddleEarthMap {



    /**
     * Proceeds to a predetermined location, with the option to employ a secret passage if necessary.
     *
     * @param location        the name of the location to navigate to (e.g., "Mordor", "Shire", "Gondor", "Lothlórien")
     * @param isSecretPassage whether to take a secret passage during navigation
     */
    public void navigate(String location, boolean isSecretPassage) {
        switch (location) {
            case "Mordor":
                System.out.println("Navigating to Mordor");
                if (isSecretPassage) {
                    System.out.println("Taking a secret passage");
                }
                break;
            case "Shire":
                System.out.println("Navigating to the Shire");
                // FallThrough violation - Missing break
            case "Gondor":
                System.out.println("Navigating to Gondor");
            default:
                System.out.println("Unknown location");

        }
        switch (location) {
            case "Lothlórien":
                System.out.println("Navigating to Lothlórien");

                // added default to switch case
            default:
                System.out.println("Unknown location");
        }

        // deleted empty if statement




        // changed ternary operator the if statement
        String result = "";
        if(isSecretPassage){
            result =  "Secret";
        }
        else {
            result="Normal";
        }
        System.out.println(result);
    }
}