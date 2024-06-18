import java.util.Scanner;

public class challenge56 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to calculator\n");
        System.out.print("Please enter your first number");
        int num1 = sc.nextInt();
        System.out.print("Please enter your Second number");
        int num2 = sc.nextInt();
        System.out.print("Now, enter the operation: ");
        String operation = sc.next();

        int result = switch (operation) {
            case "+" -> num1 + num2;
            case "-" -> num1 - num2;
            case "*" -> num1 * num2;
            case "/" -> num1 / num2;
            default -> -1;
        };

        System.out.println("Your answer is " + operation);
    }
}
