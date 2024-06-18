import java.util.Scanner;

public class challenge20 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to age Portal");
        System.out.println("Enter The age of a person :");
        int age = sc.nextInt();

        if(age >= 60){
            System.out.println("you are a senior citizen");
        }else if(age >= 20){
            System.out.println("You are an Adult");
        }else if(age >= 13){
            System.out.println("you are an Teen");
        }
    }
}
