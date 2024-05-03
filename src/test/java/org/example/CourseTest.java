package org.example;

import org.junit.Test;
//Fixed * import
import static org.junit.Assert.assertTrue;

public class CourseTest {
    @Test
    public void testAddStudent() {

        final Course course = new Course("Software Architechture", 80);
        final Student student = new Student("Melina abc", "16");
        course.addStudent(student);
        assertTrue(course.getStudents().contains(student));
    }
}