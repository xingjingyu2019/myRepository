package mypack;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPReceive {

	public static void main(String[] args) throws IOException {
		//����UDP�ķ��� ������Ҫ����һ���˿ڡ�
		DatagramSocket socket=new DatagramSocket(8877);
		 //׼���յ����ݰ����ڴ�����ݡ�
		byte[] buff=new byte[1024];
		DatagramPacket packet=new DatagramPacket(buff, 0, buff.length);
		//����UDP�ķ����������,receive��һ�������͵ķ�����û�н��յ����ݰ�֮ǰ��һֱ�ȴ�,
		//����ʵ���ϴ洢����buff������
		socket.receive(packet);
		System.out.println("���յ�������Ϊ��"+new String(buff));
		socket.close();
		
	}
}
