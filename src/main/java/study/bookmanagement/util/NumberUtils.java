package study.bookmanagement.util;

public class NumberUtils {
	public static int parseInt(String value) {
		try {
			return Integer.parseInt(value);
		} catch (Exception e) {
			return 0;
		}
	}
}
