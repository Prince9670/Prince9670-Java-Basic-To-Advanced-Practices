import java.util.Scanner;

public class challenge35 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Reverse a Digit ");
        System.out.print("Enter the digit you want to reverse :");
        int num = sc.nextInt();
        int reverse = reverse(num);
        System.out.println("The reverse of the Digit is :"+reverse);

    }
    public static int reverse(int num){
        int newNum = 0;
        while(num > 0){
            int digit = num % 10;
            newNum = newNum * 10 + digit;
            num /= 10;
        }
        return newNum;
    }
}
