package main_package.Terminal_;
import java.util.Scanner;

import main_package.Terminal_.subTerminal.dataTypes;

public class UsedTerminal_package_main {
    public static void destination_class() {

        while (true) {
            int userChoice = 0; 
            String input;

            while (true) {
                Scanner userInput = new Scanner(System.in);

                System.out.println("Select Destination: ");
                System.out.printf("[1].%-15s [3].%-15s [5].%-15s%n", "Test", "None", "None");
                System.out.printf("[2].%-15s [4].%-15s [6].%-15s%n", "Data Types", "None", "None");

                System.out.println();
                System.out.print("Enter your destination Number: ");
                input = userInput.nextLine();

                try {
                    userChoice = Integer.parseInt(input);
                    break;
                }catch (NumberFormatException any) {
                    System.err.printf("User input incorrect: %s is string", input);
                }
            }
            switch (userChoice) {
                case 1:
                    dataTypes.DataType();
                    break; //stops case1
                case 2:

                    // break; //stops case2
            }
            break; //stops looping the parent loop
        }
    }
}