package ex15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Input03 {

  public static void main(String[] args) {
    // 연결 (키보드)
    // InputStreamReader ir = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    // 읽기
    try {
      String data = br.readLine();
      System.out.println(data);

    } catch (IOException e) {
      e.printStackTrace();        // 오류 로그를 보여줌.
    }
  }
}
