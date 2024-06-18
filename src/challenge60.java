import java.util.Scanner;

public class challenge60 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to checker of Prime number");
        System.out.print("Enter the number :");
        int num = sc.nextInt();

        System.out.print("Your number is " +
                ((isPrime(num)) ? "Prime" : "Not Prime"));
    }

    public static boolean isPrime(int num) {
        for(int i =2; i<num; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
}
