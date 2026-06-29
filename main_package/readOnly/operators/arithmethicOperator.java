package main_package.readOnly.operators;
 

public class arithmethicOperator {
    public static void arithmethic_Operator_readOnly() {
        //Arithmetic Operators
        System.out.println("Integer: 10 + 25 = " + (10 + 25)); //35
        System.out.println("Subtraction: 4 - 10 = " + (10 - 4)); // 6
        System.out.println("Multiplication: 5 * 5 = " + (5 * 5)); // 25
        System.out.println("Division: 8 / 2 = " + (8 / 2)); // 4
        System.out.println("Modulo: 10 % 3 = " + (10 % 3)); // 1
        
        //Unary Operators
        //Increement and Decreement: Plus 1, Minus 1 
        //commonly use for loops like timer
        int ExampleNumber = 5;
        System.out.println("Increement: ExampleNumber++ = " + (ExampleNumber++));
        System.out.println("Decreement: ExampleNumber-- = " + (ExampleNumber--));
    
        //example of increement: timer
        for (int timer = 0; timer < 10; timer++) {
            System.out.println(timer);
        }

        System.out.println();//spacer

        //example of decreement: countdown
        for (int count = 10; count > 0; count--) {
            System.out.println(count);
        }


    }
}
