import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        String series = "918493904243";
        int noOfSlices = 5;

        List<String> slices = new ArrayList<>();
        int number = Integer.parseInt(series);
        int noOfTokens = series.length()-noOfSlices+1;

//        if (noOfSlices <= 0){
//            throw new IllegalArgumentException("Slice size is too small.");
//        }
//        if (number > noOfSlices || number == 0) {
//            throw new IllegalArgumentException("Slice size is too big.");
//        }

        for (int i = 0; i < noOfTokens; i++ ){
            System.out.println(series.substring(i, i + noOfSlices));
            slices.add(series.substring(i, i + noOfSlices));

        }

    }
}
