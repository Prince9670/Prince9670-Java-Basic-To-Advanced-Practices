import java.util.Scanner;

public class challenge67 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("welcome to fibonacci series");
        System.out.print("Enter the number of elements to print fibonacci");
        int count = sc.nextInt();
        for(int i=1; i<=count; i++){
            System.out.println(fibonacci(i) + " ");
        }
    }

    public static int fibonacci(int position){
        if(position == 1){
            return 0;
        }
        if(position == 2){
            return 1;
        }
        return fibonacci(position -1) + fibonacci(position - 2);
    }
}
