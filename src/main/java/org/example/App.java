package org.example;

public class App {
    public static void main(String[] args) {
        LoopControl loopControl = new LoopControl();

        // Utilizing ExampleUsage class to demonstrate practical applications of loops
        ExampleUsage exampleUsage = new ExampleUsage();

        // Illustrating both correct and incorrect handling of loop variables
        System.out.println("Demonstrating correct variable usage:");
        loopControl.correctVariableUsage();
        System.out.println("\nDemonstrating incorrect variable usage:");
        loopControl.incorrectVariableUsage();

        // Illustrating the avoidance of empty blocks in loops
        System.out.println("\nDemonstrating empty block usage (should handle without output):");
        loopControl.avoidEmptyBlock();

        // Demonstrating modifications of control variables within loops
        System.out.println("\nDemonstrating correctly modified control variable:");
        loopControl.correctlyModifiedControlVariable();
        System.out.println("\nDemonstrating incorrectly modified control variable:");
        loopControl.modifiedControlVariable();


        // Displaying even numbers using a loop
        System.out.println("\nDisplaying even numbers:");
        exampleUsage.displayEvenNumbers();

       // Calculating and displaying the sum of an array
        System.out.println("\nCalculating the sum of an array:");
        int sum = exampleUsage.sumArray();
        System.out.println("Total Sum: " + sum);

        // Processing a matrix
        System.out.println("\nProcessing elements of a matrix:");
        exampleUsage.processMatrix();


        // Sum of squares
        System.out.println("\nCalculating the sum of squares:");
        int sumOfSquares = LoopControl.sumOfSquares();
        System.out.println("Sum of squares: " + sumOfSquares);

        // Printing a triangle
        System.out.println("\nPrinting a triangle:");
        LoopControl.printTriangle();

        // Modifying index incorrectly
        System.out.println("\nDemonstrating incorrect modification of loop index:");
        LoopControl.modifyIndexIncorrectly();

        // Filtering and counting even numbers
        System.out.println("\nFiltering and counting even numbers:");
        int evenCount = ExampleUsage.filterAndCountEvenNumbers();
        System.out.println("Number of even numbers: " + evenCount);

        // Calculating and displaying the diagonal sum of a 3x3 matrix
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println("\nCalculating diagonal sum of a 3x3 matrix:");
        int diagonalSum = ExampleUsage.matrixDiagonalSum(matrix);
        System.out.println("Diagonal sum of the matrix: " + diagonalSum);
    }
}

