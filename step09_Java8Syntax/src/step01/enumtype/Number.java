package step01.enumtype;

public enum Number {
	ONE(1, "one"), TWO(2, "two"), THREE(3, "three");

	private final int intNumber;
	private final String stringNumber;

	Number(int intNumber, String stringNumber) {
		this.intNumber = intNumber;
		this.stringNumber = stringNumber;
	}

	public int getIntNumber() {
		return intNumber;
	}

	public String getStringNumber() {
		return stringNumber;
	}

}
