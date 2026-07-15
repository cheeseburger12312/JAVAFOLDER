package main_package.readOnly.operators;


public class assignment {
    public static void /*Assignment()*/ main (String[] arg){
        //Assignemnt
        int x = 5;
        System.out.println("= \nExample: x = 5");
        System.out.println("\n+= \nExample: x += 9 = " + (x += 9));
        System.out.println("\n-= \nExample: x -= 5 = " + (x -= 5));
        System.out.println("\n*= \nExample: x *= 3 = " + (x *= 3));
        System.out.println("\n/= \nExample: x /= 2 = " + (x /= 2));
        System.out.println("\n%= \nExample: x %= 4 = " + (x %= 4));
        System.out.println("\n&= \nExample: x &= 2 = " + (x &= 2));
        System.out.println("\n|= \nExample: x |= 5 = " + (x |= 5));
        System.out.println("\n^= \nExample: x ^= 9 = " + (x ^= 9));
        System.out.println("\n>>= \nExample: x >>= 7 = " + (x >>= 3));
        System.out.println("\n<<= \nExample: x <<= 4 = " + (x <<= 2));

        int a = 50;
        int y = 100;
        System.out.println(a /= ++y); 
    }
}
