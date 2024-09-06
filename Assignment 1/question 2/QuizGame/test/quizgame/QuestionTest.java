/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package quizgame;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class QuestionTest {

    @Test
    public void testQuestionConstructor() {
        String questionText = "What is the capital of France?";
        String[] options = {"Paris", "London", "Rome", "Berlin"};
        int correctOption = 1;
        
        Question question = new Question(questionText, options, correctOption);

        assertEquals(questionText, question.getQuestionText());
        assertArrayEquals(options, question.getOptions());
        assertEquals(correctOption, question.getCorrectOption());
    }

    @Test
    public void testGetQuestionText() {
        Question question = new Question("What is the capital of France?", 
                                         new String[]{"Paris", "London", "Rome", "Berlin"}, 
                                         1);
        assertEquals("What is the capital of France?", question.getQuestionText());
    }

    @Test
    public void testGetOptions() {
        String[] options = {"Paris", "London", "Rome", "Berlin"};
        Question question = new Question("What is the capital of France?", options, 1);
        assertArrayEquals(options, question.getOptions());
    }

    @Test
    public void testGetCorrectOption() {
        Question question = new Question("What is the capital of France?", 
                                         new String[]{"Paris", "London", "Rome", "Berlin"}, 
                                         1);
        assertEquals(1, question.getCorrectOption());
    }
}
