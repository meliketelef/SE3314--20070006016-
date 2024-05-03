package org.example;

public class App 
{

        public static void main(String[] args) {
            // made all instances final
            final University yu_university = new University();
            final Student student1 = new Student("Melike tlf", "12");
            final Student student2 = new Student("Ege bgcvn", "14");
            final Course course1 = new Course("Software Quality and Testing", 50);
            final Course course2 = new Course("Software Construction", 70);

            yu_university.addCourse(course1);
            yu_university.addCourse(course2);
            yu_university.registerStudentForCourse(student1, course1);
            yu_university.registerStudentForCourse(student2, course2);

            System.out.println("Total courses: " + Course.getTotalCourses());
            yu_university.printEnrollments();
        }
    }
