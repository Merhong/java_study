package ex15;

import java.io.InputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Input04 {
    public static void main(String[] args) {
        // 연결 (키보드)
        try {
            InputStream in = new FileInputStream("input.txt");
            InputStreamReader ir = new InputStreamReader(in);
            BufferedReader br = new BufferedReader(ir);
            // String data = br.readLine();    // 내 버퍼를 비운다.

            String allData = "";
            while(true) {
                String data = br.readLine();
                allData = allData + data;

                if(data == null) {
                    break;
                }
            }

            System.out.println(allData);
            // 버퍼를 비웠는데 다시 확인하는 짓.
            // 아래의 조건이 무슨말을 하는지는 알겠으나 이미 비워져서 null 값을 가지고 있어서 작동안됨.
            // 즉, 의미없는 행위
            // if(br.readLine() != null) {
            //     System.out.println(br.readLine());
            // }

        } catch (Exception e) {            
            e.printStackTrace();
        }
        // InputStreamReader ir = new InputStreamReader(System.in);
        // br.close();
    }
}