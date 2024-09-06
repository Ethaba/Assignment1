/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quizgame;

// Main Class to run the Quiz Game
import java.util.Scanner;

public class QuizGame {
    public static void main(String[] args) {
        // Create a new quiz object
        Quiz quiz = new Quiz("General Knowledge Quiz", 5);

        // Add questions to the quiz
        quiz.addQuestion(new Question("What is the capital of France?", "Paris", "London", "Rome", "Berlin", 1));
        quiz.addQuestion(new Question("Which planet is known as the Red Planet?", "Earth", "Mars", "Venus", "Jupiter", 2));
        quiz.addQuestion(new Question("Who wrote 'Romeo and Juliet'?", "Shakespeare", "Hemingway", "Austen", "Tolstoy", 1));
        quiz.addQuestion(new Question("What is the largest ocean on Earth?", "Atlantic", "Indian", "Arctic", "Pacific", 4));
        quiz.addQuestion(new Question("How many continents are there?", "Five", "Six", "Seven", "Eight", 3));

        // Start the quiz
        quiz.start();
    }
}

// Base class for Questions
class Question {
    private String questionText;
    private String[] options;
    private int correctAnswer;

    // Constructor to initialize the question
    public Question(String questionText, String option1, String option2, String option3, String option4, int correctAnswer) {
        this.questionText = questionText;
        this.options = new String[] {option1, option2, option3, option4};
        this.correctAnswer = correctAnswer;
    }

    // Method to display the question and options
    public void display() {
        System.out.println(questionText);
        for (int i = 0; i < options.length; i++) {
            System.out.println((i + 1) + ". " + options[i]);
        }
    }

    // Method to check if the given answer is correct
    public boolean isCorrect(int answer) {
        return answer == correctAnswer;
    }
}

// Quiz class that manages the quiz flow
class Quiz {
    private String title;
    private Question[] questions;
    private int score;
    private int questionCount;

    // Constructor to initialize the quiz
    public Quiz(String title, int maxQuestions) {
        this.title = title;
        this.questions = new Question[maxQuestions];
        this.questionCount = 0;
    }

    // Method to add questions to the quiz
    public void addQuestion(Question question) {
        if (questionCount < questions.length) {
            questions[questionCount++] = question;
        }
    }

    // Method to start the quiz
    public void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to " + title + "!");
        System.out.println("There are " + questionCount + " questions in this quiz.\n");

        // Loop through all the questions
        for (int i = 0; i < questionCount; i++) {
            questions[i].display();
            System.out.print("Your answer (1-4): ");
            int answer = scanner.nextInt();

            // Check if the answer is correct
            if (questions[i].isCorrect(answer)) {
                System.out.println("Correct!\n");
                score++;
            } else {
                System.out.println("Wrong! The correct answer was option " + questions[i].isCorrect(answer) + ".\n");
            }
        }

        // Display final score as a report
        System.out.println("Quiz completed!");
        System.out.println("Your final score: " + score + " out of " + questionCount);
    }
}

