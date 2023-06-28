package ex17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {


  public static void main(String[] args) throws IOException {
    Socket clientSocket = null;  // Socket 객체 생성
    BufferedReader in = null;
    PrintWriter out = null;
    final Scanner sc = new Scanner(System.in);

    try {
      clientSocket = new Socket("localhost", 5000);  // 로컬 호스트의 5000번 포트로 연결하는 Socket 객체 생성
      out = new PrintWriter(clientSocket.getOutputStream());  // 서버로 데이터를 보내기 위한 PrintWriter 생성
      in = new BufferedReader(new InputStreamReader(
          clientSocket.getInputStream())); // 서버로부터 데이터를 읽기 위한 BufferedReader 생성
      String msg = "";

      while (true) {
        System.out.println("서버로 보낼 문자열을 입력하고 엔터키를 누르세요.");
        msg = sc.nextLine();
        if (msg.equalsIgnoreCase("quit")) {  // 만약 입력된 문자열이 "quit"이라면
          out.println(msg);   // 서버로 "quit" 메시지를 보냄
          out.flush();        // 출력 버퍼를 비움
          break;              // 루프를 종료하여 클라이언트 프로그램을 종료
        }
        out.println(msg);       // 입력된 문자열을 서버로 보냄
        out.flush();            // 출력 버퍼를 비움
        msg = in.readLine();    // 서버로부터 메시지를 읽음
        System.out.println("서버로부터 온 메시지: " + msg);  // 서버로부터 받은 메시지를 출력
      }
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      out.close();            // PrintWriter를 닫음
      clientSocket.close();   // 클라이언트 소켓을 닫음
    }
  }
}