class RotationalCipher {

    int shiftKey;

    RotationalCipher(int shiftKey) {
        this.shiftKey = shiftKey;
    }

    String rotate(String data) {
        StringBuilder sb = new StringBuilder();
        for (char character : data.toCharArray()) {
            sb.append(wrapChar(character, shiftKey));
        }
        return sb.toString();
    }

    char wrapChar(char input, int amount) {
        char start = 'A';

        if (('a' <= input) && (input <= 'z')) {
            start = 'a';
        } else if (!(('A' <= input) && (input <= 'Z'))) {
            return input;
        }

        int offset = ((input - start) + amount) % 26;
        return ((char) (start + offset));
    }
}


