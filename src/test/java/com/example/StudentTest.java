package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class StudentTest {

    @Test
    public void testGrade() {
        Student s = new Student();
        assertEquals("A", s.getGrade(95));
    }
}
