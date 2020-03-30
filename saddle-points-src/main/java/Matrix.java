import java.util.*;

class Matrix {

    private Set<MatrixCoordinate> saddlePoints = new HashSet<>();

    Matrix(List<List<Integer>> values) {

        calculateSaddlePoints(values);
    }

    private void calculateSaddlePoints(List<List<Integer>> values) {
        if (values.isEmpty()){

        } else {
            int noOfRows = values.size();
            int noOfColumns = values.get(0).size();
            for (int i = 0; i < noOfColumns; i++) {
                List<Integer> columns = new ArrayList<>();
                for (List<Integer> r : values) {
                    columns.add(r.get(i));
                }
                for (int j = 0; j < noOfRows; j++) {
                    int temp = values.get(j).get(i);
                    List<Integer> rows = values.get(j);
                    if ((temp >= Collections.max(rows)) && (temp <= Collections.min(columns))) {
                        saddlePoints.add(new MatrixCoordinate(j+1, i+1));
                    }
                }
            }
        }

    }

    Set<MatrixCoordinate> getSaddlePoints() {
        return saddlePoints;
    }

}
