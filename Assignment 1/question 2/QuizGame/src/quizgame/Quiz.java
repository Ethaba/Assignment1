/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quizgame;


import java.util.Scanner;

public class Quiz {
    private Question[] questions;
    private int questionCount;

    // Constructor
    public Quiz(int size) {
        questions = new Question[size];
        questionCount = 0;
    }

    // Add a question to the quiz
    public void addQuestion(Question question) {
        if (questionCount < questions.length) {
            questions[questionCount++] = question;
        }
    }

    // Method to get the questions for testing purposes
    public Question[] getQuestions() {
        return questions;
    }

    // Method to get the current number of questions
    public int getQuestionCount() {
        return questionCount;
    }

    // Start the quiz
    public void start() {
        Scanner scanner = new Scanner(System.in);
        int score = 0;

        for (Question question : questions) {
            if (question != null) {
                System.out.println(question.getQuestionText());
                String[] options = question.getOptions();
                for (int i = 0; i < options.length; i++) {
                    System.out.println((i + 1) + ". " + options[i]);
                }

                System.out.print("Enter your answer (1-" + options.length + "): ");
                int answer = scanner.nextInt();

                if (answer == question.getCorrectOption()) {
                    System.out.println("Correct!");
                    score++;
                } else {
                    System.out.println("Wrong! The correct answer was: " + question.getOptions()[question.getCorrectOption() - 1]);
                }
            }
        }

        System.out.println("Quiz Over! Your score is: " + score + "/" + questions.length);
        scanner.close();
    }
    
}

