package main_package.readOnly.scanner;

import java.util.Scanner;

public class scanner {
    Scanner placeHolder = new Scanner(System.in);
    
        // Human
        static String raceName = null;
        static byte raceHuman_health = 100;
        static short raceHuman_gold = 0;
        static int raceHuman_dmg = 128;
        static boolean hasSkills = true;
        static float raceHuman_defence = 56.12f;
        static int raceHuman_Intelegence = 80;
        static double raceHuman_luck = 0.24122;
        static char raceHuman_grade = 'A';

        // Goblin
        static byte raceGoblin_health = 100;
        static short raceGoblin_gold = 32767;
        static int raceGoblin_dmg = 50;
        static boolean hasSkills_Goblin = false;
        static float raceGoblin_defence = 10.7f;
        static int raceGoblin_Intelegence = 5;
        static double raceGoblin_luck = 0.24122;
        static char raceGoblin_grade = 'A';

        static Scanner userInput = new Scanner(System.in);

        static String input;
        static String userName;
        static byte userChoiceCharacter = 0;
        static byte userChoice = 0;

        static Boolean doneUserNaming = false;
        static Boolean retry = false;
        static Boolean firstTime = true;

        public static void main(String[] args) {
            startGame();
        }

        public static void startGame() {

            String race_Stats = """
                    ===================================
                    Name: %s
                    -----------------------------------
                    Race: %s
                    -----------------------------------
                    Health: %d
                    -----------------------------------
                    Damage: %d
                    -----------------------------------
                    Has Skills: %b
                    -----------------------------------
                    Defence: %.2f
                    -----------------------------------
                    Intelegence: %d
                    -----------------------------------
                    Luck: %.5f
                    -----------------------------------
                    Race Grade: %c
                    -----------------------------------
                    User Gold: %d
                    ===================================
                    """;

            while (true) {
                for (int i = 0; i < 15; i++) {
                                System.out.println("");
                }
                // Name
                while (retry == true || firstTime == true) {
                    firstTime = false;
                    retry = false;

                    System.out.print("Enter Character Name: ");
                    userName = userInput.nextLine();

                    if (userName.isEmpty()) {
                        System.out.println("User must have a character name.");
                        continue;
                    }

                    break;
                }

                while (true) {
                    for (int i = 0; i < 15; i++) {
                        System.out.println("");
                    }
                    System.out.println("Is this Your Name: " + userName);
                    System.out.printf("[1] %-10s [2] %-10s%n", "Yes", "No");
                    input = userInput.nextLine();

                    try {
                        userChoiceCharacter = Byte.parseByte(input);

                        if (userChoiceCharacter == 1) {
                            for (int i = 0; i < 15; i++) {
                                System.out.println("");
                            }
                            doneUserNaming = true;
                            break;
                        }

                        if (userChoiceCharacter == 2) {
                            System.err.println("test");
                            retry = true;
                            break;
                            
                        }
                    } catch (NumberFormatException e) {
                        System.err.println("Wrong Input number between 1 or 2");
                        retry = true;
                        break;
                    }

                    
                }

                if (retry) {
                    continue;
                }

                // Race Selection
                while (doneUserNaming == true) {
                    System.out.println("\nRace:");
                    System.out.printf("[1] %-10s [2] %-10s%n", "Human", "Goblin");

                    input = userInput.nextLine();

                    try {
                        userChoiceCharacter = Byte.parseByte(input);

                        if (userChoiceCharacter == 1) {
                            raceName = "Human";
                            break;
                        }

                        if (userChoiceCharacter == 2) {
                            raceName = "Goblin";
                            break;
                        }

                        System.out.println("Choose 1 or 2.");

                    } catch (NumberFormatException e) {
                        System.out.println("Input must be a number.");
                    }
                }

                // Show Stats
                switch (userChoiceCharacter) {

                    case 1:
                        for (int i = 0; i < 15; i++) {
                                System.out.println("");
                            }
                        System.out.println(String.format(
                                race_Stats,
                                userName,
                                raceName,
                                raceHuman_health,
                                raceHuman_dmg,
                                hasSkills,
                                raceHuman_defence,
                                raceHuman_Intelegence,
                                raceHuman_luck,
                                raceHuman_grade,
                                raceHuman_gold));
                        story_raceHuman();
                        break;

                    case 2:
                        for (int i = 0; i < 15; i++) {
                                System.out.println("");
                            }
                        System.out.println(String.format(
                                race_Stats,
                                userName,
                                raceName,
                                raceGoblin_health,
                                raceGoblin_dmg,
                                hasSkills_Goblin,
                                raceGoblin_defence,
                                raceGoblin_Intelegence,
                                raceGoblin_luck,
                                raceGoblin_grade,
                                raceGoblin_gold));
                        story_goblin();
                        break;
                }

                break;
            }
        }

        public static void story_raceHuman() {
            System.out.println("\nHuman story not added yet.");
        }

        public static void story_goblin() {
            String Goblin_current_Story = "forest";
            switch (Goblin_current_Story) {
                case "forest":    
                    System.out.println("\n=======================================================");   
                    System.out.println("\nYou are in a forest and spot some travelers.");
                    System.out.printf("[1] %-20s [2] %-35s%n",
                                        "Talk to them",
                                                "Ignore them");
                    System.out.println("\n=======================================================");
                    break;
            
                default:
                    break;
            }
            byte userChoice = 0;

            while (true) {
                input = userInput.nextLine();

                try {
                    userChoice = Byte.parseByte(input);
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Input must be a number.");
                }
            }

            switch (userChoice) {

                case 1:
                    System.out.println(
                            "You talk to them, but you're too stupid for them to understand you, so they kill you.");
                    break;

                case 2:
                    System.out.println(
                            "You ignore them, but one of them sees you and kills you.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    
}
