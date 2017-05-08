
public class App {

	public static void main(String[] args) {
		App app = new App();
		app.test("({[]]})");
	}

	public boolean test(String s) {

		char[] bracketsDirect = { '(', '{', '[' };
		char[] bracketsBack = { ')', '}', ']' };

		boolean retVal = true;
		int strLength = s.length();

		if (strLength % 2 > 0) {
			retVal = false;
		}

		for (int i = 0; i < strLength; i++) {
			for (int j = 0; j < 3; j++) {
				if (s.charAt(i) == bracketsDirect[j]) {
					if (s.charAt(strLength - i - 1) != bracketsBack[j]) {
						retVal = false;
						break;
					}
				}
			}
		}
		System.out.println("" + retVal);
		return retVal;
	}

}
