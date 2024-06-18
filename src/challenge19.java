import java.util.Scanner;

public class challenge19 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Finding the grades of Student ");
        System.out.print("Enter the Number :");
        float percentage = sc.nextFloat();

        if(percentage >= 90){
            System.out.println("You got a grade A");
        }else if(percentage >= 75){
            System.out.println("You got a grade B");
        }else if(percentage >= 60){
            System.out.println("You got a grade C");
        }else if(percentage >=30){
            System.out.println("You got a grade D");
        }else {
            System.out.println("You got a grade F");
        }
    }
}
