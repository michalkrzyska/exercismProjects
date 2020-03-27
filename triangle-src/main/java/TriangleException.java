class TriangleException extends Exception {

    public TriangleException() {
        super("All sides have to be greater then 0, and sum of any two sides, must be greater then the other side. ");
    }
}
