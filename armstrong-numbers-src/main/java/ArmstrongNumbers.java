class ArmstrongNumbers {

	public static void main(String[] args) {
		System.out.println(isArmstrongNumber(153));
	}

	static boolean isArmstrongNumber(int numberToCheck) {
		String intToString = Integer.toString(numberToCheck);
		int[] digits = new int[intToString.length()];
		for (int i = 0; i < digits.length; ++i) {
			digits[i] = intToString.charAt(i)-'0';
		}
		int sum = 0;
		for (int i =0; i < intToString.length(); i++){
			sum += (int) Math.pow(digits[i],intToString.length());
		}
		return sum==numberToCheck;
	}


}
