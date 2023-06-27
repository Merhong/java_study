package ex15;

import java.io.IOException;
import java.io.InputStreamReader;

public class Input02 {
    public static void main(String[] args) {
        // 연결 (키보드)
        InputStreamReader ir = new InputStreamReader(System.in);

        // 읽기
        try {
            char[] ch = new char[5];
            ir.read(ch);

            for (char c : ch) {
                System.out.println(c);
            }

        } catch (IOException e) {
            e.printStackTrace();        // 오류 로그를 보여줌.
        }
    }
}
