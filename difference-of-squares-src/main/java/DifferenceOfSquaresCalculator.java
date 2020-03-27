class DifferenceOfSquaresCalculator {

    int computeSquareOfSumTo(int input) {
        int[] numbers = createArray(input);
        int sum = 0;
        for (int i: numbers) {
           sum += i;
        }
        return (int) Math.pow((double) sum, 2.00 );
    }

    int computeSumOfSquaresTo(int input) {
        int[] numbers = new int[input];
        int sum = 0;
        for (int i = 0; i < input; i++){
            numbers[i]=i+1;
        }
        for (int i: numbers) {
            sum += Math.pow((double) i, 2.00);
        }
        return sum;
    }

    int computeDifferenceOfSquares(int input) {
        return computeSquareOfSumTo(input)-computeSumOfSquaresTo(input);
    }


    int[] createArray(int input){
        int[] numbers = new int[input];

        for (int i = 0; i < input; i++){
            numbers[i]=i+1;
        }
        return numbers;
    }
}
