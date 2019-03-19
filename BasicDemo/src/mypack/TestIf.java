package mypack;

public class TestIf {
	public static void main(String[] args) {
		int x = 100;
		int y = 200;
		if (x > y) {
			System.out.println("x > y");
		} else {
			System.out.println("x < y");
		}
		x = 300;
		if (x > y) {
			System.out.println("x > y");
		} else {
			System.out.println("x < y");
		}
	}
}
