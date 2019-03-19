package mypack;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPSend {

	public static void main(String[] args) throws IOException {
		//建立UDP的服务 ，并且要监听一个端口
		DatagramSocket socket = new DatagramSocket();
		//准备数据，把数据封装到数据包中
		String temp = "hello from client";
		DatagramPacket packet = new DatagramPacket(temp.getBytes(), 0, temp.length());
		packet.setAddress(InetAddress.getLocalHost());
		packet.setPort(8877);
		//调用UDP的服务发送数据包
		socket.send(packet);
		socket.close();
	}

}
