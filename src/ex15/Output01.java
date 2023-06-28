package ex15;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class Output01 {
	public static void main(String[] args) {
		// 연결(모니터)
		OutputStream os = System.out;
		OutputStreamWriter ow = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(ow);

		try {
			bw.write("Hello");
			bw.flush();
		} catch(IOException e) {
			e.printStackTrace();
		}

	}
}
