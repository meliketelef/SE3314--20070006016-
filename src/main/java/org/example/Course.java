package org.example;

import java.util.ArrayList;
import java.util.List;

    /**
     * Course designates a class with a maximum capacity of pupils.
     */
    public class Course {
        /**
         * Total number of Course instances created.
         */
        private static int total_Courses = 0;

        /**
         * Name of the course.
         */
        //uppercase letter converted to lowercase
        private String courseName;

        /**
         * Maximum capacity of the course.
         */
        //uppercase letter converted to lowercase
        private final int capacity;
        /**
         * List of students enrolled in the course.
         */
        private List<Student> students = new ArrayList<>();

        /**
         * Constructs a Course object with a given name and capacity.
         *
         * @param name     the name of the course
         * @param capacity the maximum number of students the course can accommodate
         */
        public Course(String name, int capacity) {
            courseName = name;
            this.capacity = capacity;
            total_Courses++;
        }
        /**
         * Adds students to the course if there is space available.
         *
         * @param student the student to add
         */
        public void addStudent(Student student) {
            if (students.size() < capacity)
                students.add(student);
        }
        /**
         * Retrieves the name of the course.
         *
         * @return the name of the course
         */
        public String getCourseName() {
            return courseName;
        }

        /**
         * Gets the list of students enrolled in the course.
         *
         * @return the list of students enrolled in the course
         */

        // Adds getter methods to the student list
        public List<Student> getStudents() {
            return students;
        }

        /**
         *Retrieves the total number of Course instances created.
         *
         * @return the total number of Course instances
         */
        public static int getTotalCourses() {
            return total_Courses;
        }
    }


