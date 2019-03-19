package mypack;

public class TestArray {
	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int i;
		for (i = 0; i < 10; i++) {
			System.out.print(a[i] + " ");
		}
		
		System.out.println();
		
		a = new int[5];
		for (i = 0; i < a.length; i++) {
			a[i] = i + 1;
			System.out.print(a[i] + " ");
		}
	}
}
