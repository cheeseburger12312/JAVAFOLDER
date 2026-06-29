package main_package.readOnly.operators;

public class logical {
    public static void main(String[] args) {
        String userName = "admin1";
        String password = "12345678";
        
        // FIX: Removed the semicolons from the format string so it matches the terminal look
        String ifElse = """
        ============================================================
        Logical: and / &&
                if (userName.equals("admin") && password.equals("12345678")) {
                    System.out.println("User: %s");
                    System.out.println("Password: %s");
                }

                --Terminal--
                User: %s
                Password: %s
        ============================================================
                """;

        boolean hasKey = true;
        boolean hasLockPick = false;
        String openChest = """
        ============================================================
        Logical: or / ||
                if (hasKey || hasLockPick) {
                    System.out.println("User opened the chest");
                }
                
                --Terminal--
                User opened the chest
        ============================================================
                """;

        boolean IsOnline = true;
        String StatusColor = "Green"; 
        
        String StatusCheck = """
        ============================================================
        Logical: not / !
                System.out.println("Name: %s");
                if (IsOnline) {
                    System.out.println("User Status Color: %s");
                }
                if (!IsOnline) {
                    System.out.println("User Status Color: %s");
                }
                
                --Terminal--
                Name: %s
                User Status Color: %s
        ============================================================
                """;

        // FIX: Changed "admin" to "admin1" so this block actually runs!
        if (userName.equals("admin1") && password.equals("12345678")) { 
            System.out.println(String.format(ifElse, userName, password, userName, password));
        }

        System.out.println(); //spacer

        if (hasKey || hasLockPick) {
            System.out.println(openChest);
        }

        System.out.println();

        if (!IsOnline) { 
            StatusColor = "Red";
            // FIX: Passed 5 arguments to match the updated placeholders
            System.out.println(String.format(StatusCheck, userName, "Green", "Red", userName, StatusColor));   
        } 
        if (IsOnline) {
            StatusColor = "Green";
            System.out.println(String.format(StatusCheck, userName, "Green", "Red", userName, StatusColor));   
        }
    }
}
