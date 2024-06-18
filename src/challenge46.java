import java.util.Scanner;

public class challenge46 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome To Palindrome Number ");
        int[] numArr = ArrayUtility.inputArray();
        boolean isPalin = isPalindrome(numArr);
        if(isPalin){
            System.out.println("Your array is Palindrome");
        }else{
            System.out.println("Your array is not Palindrome");
        }
    }
    public static boolean isPalindrome(int[] numArr) {
        int i = 0;
        while(i < numArr.length/2){
            if(numArr[i] != numArr[numArr.length - 1 - i]){
                return false;
            }
            i++;
        }
        return true;
    }
}
