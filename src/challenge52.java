import java.util.Scanner;

public class challenge52 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to checker of odd and even number");
        System.out.print("Enter the number :");
        int num = sc.nextInt();
        int oddOrEven = oddOrEven(num);

    }

    public static int oddOrEven(int num){
        if(num % 2 == 0){
            System.out.println("even");
        }else {
            System.out.println("odd");
        }
        return 0;
    }
}
