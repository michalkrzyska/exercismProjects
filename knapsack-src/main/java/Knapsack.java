import java.util.ArrayList;
import java.util.List;

class Knapsack {

    public int maximumValue(int maxWeight, List<Item> items) {
        int n = items.size();
        int w = maxWeight;
        int[] value = new int[n];
        int[] weight = new int[n];

        for (int i = 0; i < n; i++) {
            value[i] = items.get(i).getValue();
            weight[i] = items.get(i).getWeight();
        }
        int[][] mat = new int[n + 1][w + 1];
        for (int r = 0; r < w + 1; r++) {
            mat[0][r] = 0;
        }
        for (int c = 0; c < n + 1; c++) {
            mat[c][0] = 0;
        }
        for (int item = 1; item <= n; item++) {
            for (int capacity = 1; capacity <= w; capacity++) {
                int maxValWithoutCurr = mat[item - 1][capacity];
                int maxValWithCurr = 0;

                int weightOfCurr = weight[item - 1];
                if (capacity >= weightOfCurr) {
                    maxValWithCurr = value[item - 1];

                    int remainingCapacity = capacity - weightOfCurr;
                    maxValWithCurr += mat[item - 1][remainingCapacity];
                }
                mat[item][capacity] = Math.max(maxValWithoutCurr, maxValWithCurr);
            }
        }
        return mat[n][w];
    }
}

class Item {

    private int weight;
    private int value;
    private String name;

    public Item(int weight, int value) {
        this.weight = weight;
        this.value = value;
    }
    public Item(int weight, int value, String name) {
        this(weight, value);
        this.name = name;
    }
    public int getWeight() {
        return weight;
    }
    public int getValue() {
        return value;
    }
    public String getName() {
        return name;
    }

}