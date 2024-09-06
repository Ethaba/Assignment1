
package main;


import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;

public class StudentManager {
    private List<Student> studentList = new ArrayList<>(); // List to store students

    // Method to display the menu to the user
    public void displayMenu() {
        String menu = "STUDENT MANAGEMENT APPLICATION\n" +
                      "_____________________________________\n" +
                      "1. Capture a new student.\n" +
                      "2. Search for a student.\n" +
                      "3. Delete a student.\n" +
                      "4. Print student report.\n" +
                      "5. Exit Application.";
        JOptionPane.showMessageDialog(null, menu, "Menu", JOptionPane.INFORMATION_MESSAGE);
    }

    // Method to handle the user's selection on the menu
    public void handleUserSelection(int selection) {
        switch (selection) {
            case 1:
                captureStudent();
                break;
            case 2:
                searchStudent();
                break;
            case 3:
                deleteStudent();
                break;
            case 4:
                printStudentReport();
                break;
            case 5:
                JOptionPane.showMessageDialog(null, "Exiting Application..", "Menu", JOptionPane.INFORMATION_MESSAGE);
                System.exit(0);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Invalid selection. Please enter a number between 1 and 5.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Method to capture student details
    public void captureStudent() {
        String id = JOptionPane.showInputDialog(null, "Enter the student id:", "Menu", JOptionPane.QUESTION_MESSAGE);
        String name = JOptionPane.showInputDialog(null, "Enter the student name:", "Menu", JOptionPane.QUESTION_MESSAGE);
        String ageInput = JOptionPane.showInputDialog(null, "Enter the student age:", "Menu", JOptionPane.QUESTION_MESSAGE);
        String email = JOptionPane.showInputDialog(null, "Enter the student email:", "Menu", JOptionPane.QUESTION_MESSAGE);
        String course = JOptionPane.showInputDialog(null, "Enter the student course:", "Menu", JOptionPane.QUESTION_MESSAGE);

        // Validate the age input
        int age = 0;
        if (isNumeric(ageInput)) {
            age = Integer.parseInt(ageInput);
        } else {
            JOptionPane.showMessageDialog(null, "Invalid age. Please enter a valid number.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Create a new student and add it to the list
        Student student = new Student(id, name, age, email, course);
        studentList.add(student);

        JOptionPane.showMessageDialog(null, "Student details have been successfully saved.", "Menu", JOptionPane.INFORMATION_MESSAGE);
    }

    // Method to search for a student by ID
    public void searchStudent() {
        String id = JOptionPane.showInputDialog(null, "Enter the student id to search:", "Menu", JOptionPane.QUESTION_MESSAGE);

        for (Student student : studentList) {
            if (student.getStudentId().equals(id)) {
                String details = "STUDENT ID: " + student.getStudentId() + "\n" +
                                 "STUDENT NAME: " + student.getName() + "\n" +
                                 "STUDENT AGE: " + student.getAge() + "\n" +
                                 "STUDENT EMAIL: " + student.getEmail() + "\n" +
                                 "STUDENT COURSE: " + student.getCourse();
                JOptionPane.showMessageDialog(null, details, "Student Details", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
        }

        JOptionPane.showMessageDialog(null, "Student with Student ID: " + id + " was not found!", "Error", JOptionPane.ERROR_MESSAGE);
    }

    // Method to delete a student by ID
    public void deleteStudent() {
        String id = JOptionPane.showInputDialog(null, "Enter the student id to delete:", "Menu", JOptionPane.QUESTION_MESSAGE);

        for (Student student : studentList) {
            if (student.getStudentId().equals(id)) {
                studentList.remove(student);
                JOptionPane.showMessageDialog(null, "Student with Student ID: " + id + " was deleted!", "Menu", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
        }

        JOptionPane.showMessageDialog(null, "Student with Student ID: " + id + " was not found!", "Error", JOptionPane.ERROR_MESSAGE);
    }

    // Method to print all students in the list
    public void printStudentReport() {
        if (studentList.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No students to display.", "Menu", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        StringBuilder report = new StringBuilder();
        for (Student student : studentList) {
            report.append("STUDENT ID: ").append(student.getStudentId()).append("\n")
                  .append("STUDENT NAME: ").append(student.getName()).append("\n")
                  .append("STUDENT AGE: ").append(student.getAge()).append("\n")
                  .append("STUDENT EMAIL: ").append(student.getEmail()).append("\n")
                  .append("STUDENT COURSE: ").append(student.getCourse()).append("\n")
                  .append("_____________________________________\n");
        }
        JOptionPane.showMessageDialog(null, report.toString(), "Student Report", JOptionPane.INFORMATION_MESSAGE);
    }
    
        // Method to get the student list
    public List<Student> getStudentList() {
        return studentList;
    }

    // Helper method to check if a string is numeric
    private boolean isNumeric(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        for (char c : str.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }
}


