import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Item item1 = new Item(10, 100, "1 waza ");
        Item item2 = new Item(20, 110, "2 dupa ");
        Item item3 = new Item(40, 120, "3 kolo ");
        Item item4 = new Item(40, 130, "4 rolo ");
        Item item5 = new Item(50, 140, "5 bolo ");
        Item item6 = new Item(50, 140, "6 ziom ");
        Item item7 = new Item(50, 140, "7 skat ");

        List<Item> listItem1 = new ArrayList<>();
        listItem1.add(item1);
        listItem1.add(item2);
        listItem1.add(item3);
        listItem1.add(item4);
        listItem1.add(item5);
        listItem1.add(item6);
        listItem1.add(item7);

        List<Item> listItem2 = new ArrayList<>();
        listItem2.add(item5);
        listItem2.add(item6);
        listItem2.add(item7);

        List<List<Item>> listOfLists = new ArrayList<>();
        listOfLists.add(listItem1);
        listOfLists.add(listItem2);
//        listOfLists.forEach((list) -> {
//            list.forEach((item) -> System.out.println(item));
//        });

        Knapsack knapsack = new Knapsack();
        knapsack.maximumValue(400, listItem1);

        List<Item> data = new ArrayList<>();

//        int n = listItem1.size();
//        for (int r = 1; r <= listItem1.size(); r++) {
////            printCombination(listItem1, n, r);
//            System.out.println("         " + combinationUtil(listItem1, data, 0, n - 1, 0, r).size());
//        }
//
//    }

//    static List<List<Item>> combinationUtil(List<Item> itemList, List<Item> data, int start, int end, int index, int r) {
//        List<List<Item>> listOfLists = new ArrayList<>();
//        List<Item> tempList = new ArrayList<>();
//        if (index == r) {
//            for (int j = 0; j < r; j++) {
////                System.out.print(data.get(j) + " ");
//                tempList.add(data.get(j));
//            }
//            listOfLists.add(List.copyOf(tempList));
//            tempList.clear();
//            System.out.println("");
//            listOfLists.forEach((list) -> {
//                list.forEach((item) -> System.out.print(item + " ---"));
//            });
//            return listOfLists;
//        }
//        for (int i = start; i <= end && end - i + 1 >= r - index; i++) {
//            data.add(index, itemList.get(i));
//            combinationUtil(itemList, data, i + 1, end, index +1, r);
//        }
//        return listOfLists;
//    }
//
//
//    static void printCombination(List<Item> list, int n, int r) {
//        // A temporary array to store all combination one by one
//        List<Item> data = new ArrayList<>(list);
//        combinationUtil(list, data, 0, n - 1, 0, r);
//    }

    }

}
