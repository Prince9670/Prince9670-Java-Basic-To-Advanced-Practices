import java.util.Scanner;

public class challenge57 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Password Checker");
        String password;
        do {
            System.out.print("Enter the Password :");
            password = sc.next();
        }while (!isValidPassword(password));
        System.out.println("Thanks for entering the valid password");
    }

    public static boolean isValidPassword(String Password){

        return Password.length() > 6;
    }
}
