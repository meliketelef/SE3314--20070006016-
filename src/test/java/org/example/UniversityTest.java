package org.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class UniversityTest {
    @Test
    public void testAddCourse() {

        final University university = new University();
        final Course course = new Course("Database", 120);
        university.addCourse(course);
        assertEquals(1, university.getCourses().size());
    }

    @Test
    public void testRegisterStudentForCourse() {

        final University university = new University();
        final Student student = new Student("Ege bgcvn", "14");
        final Course course = new Course("Database", 120);
        university.addCourse(course);
        university.registerStudentForCourse(student, course);
        assertTrue(course.getStudents().contains(student));
    }
}
