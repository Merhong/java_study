package ex08;

import java.io.FileReader;
import java.io.IOException;

public class ExceptionTest {
    public static void main(String[] args) throws IOException {
        try (FileReader fr = new FileReader("test.txt")) {
            char[] a = new char[50];
            fr.read(a);
            for(char c : a) {
                System.out.println(c);
            }
        }
    }
}
