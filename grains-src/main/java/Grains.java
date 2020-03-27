import java.math.BigInteger;

class Grains {


    BigInteger grainsOnSquare(final int square) {

        if (square <= 0 || square > 64) {
            throw new IllegalArgumentException("square must be between 1 and 64");
        } else if (square < 32) {
            long grain = 1;
            for (int i = 1; i < square; i++) {
                grain *= 2;
            }
            return BigInteger.valueOf(grain);
        } else {
            BigInteger grain = BigInteger.valueOf(1L);
            for (int i = 1; i < square; i++) {
                grain = grain.multiply(BigInteger.valueOf(2L));
            }
            return grain;
        }
    }

    BigInteger grainsOnBoard() {
        BigInteger grain = BigInteger.valueOf(1L);
        BigInteger total = BigInteger.valueOf(0);

        for (int i = 1; i <= 64; i++) {
            total = total.add(grain);
            grain = grain.multiply(BigInteger.valueOf(2L));
        }
        return total;
    }

}

