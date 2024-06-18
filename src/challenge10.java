import java.util.*;

public class challenge10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a :");
        int a = sc.nextInt();
        System.out.print("Enter the value of b :");
        int b = sc.nextInt();
        System.out.print("Enter the value of c :");
        int c = sc.nextInt();
        System.out.print("Enter the value of d :");
        int d = sc.nextInt();


        int perimeterofrec = a+b+c+d;
        System.out.println("Value of perimeter is :"+perimeterofrec);
    }
}
