import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        String myString = "a b c d e";
        RotationalCipher rotationalCipher = new RotationalCipher(325);
        System.out.println(rotationalCipher.wrapChar('b',rotationalCipher.shiftKey));
    }
}
