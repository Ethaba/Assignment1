/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package main;



import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

public class StudentManagerTest {

    private StudentManager manager;

    @BeforeEach
    public void setUp() {
        manager = new StudentManager();
    }

    @Test
    public void testCaptureStudent() {
        manager.captureStudent();
        List<Student> students = manager.getStudentList(); // Ensure this method exists
        assertNotNull(students);
        assertTrue(students.size() > 0);
    }

    @Test
    public void testSearchStudent() {
        manager.captureStudent();
        manager.searchStudent();
        // Verify search functionality with appropriate checks
    }

    @Test
    public void testDeleteStudent() {
        manager.captureStudent();
        manager.deleteStudent();
        List<Student> students = manager.getStudentList(); // Ensure this method exists
        assertTrue(students.isEmpty());
    }

    @Test
    public void testPrintStudentReport() {
        manager.captureStudent();
        manager.printStudentReport();
        // Verify print functionality with appropriate checks or mock UI interactions
    }
}
