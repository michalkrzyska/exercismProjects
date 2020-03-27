import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {
        TwelveDays twelveDays = new TwelveDays();
        StringTokenizer stringTokenizer = new StringTokenizer(twelveDays.sing(), "\n");
        List<String> tokens = new ArrayList<>();
        while (stringTokenizer.hasMoreElements()) {
            tokens.add(stringTokenizer.nextToken());

        }
        for (String s : tokens) {
            System.out.println(s);

        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            sb.append(tokens.get(i));
            sb.append("\n\n");
        }
        System.out.println("_________________________________________________________");
        String kasza = "On the first day of Christmas my true love gave to me: " +
                "a Partridge in a Pear Tree.\n\n" +
                "On the second day of Christmas my true love gave to me: two Turtle Doves, " +
                "and a Partridge in a Pear Tree.\n\n" +
                "On the third day of Christmas my true love gave to me: three French Hens, two Turtle Doves, " +
                "and a Partridge in a Pear Tree.\n";
        System.out.println(kasza);
        System.out.println("_________________________________________________________");
        System.out.println(twelveDays.verses(1,3));
        System.out.println("_________________________________________________________");


    }
}
