import java.util.*;

public class Main {
   static List<List<Integer>> values = new ArrayList<>(Arrays.asList(
            Arrays.asList(9, 8, 7),
            Arrays.asList(6, 3, 2),
            Arrays.asList(4, 6, 7)
    ));
    public static void main(String[] args) {
    }

    static int minElementOfColumn(int mat[][], int columnNumber, int rowCount){
        int minElement = mat[0][columnNumber-1];
        for (int i =0; i < rowCount; i++){
            if (minElement > mat[i][columnNumber-1]){
                minElement = mat[i][columnNumber-1];
            }
        }
        return minElement;
    }
    static int rowIndexOfMinElement(int mat[][], int columnNumber, int rowCount){
        int minElement = mat[0][columnNumber-1];
        int rowIndex = 0;
        for (int i =0; i < rowCount; i++){
            if (minElement > mat[i][columnNumber-1]){
                minElement = mat[i][columnNumber-1];
                rowIndex = i;
            }
        }
        return rowIndex;
    }



    static int maxElementOfRow(int mat[][], int rowNumber, int columnCount) {
        int maxElement =  mat[rowNumber-1][0];
            for (int i = 0; i < columnCount; i++) {
                if (maxElement < mat[rowNumber-1][i]) {
                    maxElement = mat[rowNumber-1][i];
                }
            }
        return maxElement;
        }

    static int columnIndexOfMaxElement(int mat[][], int rowNumber, int columnCount) {
        int maxElement =  mat[rowNumber-1][0];
        int columnIndex = 0;
        for (int i = 0; i < columnCount; i++) {
            if (maxElement < mat[rowNumber-1][i]) {
                maxElement = mat[rowNumber-1][i];
                columnIndex = i;
            }
        }
        return columnIndex;
    }

   static int[][] listToMatrix(List<List<Integer>> values) {
        int rowsCount = getRows(values);
        int columnCount = getColumns(values);
        int[][] mat = new int[rowsCount][columnCount];

        for (int i = 0; i < rowsCount; i++) {
            for (int j = 0; j < columnCount; j++) {
                mat[i][j] = values.get(i).get(j);
            }
        }
        return mat;
    }

    static int getRows ( List<List<Integer>> values){
        return values.size();
    }
    static int getColumns ( List<List<Integer>> values){
        return  values.get(0).size();
    }
}