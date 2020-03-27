import java.util.ArrayList;
import java.util.List;

class Series {

    private String series;

    public Series(String series) {
        if (series.equals("")) {
            throw new IllegalArgumentException("Slice size is too big.");
        }
        this.series = series;
    }

    public List<String> slices(int noOfSlices) {

        List<String> slices = new ArrayList<>();
        int noOfTokens = series.length() - noOfSlices + 1;

        if (noOfSlices <= 0) {
            throw new IllegalArgumentException("Slice size is too small.");
        }
        if (series.length() < noOfSlices) {
            throw new IllegalArgumentException("Slice size is too big.");
        }

        for (int i = 0; i < noOfTokens; i++) {
            slices.add(series.substring(i, i + noOfSlices));
        }

        return slices;
    }

}