import java.util.*;

public class challenge30 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Factorial ");
        System.out.print("Enter Number for factorial :");
        int num = sc.nextInt();
        long fac = Factorial(num);
        System.out.println("Factorial is :" + fac);
    }
    public static long Factorial(int num){
        if(num < 2){
            return 1;
        }
        long fac = 1;
        int i = 2;
        while(i<=num){
            fac *= i;
            i++;
        }
        return fac;
    }
}
