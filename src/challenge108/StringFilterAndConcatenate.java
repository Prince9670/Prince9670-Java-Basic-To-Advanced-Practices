package challenge108;

import java.util.List;

public class StringFilterAndConcatenate {

    public static void main(String[] args) {
        List<String> names = List.of("Prince Kaushal", "is a good Boy", "Because he is hard Working");
        String result = names.stream().filter(name -> name.length() > 18).
                reduce("", (a,b) -> a + "" + b);

        System.out.println(result);
    }
}
