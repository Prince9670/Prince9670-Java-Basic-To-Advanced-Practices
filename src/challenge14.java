import java.util.*;

public class challenge14 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Temperature Conversion :");
        System.out.print("Enter the value of Fahrenheit :");
        float Fahrenheit = sc.nextFloat();
        float celsius =  (Fahrenheit - 32)* 5/9;
        System.out.println("The value of celsius is : "+ celsius +"c");
    }
}
