class Hamming {

    private String leftStrand;
    private String rightStrand;
    private int hammingDistance;

    Hamming(String leftStrand, String rightStrand) {
        if (leftStrand.equals("") && rightStrand.equals("")){
            hammingDistance = 0;
        } else if (leftStrand.isEmpty()) {
            throw new IllegalArgumentException("left strand must not be empty.");
        } else if (rightStrand.isEmpty()) {
            throw new IllegalArgumentException("right strand must not be empty.");
        }

        if (rightStrand.length() > leftStrand.length()) {
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        }
        if (rightStrand.length() < leftStrand.length()) {
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        }
        for (int i = 0; i < leftStrand.length(); i++) {
            if (leftStrand.charAt(i) != (rightStrand.charAt(i))) {
                hammingDistance++;
            }
        }

    }


    int getHammingDistance() {
        return hammingDistance;
    }
}

