import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Robot {
    private String name;
    private static List<String> allNames = new ArrayList<>();

    public Robot() {
        this.name = nameGenerator();
        allNames.add(name);
    }

    public String getName() {
        return name;
    }

    public static List<String> getAllNames() {
        return allNames;
    }

    private String nameGenerator() {
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 2; i++) {
            char c = (char) (random.nextInt(26) + 'A');
            sb.append(c);
        }
        for (int i = 0; i < 3; i++) {
            int x = random.nextInt(9);
            sb.append(x);
        }
        System.out.println(sb.toString());
        return sb.toString();

    }

    public void reset() {
        String temp = this.name;
        while (temp.equals(this.name) || allNames.contains(temp)) {
            temp = nameGenerator();
        }
        this.name = temp;
    }
}