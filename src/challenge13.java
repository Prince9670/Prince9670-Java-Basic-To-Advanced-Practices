import java.util.*;

public class challenge13 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of principle :");
        double principle = sc.nextDouble();
        System.out.print("Enter the value of Rate :");
        double Rate = sc.nextDouble();
        System.out.print("Enter the value of time :");
        double Time = sc.nextDouble();

        double compoundInterest = principle*(1+Rate)*Time/100;
        System.out.println("The value of compound interest is :"+ compoundInterest);
    }
}
