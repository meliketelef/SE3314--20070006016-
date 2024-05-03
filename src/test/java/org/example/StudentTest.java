package org.example;

import org.junit.Test;
//Fixed * import
import static org.junit.Assert.assertEquals;

public class StudentTest {
    @Test
    public void testGetName() {
        final Student student = new Student("ilhan sen", "16");
        assertEquals("ilhan sen", student.getName());
    }
}