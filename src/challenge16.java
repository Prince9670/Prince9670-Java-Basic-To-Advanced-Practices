import java.util.Scanner;

public class challenge16 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Checking wheather the number is odd or even ");
        System.out.print("enter the Number :");
        int num = sc.nextInt();

        if(num % 2 == 0){
            System.out.println("The number is even");
        }else {
            System.out.println("The number is odd");
        }
    }
}
