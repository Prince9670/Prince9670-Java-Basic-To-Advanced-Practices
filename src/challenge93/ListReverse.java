package challenge93;

import java.util.*;

public class ListReverse {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8);
        System.out.println(list);
        reverse(list);
        System.out.println(list);
    }

    public static void reverse(List<Integer> list){
        Collections.reverse(list);
    }
}
