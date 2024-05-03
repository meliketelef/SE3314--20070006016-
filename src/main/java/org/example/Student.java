package org.example;
    /**
     * Student represents a student enrolled in a course.
     */

    public class Student {
        /**
         * Name of the student.
         */
        //Uppercase letters converted to lowercase letters
        public String studentName;
        /**
         * ID of the student.
         */
        public String studentID;

        /**
         * Constructs a Student object with a given name and ID.
         *
         * @param name the name of the student
         * @param id   the ID of the student
         */
        public Student(String name, String id) {
            studentName = name;
            studentID = id;
        }
        /**
         * Retrieves the name of the student.
         *
         * @return the name of the student
         */
        public String getName() {
            return studentName;
        }
    }

