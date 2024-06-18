import java.util.*;

public class swapnumber {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("enter the first number :");
        int a = sc.nextInt();
        System.out.print("enter the second number :");
        int b = sc.nextInt();

        int c = a;
        a = b;
        b = c;

        System.out.println("Value of A is "+ a);
        System.out.println("Value of B is "+ b);
    }
}
