package challenge82;

public class ArrayOperation {

    private int[] numbers;

    public class Statistics {
        double mean() {
            long sum = 0;
            for(int number : numbers){
                sum += number;
            }
            return sum / numbers.length;

        }

        double median() {

            return 0;
        }
    }
}
