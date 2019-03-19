package mypack;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPReceive {

	public static void main(String[] args) throws IOException {
		//建立UDP的服务 ，并且要监听一个端口。
		DatagramSocket socket=new DatagramSocket(8877);
		 //准备空的数据包用于存放数据。
		byte[] buff=new byte[1024];
		DatagramPacket packet=new DatagramPacket(buff, 0, buff.length);
		//调用UDP的服务接收数据,receive是一个阻塞型的方法，没有接收到数据包之前会一直等待,
		//数据实际上存储到了buff数组中
		socket.receive(packet);
		System.out.println("接收到的数据为："+new String(buff));
		socket.close();
		
	}
}
