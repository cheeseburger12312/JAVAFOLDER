package main_package.Terminal_.subTerminal;
import java.util.Scanner; 

public class variable_terminal {
    public static void variable_terminal_method() {
        System.out.println();
        String code = """
                public class variable_terminal {
                    public static void variable_terminal_method() {
                        String productName = "apple";
                        int itemCount = 1;
                        float itemPrice = 5.99f;    
                        char productGrade = 'A';
                        boolean isForSale = true;

                        System.out.println();
                        System.out.printf("Product Name: %s%n", productName);
                        System.out.printf("Item Count:  %d%n", itemCount);
                        System.out.printf("%s price: %.2f%n", productName, itemPrice);
                        System.out.printf("Product Grade: %c", productGrade);
                        System.out.printf("Is the product for sale? %b%n", isForSale);
                        System.out.println("Is the product for sale? " + isForSale);     
                    }
                }
                """;
        Scanner userInput = new Scanner(System.in);
        while (true) {
            String input;
            int userChoice = 0;
            while (true) {
                System.out.println(code);
                System.out.println();
                System.out.printf("[1].%-15s [2].%-15s%n", "Check output", "EXIT");
                input = userInput.nextLine();

                try {
                    userChoice = Integer.parseInt(input);
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Input must be a number");
                    continue;
                }
            }
            switch (userChoice) {
                case 1:
                    String productName = "apple";
                    int itemCount = 1;
                    float itemPrice = 5.99f;    
                    char productGrade = 'A';
                    boolean isForSale = true;

                    System.out.println();
                    System.out.printf("Product Name: %s%n", productName);
                    System.out.printf("Item Count:  %d%n", itemCount);
                    System.out.printf("%s price: %.2f%n", productName, itemPrice);
                    System.out.printf("Product Grade: %c", productGrade);
                    System.out.printf("Is the product for sale? %b%n", isForSale);
                    System.out.println("Is the product for sale? " + isForSale);
                    break;
                case 2:
                    System.out.println("bye bye");
                    break;
            }
            break;
        }
    }
}
