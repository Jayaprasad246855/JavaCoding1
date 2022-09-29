public class primeNumbers {
	static String name1 = "jai";     	//Static variable
	String name2 = "rekha";			// instance variable

	public static void main(String arg[]) {

		primeNumbers.add();

		primeNumbers pn = new primeNumbers();

		int lastnum = 50;					//Local variable

		for (int i = 4; i < lastnum; i++) {
			int count = 0;
			for (int j = 2; j <= i; j++) {

				if (i % j == 0) {
					count = count + 1;
				}
				if (count > 1) {
					break;
				}
			}
			if (count == 1) {
				System.out.println(i);
			}
		}
	}

	public static void add() {
		System.out.println("===================");
	}
}
