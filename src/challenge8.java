import java.util.*;

public class challenge8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number :");
        int a = sc.nextInt();
        System.out.println("Enter the second number :");
        int b = sc.nextInt();

        int add = a+b;
        System.out.println(add);
        int sub = a-b;
        System.out.println(sub);
        int mul = a*b;
        System.out.println(mul);
        int div = a/b;
        System.out.println(div);
        int mod = a%b;
        System.out.println(mod);
    }
}
