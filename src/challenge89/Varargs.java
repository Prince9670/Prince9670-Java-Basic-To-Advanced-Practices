package challenge89;

public class Varargs {

    public static void main(String[] args) {
        System.out.println(concatenate("Prince"));

        System.out.println(concatenate("Prince", "Kaushal"));

        System.out.println(concatenate("subscribe", "toJava"));
    }

    public static String concatenate(String... strs) {

        StringBuilder sb = new StringBuilder();
        for(String str : strs){
            sb.append(str).append(" ");
        }
        return sb.toString();
    }
}
