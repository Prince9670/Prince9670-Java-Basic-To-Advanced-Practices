import java.util.*;

public class challenge32 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to LCM :");
        System.out.print("Please Enter your First Number :");
        int First = sc.nextInt();
        System.out.print("Please Enter your Second Number :");
        int Second = sc.nextInt();
        int lcm = leastCommonFactor(First, Second);
        System.out.println("LCM of the two number is "+ lcm);
    }
    public static int leastCommonFactor(int First, int Second){
        int i = 1;
        while(true) {
            int factor = First * i;
            if (factor % Second == 0) {
                return factor;
            }
            i++;
        }
    }
}
