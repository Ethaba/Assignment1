
package main;

//I included comments throughout my code to explain what is happening
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        
        String startupInput = JOptionPane.showInputDialog(null, 
            "Enter (1) to launch menu or any other key to exit", 
            "Startup menu", 
            JOptionPane.QUESTION_MESSAGE);

        
        if ("1".equals(startupInput)) {
            StudentManager manager = new StudentManager();

            while (true) {
                manager.displayMenu();
                String input = JOptionPane.showInputDialog(null, 
                    "Please select an option:", 
                    "Menu", 
                    JOptionPane.QUESTION_MESSAGE);

                if (input == null) { 
                    JOptionPane.showMessageDialog(null, "Exiting application.", "Menu", JOptionPane.INFORMATION_MESSAGE);
                    System.exit(0);
                }

                int selection;
                // Check if the input is numeric
                if (isNumeric(input)) {
                    selection = Integer.parseInt(input);
                    if (selection >= 1 && selection <= 5) {
                        manager.handleUserSelection(selection);
                    } else {
                        JOptionPane.showMessageDialog(null, "Invalid number. Please enter between 1 and 5.", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid number.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        } else {
            // Exit if any other key is pressed
            JOptionPane.showMessageDialog(null, "Exiting application.", "Menu", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }
    }

    // Helper method to check if a string is numeric
    private static boolean isNumeric(String str) {
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


