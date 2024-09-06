/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package main;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StudentTest {

    @Test
    public void testGetStudentId() {
        Student student = new Student("1", "Ethaba Magubane", 21, "ethaba@gmail.com", "Software Development");
        assertEquals("1", student.getStudentId());
    }

    @Test
    public void testGetName() {
        Student student = new Student("1", "Ethaba Magubane", 21, "ethaba@gmail.com", "Software Development");
        assertEquals("John Doe", student.getName());
    }

    @Test
    public void testGetAge() {
        Student student = new Student("1", "Ethaba Magubane", 21, "ethaba@gmail.com", "Software Development");
        assertEquals(20, student.getAge());
    }

    @Test
    public void testGetEmail() {
        Student student = new Student("1", "Ethaba Magubane", 21, "ethaba@gmail.com", "Software Development");
        assertEquals("john.doe@example.com", student.getEmail());
    }

    @Test
    public void testGetCourse() {
        Student student = new Student("1", "Ethaba Magubane", 21, "ethaba@gmail.com", "MSoftware Development");
        assertEquals("Math", student.getCourse());
    }
}
