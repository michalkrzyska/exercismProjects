import java.util.*;
import java.util.stream.Collectors;

class Cipher {

    private String key;

    public Cipher() {
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i =0; i < 100; i++){
            char c = (char)(random.nextInt(26) + 'a');
            sb.append(c);
        }
        this.key=sb.toString();
        System.out.println(sb.toString());

    }

    public Cipher(String key) {
        this.key = key.toLowerCase();
    }

    public String getKey() {
        return key;
    }

    public String keyBuilder(String text) {
        if (key.length() < text.length()) {
            int x = ((text.length() - key.length()) / key.length()) + 1;
            StringBuilder sb = new StringBuilder(key);
            for (int i = 0; i < x; i++) {
                sb.append(key);
            }
            return sb.toString().substring(0, text.length());
        }
        return key;
    }

    public String encode(String plainText) {
        String keyCode = keyBuilder(plainText);
        int[][] charAndKey = new int[keyCode.length()][2];
        for (int i = 0; i < plainText.length(); i++) {
            int key = keyCode.charAt(i) - 97;
            int character = plainText.charAt(i);
            if (character + key > 122) {
                key = (character + key) - 122;
                character = 96;
            }
            charAndKey[i][0] = (char) character;
            charAndKey[i][1] = (char) key;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < plainText.length(); i++) {

            sb.append((char) (charAndKey[i][0] + (charAndKey[i][1])));
        }
        return sb.toString();

    }

    public String decode(String plainText) {
        String keyCode = keyBuilder(plainText);
        int[][] charAndKey = new int[keyCode.length()][2];
        for (int i = 0; i < plainText.length(); i++) {
            int key = 97 - keyCode.charAt(i);
            int character = plainText.charAt(i);
            if (character + key < 97) {
                key = key - 97 + character;
                character = 123;
            }
            charAndKey[i][0] = (char) character;
            charAndKey[i][1] = (char) key;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < plainText.length(); i++) {

            sb.append((char) (charAndKey[i][0] + (charAndKey[i][1])));
        }
        return sb.toString();
    }
}