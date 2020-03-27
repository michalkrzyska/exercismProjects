public class Main {

    public static void main(String[] args) {

        checker("isogram");
    }

    public static void checker (String newString) {
        for (int i = 0; i < newString.length() ; i++) {
            for (int j = i + 1; j < newString.length(); j++) {
                    System.out.println(newString.charAt(i) + "-----" + newString.charAt(j));

            }
        }

    }

}
