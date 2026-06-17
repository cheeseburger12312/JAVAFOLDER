package main_package;

import java.net.URI;
import java.util.Scanner;
import java.awt.Desktop;

import main_package.Terminal_.UsedTerminal_package_main;
import main_package.randomMade.subRandomMade_menu;

public class Main {
    public static void main(String[] argument) {

        while (true) {
            int userChoice = 0; 
            String input;
            while (true) {
                System.out.println();
                Scanner userInput = new Scanner(System.in);
                System.out.println("Select Destination: ");
                System.out.printf("[1].%-15s [3].%-15s%n" , "Terminal", "Random project");
                System.out.printf("[2].%-15s [4].%-15s%n" , "Read Only", "EXIT");
                System.out.println();
                System.out.print("Enter your destination Number: ");
                input = userInput.nextLine();

                try {
                    userChoice = Integer.parseInt(input);
                    break;
                }catch (NumberFormatException any) {
                    System.out.printf("User input incorrect: %s is string", input);
                }
            }
            switch (userChoice) {
                case 1:
                    UsedTerminal_package_main.destination_method();
                    break;
                case 2:
                    try {
                        URI link = new URI("https://github.com/cheeseburger12312/JAVAFOLDER/tree/main/main_package/readOnly");

                        if (Desktop.isDesktopSupported()) {
                            Desktop.getDesktop().browse(link);
                            break;
                        }

                    } catch (Exception e) {
                        System.out.println("failed to find the link");
                    }
                case 3:
                    subRandomMade_menu.subandomDestination();
            }
            break;
        }
    }
}
