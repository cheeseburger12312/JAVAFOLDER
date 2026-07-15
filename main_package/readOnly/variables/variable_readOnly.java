package main_package.readOnly.variables;

public class variable_readOnly {
    public static void dataType_readOnly_method() {
        String productName = "apple";
        int itemCount = 1;
        float itemPrice = 5.99f;
        char productGrade = 'A';
        boolean isForSale = true;

        System.out.printf("Product Name: %s%n", productName);
        System.out.printf("Item Count:  %d%n", itemCount);
        System.out.printf("%s price: %.2f%n", productName, itemPrice);
        System.out.printf("Product Grade: %c%n", productGrade);
        System.out.printf("Is the product for sale? %b%n", isForSale);
    }
}
