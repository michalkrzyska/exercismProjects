public class Main {

    public static void main(String[] args) {
        for (int i = 0; i < 2000; i++){
            Allergies allergies = new Allergies(i);
            System.out.println(allergies.getList());
        }
    }
}
