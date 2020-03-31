class CryptoSquare {

    private String input;

    public CryptoSquare(String input) {
        this.input = input;
    }

    public String getCiphertext() {

        String toCypher = clearText();

        if (input.isEmpty()) {
            return "";
        } else if (toCypher.length() == 1) {
            return toCypher;
        } else {
            int r = findRectangle()[0][0];
            int c = findRectangle()[0][1];
            int spaces = (r * c) - countLetters();
            StringBuilder sb = new StringBuilder(toCypher);

            for (int i = 0; i < spaces; i++) {
                sb.append(" ");
            }
            toCypher = sb.toString();

            char[][] cypherMatrix = new char[c][r];
            int index = 0;
            for (int i = 0; i < c; i++) {
                for (int j = 0; j < r; j++) {
                    cypherMatrix[i][j] = toCypher.charAt(index);
                    index++;
                }
            }

            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    stringBuilder.append(cypherMatrix[j][i]);
                }
                stringBuilder.append(" ");
            }
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
            return stringBuilder.toString();
        }
    }

    private int[][] findRectangle() {
        int[][] rectangle = new int[1][2];
        int closestSquare = 1;
        int length = countLetters();
        int number = 2;
        while (length >= closestSquare) {
            closestSquare *= closestSquare;
            if (closestSquare == length) {
                break;
            } else if (closestSquare <= length) {
                closestSquare = number;
                number++;
            }
        }
        number--;
        rectangle[0][0] = closestSquare / number;
        if (number * (number - 1) < length) {
            rectangle[0][1] = number;
        } else {
            rectangle[0][1] = number - 1;
        }
        return rectangle;
    }

    private String clearText() {
        return input.toLowerCase().replaceAll("[^a-z0-9]", "");
    }

    private int countLetters() {
        return clearText().length();
    }

    public String getInput() {
        return input;
    }
}