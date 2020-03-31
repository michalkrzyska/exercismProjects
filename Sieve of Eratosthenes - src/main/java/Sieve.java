import java.util.ArrayList;
import java.util.List;

class Sieve {

    private int maxPrime;

    public Sieve(int maxPrime) {
        this.maxPrime = maxPrime;
    }

    List<Integer> getPrimes() {
        List<Integer> allNumbers = new ArrayList<>();

        if (maxPrime < 2) {
            return allNumbers;
        }
        for (int i = 2; i <= maxPrime; i++) {
            allNumbers.add(i);
        }

        List<Integer> copy = new ArrayList<>(allNumbers);
        for (int i = 2; i < maxPrime / 2; i++) {
            int number = i;
            if (allNumbers.contains(i + i)) {
                while (number < maxPrime) {
                    number += i;
                    if (copy.contains(number)) {
                        copy.remove((Integer) number);
                    }
                }
            }
        }
        return copy;
    }

}
