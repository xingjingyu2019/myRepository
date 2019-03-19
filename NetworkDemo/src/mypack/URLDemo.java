package mypack;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;

public class URLDemo {

	public static void main(String[] args) throws IOException {
		URL url = new URL("http://www.10086.cn/index/ha/index_371_371.html");
		System.out.println(url.getFile());
		System.out.println(url.getHost());
		System.out.println(url.getProtocol());

		URLConnection conn = url.openConnection();
		InputStream is = conn.getInputStream();
		OutputStream os = new FileOutputStream("src/data.txt");
		byte[] buff = new byte[1024];
		int len = 0;
		
		while ((len=(is.read(buff, 0, buff.length)))>0) {
			os.write(buff, 0, len);
		}
		os.close();
		is.close();
	}
}
