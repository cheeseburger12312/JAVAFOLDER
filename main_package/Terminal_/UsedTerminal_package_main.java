package main_package.Terminal_;
import java.util.Scanner;

import main_package.Main;
import main_package.Terminal_.subTerminal.variable_terminal;
import main_package.Terminal_.subTerminal.lesson1_terminal;

public class UsedTerminal_package_main {
    public static void destination_method() {
        while (true) {
            String input;
            int userChoice = 0; 

            while (true) {
                Scanner userInput = new Scanner(System.in); 
                System.out.println();
                System.out.println("Select Destination: ");
                System.out.printf("[1].%-15s [3].%-15s [5].%-15s%n", "Lesson #1", "", "None");
                System.out.printf("[2].%-15s [4].%-15s [6].%-15s%n", "Variables", "None", "None");
                System.out.println();
                System.out.printf("[98].%-15s [99].%-15s%n", "Back", "EXIT");
                System.out.println();
                System.out.print("Enter your destination Number: ");
                input = userInput.nextLine();
                
                try {
                    userChoice = Integer.parseInt(input);
                    System.out.println();
                    break;
                }catch (NumberFormatException any) {
                    System.err.printf("User input incorrect: %s is string", input);
                }
            }
            switch (userChoice) {
                case 1:
                    System.out.println("User choosed [1].Lesson #1");
                    lesson1_terminal.lesson1_terminal_method();
                    break;
                case 2:
                    System.out.println("User choosed [2].Variables");
                    variable_terminal.variable_terminal_method();
                    break;
                case 3:
                    System.out.println("No file");
                    continue;
                case 4:
                    System.out.println("No file");
                    continue;
                case 5:
                    System.out.println("No file");
                    continue;
                case 6:
                    System.out.println("No file");
                    continue;
                case 98:
                    System.out.println("User choosed: [98].Back");
                    Main.main(new String[]{});
                    break;
                case 99:
                    System.out.println("User choosed [98].EXIT");
                    break;
                default:
                    System.out.printf("No number such as %d%n", userChoice);
                    break;
            }
            System.out.println("Exitting...");
            break;
        }
    }
}