package util;

public class NumberUtil {

	public static boolean checkInteger(String str) {
		try {
			Integer.parseInt(str);
		} catch (Exception exp) {
			System.out.println("Error! Please try agrain!");
			return false;
		}

		return true;
	}

	public static boolean checkDigit(String str) {
		try {
			Integer.parseInt(str);
		} catch (Exception exDi) {
			System.out.println("Error! Please try agrain!");
			return false;
		}
		int i = Integer.parseInt(str);
		if (i != 1 && i != 2 && i != 3) {
			System.out.println("Error! Please try agrain!");
			return false;
		} else
			return true;
	}

	public static boolean checkChoice(String str) {
		try {
			Integer.parseInt(str);
		} catch (Exception exDi) {
			System.out.println("Error! Please try agrain!");
			return false;
		}
		int i = Integer.parseInt(str);
		if (i != 1 && i != 2) {
			System.out.println("Error! Please try agrain!");
			return false;
		} else
			return true;
	}

}
