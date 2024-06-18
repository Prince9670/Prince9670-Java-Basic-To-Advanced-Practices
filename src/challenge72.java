public class challenge72 {

    int roll() {
        double random = Math.random() * 6;
        return (int) Math.ceil(random);
    }

    public static void main(String[] args) {
        challenge72 dice = new challenge72();
        System.out.println(dice.roll());

    }
}
