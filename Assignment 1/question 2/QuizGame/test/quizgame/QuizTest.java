/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package quizgame;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Ethaba
 */
public class QuizTest {
    
    public QuizTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of addQuestion method, of class Quiz.
     */
    @Test
    public void testAddQuestion() {
        System.out.println("addQuestion");
        Question question = null;
        Quiz instance = null;
        instance.addQuestion(question);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getQuestions method, of class Quiz.
     */
    @Test
    public void testGetQuestions() {
        System.out.println("getQuestions");
        Quiz instance = null;
        Question[] expResult = null;
        Question[] result = instance.getQuestions();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getQuestionCount method, of class Quiz.
     */
    @Test
    public void testGetQuestionCount() {
        System.out.println("getQuestionCount");
        Quiz instance = null;
        int expResult = 0;
        int result = instance.getQuestionCount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of start method, of class Quiz.
     */
    @Test
    public void testStart() {
        System.out.println("start");
        Quiz instance = null;
        instance.start();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
