import java.util.*;

public class challenge34 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Prime Number :");
        System.out.print("Enter the number :");
        int num = sc.nextInt();
        boolean primeNumber = primeNumber(num);
        if(primeNumber){
            System.out.println("Your number is prime");
        }else {
            System.out.println("Your number is not prime");
        }
    }
    public static boolean primeNumber(int num){
        int i =2;
        while(i < num){
            if(num % i == 0){
                return false;
            }
            i++;
        }
        return true;
    }
}
