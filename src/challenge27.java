import java.sql.SQLOutput;
import java.util.Scanner;

public class challenge27 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to odd and even Calculator");
        System.out.print("Enter the number :");
        int num = sc.nextInt();

        if( (num & 1) ==1 ){
            System.out.println("Number is odd");
        }else{
            System.out.println("Number is even");
        }
    }
}
