class CollatzCalculator {

    int computeStepCount(int start) {
        if (start > 0) {
            int n = start;
            int counter = 0;
            while (n != 1) {
                if (n % 2 == 0) {
                    n = n / 2;
                    counter++;
                } else {
                    n = 3 * n + 1;
                    counter++;
                }
            }
            return counter;
        } else {
            throw new IllegalArgumentException("Only natural numbers are allowed");
        }
    }
}
