public class e {
    public static void main(String[] args) { //ternary //condition ? true : false
    double money = 500;
    double price = 350;
    //choice: true or false
    System.out.println(
        (++money > price || ++money > ++price)
            ? (money > price && price < money)
                ? (++money > 3 && ++money <= 1000)
                    ? (--money >= 3)
                        ? ((++money <= 1000 || --money <= 1000)
                                ? false
                            : true)
                        ? "true"
                    : "false"
                : "false"
            : "false"
        : "false"
    : "false"
    );
    // System.out.println(money > price-- && ++money < price-- );
    // System.out.println(++price <= money|| ++money == price);
    // System.out.println(money > ++price || --price <= ++money);
    // System.out.println(++price > money && --price <= ++money);


    }
}   