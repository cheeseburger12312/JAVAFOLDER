package main_package.readOnly.operators;

public class comparison {
    public static void main(String[] args) {
        int x = 5, y = 5;
        System.out.println("Equal to: == \nExample: x == y");
        if (x == y) {System.out.println("x and y are equal\n");} 
        else {System.out.println("x and y are not equal\n");}
        
        y = 4;
        System.out.println("Not equal to: != \nExample: x != y");
        if (x != y) {System.out.println("x and y are not equal\n");} 
        else {System.out.println("x and y are equal\n");}
        
        x = 7;
        System.out.println("Greater than: > \nExample: x > y");
        if (x > y) {System.out.println("x is greater than y\n");} 
        else {System.out.println("x is less than y\n");}

        x = 2;
        System.out.println("Less than: < \nExample: x < y");
        if (x > y) {System.out.println("x is less than y\n");} 
        else {System.out.println("x is greater than y\n");}

        x = 4;
        System.out.println("Greater than or Equal: >= \nExample: x >= y");
        if (x >= y) {System.out.println("x is Greater than or Equal to y\n");} 
        else {System.out.println("x is Less than or Equal to y\n");}

        x = 2;
        System.out.println("Less than or Equal: <= \nExample: x <= y");
        if (x <= y) {System.out.println("x is Less than or Equal to y\n");} 
        else {System.out.println("x is Greater than or Equal to y\n");}
    }
}
