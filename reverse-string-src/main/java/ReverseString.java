class ReverseString {

    String reverse(String inputString) {
        if (inputString.isEmpty()) {
            return "";
        } else {
            StringBuilder sb = new StringBuilder();
            for (int i = inputString.length()-1; i > 0; i--) {
                sb.append(inputString.charAt(i));
            }
            sb.append(inputString.charAt(0));
            return sb.toString();
        }
    }
}