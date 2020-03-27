public class Main {

    public static void main(String[] args) {
        String inputString = "12345678";
        System.out.println(inputString.length());
        StringBuilder sb = new StringBuilder();
        for (int i = inputString.length()-1; i > 0; i--){
            System.out.println(inputString.charAt(i));
            sb.append(inputString.charAt(i));
        }
        sb.append(inputString.charAt(0));
        System.out.println(sb);
    }

    public String reverse(String inputString) {
        StringBuilder sb = new StringBuilder();
        for (int i = inputString.length()+1; i > 0; i--){
            System.out.println(inputString.charAt(i));
            sb.append(inputString.charAt(i));
        }

        return sb.toString();
    }
}
