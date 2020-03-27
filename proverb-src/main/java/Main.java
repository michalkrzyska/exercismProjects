public class Main {

    public static void main(String[] args) {
        String[] slowa = new String[]{"nail", "shoe"};
        System.out.println(slowa.length);
        System.out.println(slowa[0]);
        System.out.println(slowa[1]);

        StringBuilder sb = new StringBuilder();
        switch (slowa.length) {

            case 0:
                break;
            case 1:
                System.out.println("And all for the want of a " + slowa[0] + ".");
            default:
                for (int i = 0; i < slowa.length-1; i++){
                    sb.append("For want of a ").append(slowa[i]).append(" the ").append(slowa[i + 1]).append("was lost.\n");
                    sb.append("And all for the want of a " + slowa[0] + ".");
                }
                System.out.println(sb.toString());

        }
    }
}
