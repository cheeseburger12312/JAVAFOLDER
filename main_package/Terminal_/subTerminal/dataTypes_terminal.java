package main_package.Terminal_.subTerminal;

public class dataTypes_terminal {
    public static void DataType() {
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
