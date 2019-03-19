package mypack;

public class TestLoop {
	public static void main(String[] args) {
		int i = 0;
		int result = 0;

		while (i < 100) {
			i++;
			result = i + result;
		}
		System.out.println("1+...+100=" + result);

		i = 0;
		result = 0;
		do {
			i++;
			result = i + result;
		} while (i < 100);
		System.out.println("1+...+100=" + result);

		result = 0;
		for (i = 0; i < 100; i++) {
			result = i + result;
		}
		System.out.println("1+...+100=" + result);
	}
}
