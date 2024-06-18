import java.util.Scanner;

public class challenge63 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("Enter your command");
            String command = sc.next();
            if (command.equalsIgnoreCase("exit")){
                break;
            }
        }
        System.out.println("You have successfully exited");
    }
}
