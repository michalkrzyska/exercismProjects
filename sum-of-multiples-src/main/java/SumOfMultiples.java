import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class SumOfMultiples {

    private int number;
    private int[] set;
    private int sum;

    public SumOfMultiples(int number, int[] set) {
        this.number = number;
        this.set = set;
        this.sum = getSum();
    }

    int getSum() {
        int size = set.length;
        Set<Integer> newSet = new HashSet<>();
        for (int i = 0; i < size; i++) {
            newSet.addAll(setOfMultiples(number, set[i]));
        }
        int sum = 0;
        for (int i : newSet) {
            sum += i;
        }
        return sum;
    }


    static Set<Integer> setOfMultiples(int i, int j) {
        Set<Integer> set = new HashSet<>();
        if (j == 0) {
            return set;
        }
        int temp = j;
        while (temp < i) {
            set.add(temp);
            temp += j;
        }
        return set;
    }
}
