import java.util.Scanner;

public class challenge58 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = 5, guess;
        System.out.println("Welcome to number guess game");
        do{
            System.out.print("Please guess the number between 0 to 10 ");
            guess = sc.nextInt();
        } while (num != guess);
        System.out.println("You have successfully guess the number");
    }
}
