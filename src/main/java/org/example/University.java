package org.example;

import java.util.HashMap;
import java.util.Map;
    /**
     * The university represents an institution that manages courses and student registration.
     */
    public class University {
        /**
         * Map to hold courses, with keys representing their names.
         */
        //uppercase letter converted to lowercase
        private Map<String, Course> courses = new HashMap<>();

        /**
         *Brings up a map of the university's courses.
         *
         * @return the map of courses offered by the university
         */
        public Map<String, Course> getCourses() {
            return courses;
        }

        /**
         * Adds a course to the university's course offerings.
         *
         * @param course the course to add
         */
        public void addCourse(Course course) {
            if (course != null && !courses.containsKey(course.getCourseName()))
                courses.put(course.getCourseName(), course);
        }

        /**
         * Registers a student for a course.
         *
         * @param student the student to register
         * @param course  the course for which the student is registering
         */
        public void registerStudentForCourse(Student student, Course course) {
            if (courses.containsKey(course.getCourseName())) {
                courses.get(course.getCourseName()).addStudent(student);
            }
        }

        /**
         * Prints all enrolled students for each course.
         */
        public void printEnrollments() {
            for (Course course : courses.values()) {
                System.out.println("Course: " + course.getCourseName());

                //Fixed private field usage with getter
                for (Student student : course.getStudents()) {
                    System.out.println("Student: " + student.getName());
                }
            }
        }
    }
