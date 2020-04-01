import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

class KindergartenGarden {


    private String garden;
    private List<String> students = Arrays.asList("Alice", "Bob", "Charlie", "David",
            "Eve", "Fred", "Ginny", "Harriet",
            "Ileana", "Joseph", "Kincaid", "Larry");

    KindergartenGarden(String garden) {
        this.garden = garden;
    }

    List<Plant> getPlantsOfStudent(String student) {
        List<Plant> studentsPlants = new ArrayList<>();

        if (students.contains(student)) {
            int index = students.indexOf(student)*2;
            String[] stringSplit = garden.split("\n");
            char[][] plantsInRows = new char[2][stringSplit[0].length()];

            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < stringSplit[0].length(); j++) {
                    plantsInRows[i][j] = stringSplit[i].charAt(j);
                }
            }

            char[] plantsOfStudent = new char[4];
            int counter = 0;
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    plantsOfStudent[counter] = plantsInRows[i][index + j];
                    counter++;
                }
            }
            for (char c : plantsOfStudent) {
                switch (c) {
                    case 'G':
                        studentsPlants.add(Plant.GRASS);
                        break;
                    case 'C':
                        studentsPlants.add(Plant.CLOVER);
                        break;
                    case 'R':
                        studentsPlants.add(Plant.RADISHES);
                        break;
                    case 'V':
                        studentsPlants.add(Plant.VIOLETS);
                        break;
                }
            }
        } else {
            return new ArrayList<>();

        }
        return studentsPlants;
    }

}


