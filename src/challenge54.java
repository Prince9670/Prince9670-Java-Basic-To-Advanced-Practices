import java.util.Scanner;

public class challenge54 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Student Result");
        System.out.print("Please enter your marks: ");
        int marks = sc.nextInt();
        String category = marks > 80 ? "High" : (marks > 50 ? "Moderate" : "Low");
        System.out.println("Your category is :" + category);

    }
}
