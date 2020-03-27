public class Main {

    public static void main(String[] args) {
        Hamming hamming = new Hamming("GGACGGATTCTG", "GGACGGATTCTG");
        System.out.println(hamming.getHammingDistance());
        check();
    }

    public static void check() {
        String leftStrand = "GGACGGATTCTG";
        String rightStrand = "GGACGGATTCTG";
        int count =0;

        for (int i = 0; i < leftStrand.length(); i++) {
            if (leftStrand.substring(i).equals(rightStrand.substring(i))) {
                System.out.println(leftStrand.charAt(i) + "------" + rightStrand.charAt(i));
            } else {
                count++;
                System.out.println(count);

            }
        }

    }
}
