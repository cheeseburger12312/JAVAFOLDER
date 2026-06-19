package main_package.readOnly;

import java.util.Scanner;

public class dataTypes_readOnly {
    public static void dataTypes_readOnly_method() {
        String input;
        Scanner userInput = new Scanner(System.in);
        String userName;
        byte userChoiceCharacter = 0;
        byte userChoice = 0;

        //characters
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
            User gold %d                
            """;
        //human
        String raceName = null;
        Byte raceHuman_health = 100;
        short raceHuman_gold = 0;
        int raceHuman_dmg = 128;
        boolean hasSkills = true;
        float raceHuman_defence = 56.12f;
        int raceHuman_Intelegence = 80; //avarage
        double raceHuman_luck = 0.24122;
        char raceHuman_grade = 'A';

        //goblin
        Byte raceGoblin_health = 100;
        short raceGoblin_gold = 32767;
        int raceGoblin_dmg = 50;
        boolean hasSkills_Goblin = false;
        float raceGoblin_defence = 10.7f;
        int raceGoblin_Intelegence = 5; //stupid
        double raceGoblin_luck = 0.24122;
        char raceGoblin_grade = 'A';

        while (true) {
            while (true) { //name
                System.out.printf("Enter Character Name:");
                userName = userInput.nextLine();
                System.out.println();
                if (userName == "") {
                    System.out.println("User must have a character");
                }
                break;
            }

            while (true) { //race
                System.out.println(); 
                System.out.println("Race: ");
                System.out.printf("[1]%-10s [2]%-10s%n", "human", "goblin");
                input = userInput.nextLine();
                try {
                    userChoiceCharacter = Byte.parseByte(input);
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Input must be a number");
                }
                }
            while (true) {
                switch (userChoiceCharacter) {
                    case 1:
                        raceName = "Human";
                        break;

                    case 2:
                        raceName = "Goblin";
                        break;
            }
            while (true) {
                switch (userChoiceCharacter) {
                    case 1:
                        String Final_raceHuman_Stats = String.format(race_Stats, userName, raceName, raceHuman_health, 
                                                                        raceHuman_dmg, hasSkills, raceHuman_defence, raceHuman_Intelegence, 
                                                                        raceHuman_luck, raceHuman_grade, raceHuman_gold);
                        System.out.println(Final_raceHuman_Stats);
                    case 2:
                        String Final_raceGoblin_Stats = String.format(race_Stats, userName, raceName, raceGoblin_health, 
                                                                        raceGoblin_dmg, hasSkills_Goblin, raceGoblin_defence, 
                                                                        raceGoblin_Intelegence, raceGoblin_luck, raceGoblin_grade, 
                                                                        raceGoblin_gold);
                        System.out.println(Final_raceGoblin_Stats);
                        break;
                }
                break;
                }
                break;
            }
            while (true) {
                switch (userChoiceCharacter) {
                    case 1:
                        break;
                
                    case 2:
                        System.out.println("your in a forest and spot a travelers");
                        System.out.printf("[1]%-10s [2]%-10s%n", "talk to them", "ignore them");
                        input = userInput.nextLine();
                        try {
                            userChoice = Byte.parseByte(input);
                                break;
                        } catch (NumberFormatException e) {
                            System.out.println("input must be a number");
                        }
                        break; 
                }
                break;
            }
            while (true) {
                switch (userChoice) {
                    case 1:
                        System.out.println("You talk to them but your too stupid for them to understand you so they killed you");
                        break;
                
                    case 2:
                        System.out.println("You Ignored them but one of them saw you and killed you");
                        break;

                }
                break;
            }      
            break;
        }
    }
}
