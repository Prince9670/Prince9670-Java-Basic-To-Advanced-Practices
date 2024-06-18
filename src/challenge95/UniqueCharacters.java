package challenge95;
import java.util.*;

public class UniqueCharacters {

    public static void main(String[] args) {

        Set<Character> unique = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your String");
        String userStr = sc.next();

        for(char ch: userStr.toCharArray()){
            unique.add(ch);
        }

        System.out.printf("Your String has %d unique characters", unique.size());
    }
}
