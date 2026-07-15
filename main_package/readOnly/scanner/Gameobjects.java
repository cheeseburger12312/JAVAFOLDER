package main_package.readOnly.scanner;

import java.util.Scanner;


public class Gameobjects {
    //global vars
    static Scanner placeHolder = new Scanner(System.in);
    static volatile boolean SkipDialogue = false;

    //print
    public static void print(Object Text) {
        if (Text instanceof String) {
            System.out.print(Text);
        } else if (Text instanceof Integer) {
            System.out.print(Text);
        }
    }

    public static void println(Object Text) {
        if (Text instanceof String) {
            System.out.println(Text);
        } else if (Text instanceof Integer) {
            System.out.println(Text);
        }
    }


    //effects

    public static void TypeWritting(String Text)  throws InterruptedException {
        int i;
        int count = 0;

        for (i = 0; i < Text.length(); i++) {
            if (SkipDialogue) {
                SkipDialogue = false;

                print("[Skipped] \n");
                print(Text.substring(i));
                println(" ");
                return;
            }
            
            if (count >= 50 &&  Text.charAt(i) == ' ') {
                print("\n");
                count = 0;
                continue;
            }

            System.out.print(Text.charAt(i));
            count++;

            Thread.sleep(100);
        }
        println("\n");
    }

    public static void SkipsDialogue() { 
        new Thread (() -> {
            while (true) {
            String input = placeHolder.nextLine();
            if (input.isBlank()) {
                SkipDialogue = true;
                } 
            }

        }).start();
    }



    public static void main(String[] Main) throws InterruptedException{ //Always check if the Object is working--
        SkipsDialogue();
        TypeWritting("1231246-09876543987y654387654");
    }
}