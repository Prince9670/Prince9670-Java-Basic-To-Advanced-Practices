import java.util.Scanner;

public class challenge53 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Absolute Value");
        System.out.print("Please enter the number");
        int num = sc.nextInt();
        int result = num >=0 ? num : -num;
        System.out.println("Absolute value is " + result);
    }
}
