import java.util.Scanner;

public class challenge22 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Bitwise And operators");
        System.out.println("Enter the first number :");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number :");
        int num2 = sc.nextInt();

        int result = num1 | num2;
        System.out.println(result);
    }
}
