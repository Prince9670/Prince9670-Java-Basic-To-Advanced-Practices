import java.util.Scanner;

public class challenge45 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Array Reversal");
        int[] numArr = ArrayUtility.inputArray();
        reverse(numArr);
        System.out.println("Your reverse Array is");
        ArrayUtility.displayArray(numArr);
    }

    public static void reverse(int[] arr){
        int i = 0;
        while(i < arr.length/2){
            int swap = arr[i];
            arr[i] = arr[(arr.length - 1) - i];
            arr[(arr.length-1) - i] = swap;
            i++;
        }
    }
}
