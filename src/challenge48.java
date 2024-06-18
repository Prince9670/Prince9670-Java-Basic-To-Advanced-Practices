import java.util.Scanner;

public class challenge48 {

    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to 2D Search");
        int[][] numArr = ArrayUtility.input2DArray();
        System.out.println("Now enter the number you want to search");
        int num = sc.nextInt();
        boolean isFound = search(numArr, num);
        if(isFound){
            System.out.println("Your number was Found");
        }else {
            System.out.println("Your number was not Found");
        }
    }

    public static boolean search(int[][] numArr, int num){
        int i = 0;
        while(i < numArr.length) {
            int j = 0;
            while (j < numArr[i].length) {
                if (numArr[i][j] == num) {
                    return true;
                }
                j++;
            }
            i++;
        }
        return false;
    }
}
