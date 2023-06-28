package ex17;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

// 소스를 입력하고 Ctrl + Shift + O를 눌러서 필요한 파일을 포함한다.
public class ShapeTest {

  public static void main(String[] args) throws IOException {
    String hostname = "www.naver.com";

    try {
      // 인터넷 주소 담당 클래스 InetAddress
      InetAddress address = InetAddress.getByName(hostname);
      System.out.println("IP 주소 : " + address.getHostAddress());
    } catch (UnknownHostException e) {
      System.out.println(hostname + "의 IP 주소를 찾을 수 없습니다.");
    }
  }
}
