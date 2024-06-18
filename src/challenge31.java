import java.util.*;

public class challenge31 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to sum of Natural number :");
        System.out.print("Enter the number for sum :");
        int num = sc.nextInt();
        int sum = sumOfDigit(num);
        System.out.println("Sum of digit :"+ sum);

    }
    public static int sumOfDigit(int num){
        int sum = 0;
        while(num > 0){
            sum = sum + (num % 10);
            num = num/10;
        }
        return sum;
    }
}
