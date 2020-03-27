import java.util.ArrayList;
import java.util.List;

class PrimeCalculator {

    int nth(int nth) {
        if (nth <= 0) {
            throw new IllegalArgumentException();
        } else if (nth == 1) {
            return 2;
        } else if (nth == 2) {
            return 3;
        }
        int counter = 2;
        int next = 5;

        while (nth > counter) {
            boolean isPrime = isPrime(next);

            if (isPrime) {
                counter++;
            }
            if (nth == counter) {
                return next;
            }
            next += 2;
        }
        return -1;
    }


    boolean isPrime(int n) {
        for (int i = 2; i < (n / 2) + 1; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}