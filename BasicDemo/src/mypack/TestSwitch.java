package mypack;

import java.io.IOException;

public class TestSwitch {
	public static void main(String[] args) throws IOException {
		System.out.println("please input your char:");
		char c = (char) System.in.read();
		switch (c) {
		case 'a':
			System.out.println("your char is a");
			break;
		case 'b':
			System.out.println("your char is b");
			break;
		case 'c':
			System.out.println("your char is c");
			break;

		default:
			System.out.println("your char is else");
			break;
		}
	}
	
	int a[]=new int[3];
	
}
