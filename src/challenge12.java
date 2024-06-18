import java.util.*;

public class challenge12 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the principle :");
        double principle = sc.nextDouble();
        System.out.print("Enter the Time :");
        double Time = sc.nextDouble();
        System.out.print("Enter the Rate :");
        double  Rate = sc.nextDouble();

        double SimpleInterest = (principle * Time * Rate)/100;
        System.out.println("The value of simple interest :"+SimpleInterest);
    }
}
