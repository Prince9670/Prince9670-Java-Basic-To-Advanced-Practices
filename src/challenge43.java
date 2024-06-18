import java.util.Scanner;

public class challenge43 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Sorting");
        int[] numArr = ArrayUtility.inputArray();
        boolean isInc = isIncreasing(numArr);
        boolean isDec = isDecresing(numArr);
        if(isInc || isDec){
            System.out.println("Your Array is Sorted");
        }else{
            System.out.println("Your Array is not Sorted");
        }
    }

    public static boolean isIncreasing(int[] numArr){
        int i =1;
        while(i < numArr.length){
            if(numArr[i] < numArr[i-1]){
                return false;
            }
            i++;
        }
        return true;
    }

    public static boolean isDecresing(int[] numArr){
        int i =1;
        while(i < numArr.length){
            if(numArr[i] > numArr[i-1]){
                return false;
            }
            i++;
        }
        return true;
    }
}
