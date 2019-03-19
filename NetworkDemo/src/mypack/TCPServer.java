package mypack;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {

	public static void main(String[] args) throws IOException {

		// ����һ��ServerSocket�����ڼ����ͻ���Socket��������
		ServerSocket serverSocket = new ServerSocket(8877);
		System.out.println("server start");
		// ����ѭ����ʽ�����ͻ��˵�����
		while (true) {
			// ���������ܵ����׽��ֵ����ӡ��˷��������Ӵ���֮ǰһֱ������
			Socket socket = serverSocket.accept();
			PrintStream ps = new PrintStream(socket.getOutputStream());
			ps.print("hello from server");
			System.out.println("new connection: "+socket.getInetAddress()+" : "+socket.getLocalPort());
			ps.close();
			socket.close();
		}
	}
}
