package ex17;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.util.Scanner;

/* 날짜 서버에 연결하기 */
public class SocketTest {
	
	public static void main(String[] args) throws IOException {
		// 미국 시각을 알려주는 NIST서버에 소켓을 이용하여 접속(사이트 주소, 포트번호)
		try (Socket s = new Socket("time-c.nist.gov", 13)) {
			InputStream inStream = s.getInputStream();
			Scanner in = new Scanner(inStream);
			
			while (in.hasNextLine()) {
				String line = in.nextLine();
				System.out.println(line);
			}
		}
	}
}
