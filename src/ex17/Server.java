package ex17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/* 채팅 서버 제작 */
public class Server {
	
	public static void main(String[] args) {
		ServerSocket serverSocket = null;       // ServerSocket 객체 생성
		Socket clientSocket = null;             // ClientSocket 객체 생성
		BufferedReader in = null;
		PrintWriter out = null;
		Scanner sc = new Scanner(System.in);
		
		try {
			serverSocket = new ServerSocket(5000);  // 5000번 포트에 연결될 ServerSocket을 만듬
			System.out.println("연결을 기다리고 있습니다.");
			clientSocket = serverSocket.accept();       // 클라이언트로부터의 연결을 기다림
			out = new PrintWriter(
				clientSocket.getOutputStream());  // 클라이언트로 데이터를 보내기 위한 PrintWriter 생성
			in = new BufferedReader(new InputStreamReader(
				clientSocket.getInputStream())); // 클라이언트로부터의 데이터를 읽기 위한 BufferedReader 생성
			System.out.println("클라이언트와 연결되었습니다.");
			
			while (true) {
				String msg = in.readLine();  // 클라이언트로부터 문자열을 읽음
				if (msg.equalsIgnoreCase("quit")) {  // 만약 클라이언트가 "quit"을 보냈다면
					System.out.println("클라이언트에서 연결을 종료하였습니다.");
					break;  // 루프를 종료하여 서버 프로그램을 종료
				}
				System.out.println("클라이언트가 보낸 문자열: " + msg);  // 클라이언트가 보낸 문자열을 출력
				System.out.print("클라이언트로 보낼 문자열을 입력하고 엔터키를 누르세요: ");
				String omsg = sc.nextLine();  // 사용자로부터 문자열을 입력받음
				out.write((omsg + "\n"));  // 클라이언트로 문자열을 보냄
				out.flush();       // 출력 버퍼를 비움
			}
			out.close();           // PrintWriter를 닫음
			clientSocket.close();  // 클라이언트 소켓을 닫음
			serverSocket.close();  // 서버 소켓을 닫음
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}