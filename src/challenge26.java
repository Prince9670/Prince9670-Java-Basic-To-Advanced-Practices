import java.util.Scanner;

public class challenge26 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Bitwise And operators");
        System.out.println("Enter the your number :");
        int num = sc.nextInt();


        int result = num >> 1;
        System.out.println(result);
    }
}
