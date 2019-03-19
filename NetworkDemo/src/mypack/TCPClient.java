package mypack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class TCPClient {

	public static void main(String[] args) throws IOException {

		Socket socket = new Socket("localhost", 8877);
		// 通过流转换类，然后再包装成缓冲流，调用其读一行的函数
		BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		System.out.println(br.readLine());
		System.out.println(socket.getPort());
		socket.close();
		br.close();
	}
}
