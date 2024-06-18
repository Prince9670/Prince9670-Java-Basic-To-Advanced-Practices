import java.util.Scanner;

public class challenge17 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Greatest of three Number ");
        System.out.println("Enter the first number :");
        double num1 = sc.nextDouble();
        System.out.println("Enter the second number :");
        double num2 = sc.nextDouble();
        System.out.println("Enter the third number :");
        double num3 = sc.nextDouble();

        if(num1 > num2 && num1 > num3){
            System.out.println(num1);
        }else if(num2 > num3 && num2 > num1) {
            System.out.println(num2);
        }else{
            System.out.println(num3);
        }
    }
}
