import java.util.StringTokenizer;

class Matrix {

    private String matrixAsString;

    Matrix(String matrixAsString) {
        this.matrixAsString = matrixAsString;
    }

    int[] getRow(int rowNumber) {
        return calculateRow(rowNumber);
    }

    int[] getColumn(int columnNumber) {
        return calculateColumn(columnNumber);
    }

    public String getMatrixAsString() {
        return matrixAsString;
    }

    int[] calculateRow(int row) {
        int[][] matrix = tokenizer(getMatrixAsString());
        return matrix[row - 1];
    }

    int[] calculateColumn(int column) {
        int[][] matrix = tokenizer(getMatrixAsString());
        StringTokenizer st = new StringTokenizer(getMatrixAsString(), "\n");
        int columnSize = st.countTokens();
        int[] columnValue = new int[columnSize];

        for (int i = 0; i < columnSize; i++) {
            columnValue[i] = matrix[i][column - 1];
        }
        return columnValue;
    }

    int[][] tokenizer(String matrixAsString) {
        StringTokenizer st = new StringTokenizer(matrixAsString, "\n");
        int rowsCount = st.countTokens();

        st = new StringTokenizer(st.nextToken(), " ");
        int columnsCount = st.countTokens();

        StringTokenizer allElements = new StringTokenizer(matrixAsString.replaceAll("\n", " "), " ");
        int[][] matrix = new int[rowsCount][columnsCount];

        for (int i = 0; i < rowsCount; i++) {
            for (int j = 0; j < columnsCount; j++) {
                matrix[i][j] = Integer.parseInt(allElements.nextToken());
            }
        }
        return matrix;
    }

}
