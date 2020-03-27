import java.util.ArrayList;
import java.util.List;

class NaturalNumber {

    private int number;

    public NaturalNumber(int number) {
        if (number <= 0) { throw new IllegalArgumentException("You must supply a natural number (positive integer)"); }
        this.number = number;
    }

    public Classification getClassification() {
        if (number == 1) {
            return Classification.DEFICIENT;
        } else {
            List<Integer> dividers = new ArrayList<>();
            for (int i = number - 1; i > 1; i--) {
                if (number % i == 0) {
                    dividers.add(i);
                }
            }
            dividers.add(1);

            int sum = 0;
            for (int i : dividers) {
                sum += i;
            }
            if (sum == number) {
                return Classification.PERFECT;
            } else if (sum > number) {
                return Classification.ABUNDANT;
            } else {
                return Classification.DEFICIENT;
            }
        }
    }
}
