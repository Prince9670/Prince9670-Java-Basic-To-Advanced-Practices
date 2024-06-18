package challenge87;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to calculator\n");
        System.out.println("Enter the first number");
        int first = sc.nextInt();
        System.out.println("Now, the second number");
        int second = sc.nextInt();

        try{
            int result = first / second;
//            System.out.print("Result is %d");
        }catch (ArithmeticException exception){
            if(exception.getMessage().equals("/ by zero")){
                System.out.println("Divide By Zero occured");
            }else {
                throw exception;
            }
        }
    }
}
