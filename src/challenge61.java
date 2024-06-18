import java.util.Scanner;

public class challenge61 {

    public static void main(String[] args) {
        int[] arr = ArrayUtility.inputArray();
        Scanner sc = new Scanner(System.in);

        int max = Integer.MIN_VALUE;
        for(int num: arr){
            if(max < num){
                max = num;
            }
        }
        System.out.println("Maximum number is :" + max);

    }
}
