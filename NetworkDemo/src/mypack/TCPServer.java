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

		// 创建一个ServerSocket，用于监听客户端Socket连接请求
		ServerSocket serverSocket = new ServerSocket(8877);
		System.out.println("server start");
		// 采用循环方式监听客户端的请求
		while (true) {
			// 侦听并接受到此套接字的连接。此方法在连接传入之前一直阻塞。
			Socket socket = serverSocket.accept();
			PrintStream ps = new PrintStream(socket.getOutputStream());
			ps.print("hello from server");
			System.out.println("new connection: "+socket.getInetAddress()+" : "+socket.getLocalPort());
			ps.close();
			socket.close();
		}
	}
}
