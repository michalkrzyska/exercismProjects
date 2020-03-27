import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Allergies {

    private int score;
    private List<Allergen> listOfAllergens;


    public Allergies(int score) {
        this.score = score;
        this.listOfAllergens = checkAllergens(score);
    }

    public boolean isAllergicTo(Allergen allergen) {
        return this.listOfAllergens.contains(allergen);
    }

    public int getScore() {
        return score;
    }

    public List<Allergen> getList() {
        return listOfAllergens;
    }

    public int findLevel(int score) {
        int level = 1;
        int power = 0;
        if (score == 2) {
            return 1;
        } else {
            while (score >= level) {
                level *= 2;
                power++;
                if (score - level == 1) {
                    return power;
                }
            }
        }
        return power - 1;
    }

    public List<Allergen> checkAllergens(int score) {
        List<Allergen> allergens = new ArrayList<>();
        int level = findLevel(this.score);
        double subtractor = Math.pow(2, level);
        int i = 0;
        int[] numbers;

        if (score < 9) {
            numbers = new int[3];
        } else {
            numbers = new int[level + 1];
        }

        if (score == 1) {
            allergens.add(Allergen.EGGS);
        } else if (score == subtractor) {
            numbers[i] = (int) subtractor;
        } else {
            if (score % 2 != 0) {
                score--;
                numbers[i] = 1;
                i++;
            }
                while (score >= 2) {
                    score -= subtractor;
                    numbers[i] = (int) subtractor;
                    subtractor = Math.pow(2, findLevel(score));
                    i++;
                }

            Arrays.sort(numbers);

        }
        for (int number : numbers) {
            switch (number) {
                case 1:
                    allergens.add(Allergen.EGGS);
                    break;
                case 2:
                    allergens.add(Allergen.PEANUTS);
                    break;
                case 4:
                    allergens.add(Allergen.SHELLFISH);
                    break;
                case 8:
                    allergens.add(Allergen.STRAWBERRIES);
                    break;
                case 16:
                    allergens.add(Allergen.TOMATOES);
                    break;
                case 32:
                    allergens.add(Allergen.CHOCOLATE);
                    break;
                case 64:
                    allergens.add(Allergen.POLLEN);
                    break;
                case 128:
                    allergens.add(Allergen.CATS);
                    break;
            }
        }
        return allergens;
    }

}