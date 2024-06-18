import java.util.Scanner;

public class challenge15 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of checking");
        System.out.print("Please enter your number :");
        int num = sc.nextInt();

        if(num > 0){
            System.out.println("Number is positive ");
        }else if(num == 0){
            System.out.println("Number is Zero ");
        }else {
            System.out.println("Number is negative ");
        }
    }
}
