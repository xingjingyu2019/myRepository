package mypack;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPSend {

	public static void main(String[] args) throws IOException {
		//����UDP�ķ��� ������Ҫ����һ���˿�
		DatagramSocket socket = new DatagramSocket();
		//׼�����ݣ������ݷ�װ�����ݰ���
		String temp = "hello from client";
		DatagramPacket packet = new DatagramPacket(temp.getBytes(), 0, temp.length());
		packet.setAddress(InetAddress.getLocalHost());
		packet.setPort(8877);
		//����UDP�ķ��������ݰ�
		socket.send(packet);
		socket.close();
	}

}
