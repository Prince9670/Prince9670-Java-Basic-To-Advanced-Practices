import java.util.Scanner;

public class challenge51 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the minimum of Two Number");
        System.out.print("Enter the first Number");
        int a = sc.nextInt();
        System.out.print("Enter the second Number");
        int b = sc.nextInt();
        int minimum = minimun(a, b);

    }
    public static int minimun(int a, int b){
        if(a < b){
            System.out.println(a);
        }else {
            System.out.println(b);
        }
        return 0;
    }
}
