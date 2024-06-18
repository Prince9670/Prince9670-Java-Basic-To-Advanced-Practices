import java.util.Scanner;

public class challenge68 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("welcome to palindrome checker");
        System.out.println("Enter the string to be checked: ");
        String str = sc.next();
        System.out.println("Your String is " + ((isPalindrome(str)
         ? "Palindrome" : "Not Palindrome")));

    }

    public static boolean isPalindrome(String str){
        if(str.length() <= 1){
            return true;
        }
        int lasPos = str.length() -1;
        if(str.charAt(0) == str.charAt(lasPos)){
            return false;
        }
        String newStr = str.substring(1, lasPos);
        return isPalindrome(newStr);
    }
}
