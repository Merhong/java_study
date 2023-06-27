package ex17;

import java.io.*;
import java.net.*;

public class URLConnectionReader {
    public static void main(String[] args) throws Exception {
        URL site = new URL("https://www.naver.com"); // URL 클래스 객체 제작
        URLConnection url = site.openConnection(); // 위의 객체를 이용해서 URLConnection 객체 생성
        BufferedReader in = new BufferedReader(new InputStreamReader(url.getInputStream()));
        String inLine;

        while ((inLine = in.readLine()) != null) {
            System.out.println(inLine);
        }
        in.close();
    }
}
