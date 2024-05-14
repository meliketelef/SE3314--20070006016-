package org.example;



import java.util.Random;

/**
 * Illustrates various scenarios of loop control, including examples of both proper and improper
 * usages, adjustments to control variables, and adherence to loop implementation best practices.
 */
public class LoopControl {

    /**
     * Exhibits an example of improper loop variable usage by initializing the variable
     * well before its associated loop, which may lead to confusion and difficulties in code maintenance.
     */

    public void incorrectVariableUsage() {
        int index;
        // Some other code
        System.out.println("Preparing to loop...");
        // Loop starts much later after declaration
        index = 0;
        for (; index < 5; index++) {
            System.out.println(index);
        }
    }
    /**
     * Demonstrates proper loop variable usage where the variable is declared just before its loop
     * and is used within its intended scope only.
     */
    public void correctVariableUsage() {
        int index = 0;
        System.out.println("Loop starts!..");
        for (; index < 5; index++) {
            System.out.println(index);
        }
    }
    /**
     * Showcases the correct modification of a control variable within a while loop,
     * where the modification is contingent upon a random condition. This example reflects
     * proper runtime modification of loop control variables.
     */
    public void correctlyModifiedControlVariable() {
        int i = 0;
        while (i < 10) {
            System.out.println("Current Index: " + i);
            if (new Random().nextBoolean()) { // Random condition for demonstration
                System.out.println("Randomly Skipping Two Steps from Index: " + i);
                i += 2; // Appropriately modifying control variable based on an external condition
            } else {
                i++;
            }
        }
    }

    /**
     * Demonstrates best practices by avoiding empty blocks within a for loop, ensuring
     * that the code within the loop is necessary and functional.
     */
    public void avoidEmptyBlock() {
        for (int j = 0; j < 10; j++) {
            if (j == 5) {
                System.out.println("Midpoint at: " + j);
            }
            //Removed the empty else block
        }
    }

    /**
     * Illustrates an improper practice of modifying the control variable inside the loop body,
     * which can result in unpredictable behavior and issues with loop termination.
     */
    public void modifiedControlVariable() {
        for (int m = 0; m < 10; m++) {
            if (m == 5) {
                System.out.println("Adjusting loop index from " + m);
                m += 3; // Incorrect - modifying control variable inside the loop
                System.out.println("to " + m);
            }
        }
    }

    /**
     * Computes and returns the sum of squares of the first ten positive integers.
     * @return The sum of squares from 1 to 10.
     */
    public static int sumOfSquares() {
        int sum = 0;

        for (int i = 1; i <= 10; i++) {
            int square = i * i;
            sum += square;
        }

        return sum;
    }

    /**
     * Outputs a right-angled triangle composed of asterisks (*) with a height of five lines.
     * This method employs nested loops to generate graphical outputs.
     */
    public static void printTriangle() {
        int height = 5;

        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /**
     * Displays an incorrect practice of altering the loop index variable within the loop,
     * which leads to the erratic skipping of iterations.
     */

    public static void modifyIndexIncorrectly() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Current index: " + i);
            if (i == 5) {
                i += 2;
            }
        }
    }

}
