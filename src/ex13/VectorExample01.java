package ex13;

import java.util.Collections;
import java.util.Vector;

public class VectorExample01 {
	
	public static void main(String[] args) {
		Vector<String> vec = new Vector<String>(2);
		
		vec.add("Apple");
		vec.add("Orange");
		vec.add("Mango");
		
		System.out.println("벡터의 크기 : " + vec.size());
		Collections.sort(vec);  // 벡터의 문자열 정렬
		// 정렬하면 apple, mango, orange순 출력
		
		// 정렬된 벡터를 출력
		for (String s : vec) {
			System.out.println(s + " ");
		}
	}
}
