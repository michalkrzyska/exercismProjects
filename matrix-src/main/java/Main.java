import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {
        String matrixString = "1 1 1 1 1\n2 2 2 2 2\n3 3 3 3 3";
        Matrix matrix = new Matrix(matrixString);
        System.out.println(matrixString);
        int[][] mat = matrix.tokenizer(matrix.getMatrixAsString());
        int x = mat[0][2];
//        System.out.println(Arrays.toString(matrix.getRow(3)));
        System.out.println(Arrays.toString(matrix.getColumn(2)));

        System.out.println(Arrays.toString(mat[2]));





//        StringTokenizer stRows = new StringTokenizer("1 2 3\n3 4 5\n6 7 8", "\n");
//        System.out.println(stRows.countTokens());
//        StringTokenizer stColumns = new StringTokenizer(stRows.nextToken(), " ");
        StringTokenizer allElements = new StringTokenizer("1 2 3\n4 5 8\n7 8 9".replaceAll("\n"," "), " ");
//        while (allElements.hasMoreTokens()){
//            System.out.println(Integer.parseInt(allElements.nextToken() )+ " main print");
//        }
//
//    }
    }
}
