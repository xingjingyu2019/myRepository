package mypack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class TCPClient {

	public static void main(String[] args) throws IOException {

		Socket socket = new Socket("localhost", 8877);
		// ͨ����ת���࣬Ȼ���ٰ�װ�ɻ��������������һ�еĺ���
		BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		System.out.println(br.readLine());
		System.out.println(socket.getPort());
		socket.close();
		br.close();
	}
}
