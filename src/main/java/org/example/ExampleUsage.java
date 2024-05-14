package org.example;


    /**
     * Illustrates various uses of loops for manipulating and processing arrays
     * and matrices, including tasks like filtering, summing, and traversing complex structures.
     */
    public class ExampleUsage {

        // Method to demonstrate using loops to filter data

        /**
         * Outputs even numbers from a specified array.
         * Iterates through the array and prints each even number encountered.
         */
        public void displayEvenNumbers(){

            int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            // Display even numbers only
            for (int number : numbers) {
                if (number % 2 == 0) {
                    System.out.println("Even number: " + number);
                }
            }
        }

        // Method to sum an array of integers demonstrating the use of loops and variable scope
        /**
         * Calculates the total of an integer array and displays the result.
         * This method exemplifies the appropriate management of variable scope within loops.
         * @return The total of the array elements.
         */
        public int sumArray() {
            int[] numbers = {5, 10, 15, 20, 25};
            int sum = 0; // Correct usage of variable scope
            for (int num : numbers) {
                sum += num;
            }
            System.out.println("Sum of array: " + sum);
            return sum;
        }

        // Example of using nested loops to process multidimensional data
        /**
         * Examines and outputs each element of a 3x3 matrix.
         * Utilizes nested loops to traverse multidimensional arrays.
         */
        public void processMatrix() {
            int[][] matrix = {
                    {1, 2, 3},
                    {4, 5, 6},
                    {7, 8, 9}
            };


            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    System.out.println("Element at [" + i + "][" + j + "] is " + matrix[i][j]);
                }
            }
        }

        /**
         * Filters and tallies even numbers in an integer array from 1 to 20.
         * @return The count of even numbers within the array.
         */
        public static int filterAndCountEvenNumbers() {
            int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
            int count = 0;

            for (int number : numbers) {
                if (number % 2 == 0) {
                    count++;
                }
            }
            return count;
        }

        /**
         * Computes and returns the sum of the diagonal elements in a 3x3 matrix.
         * Throws an IllegalArgumentException if the provided matrix does not conform to a 3x3 structure.
         * @param matrix A 3x3 matrix of integers.
         * @return The sum of the matrix's diagonal elements.
         */

        public static int matrixDiagonalSum(int[][] matrix) {
            if (matrix == null || matrix.length != 3 || matrix[0].length != 3) {
                throw new IllegalArgumentException("Input must be a 3x3 matrix.");
            }
            int sum = 0;

            for (int i = 0; i < 3; i++) {
                sum += matrix[i][i];
            }

            return sum;
        }
    }
