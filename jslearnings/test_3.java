import java.util.*;
public class test_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String password = sc.next();
            if (password.length() < 6) {
                System.out.println("WEAK");
                continue;
            }
            boolean lower = false;
            boolean upper = false;
            boolean digit = false;
            boolean special = false;
            for (int j = 0; j < password.length(); j++) {
                char ch = password.charAt(j);

                if (Character.isLowerCase(ch)) {
                    lower = true;
                }
                else if (Character.isUpperCase(ch)) {
                    upper = true;
                }
                else if (Character.isDigit(ch)) {
                    digit = true;
                }
                else {
                    special = true;
                }
            }
           
        }
    }
}