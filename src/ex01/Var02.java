package ex01;

public class Var02 {
	public static void main(String[] args) {
		/* 정수형 Type : byte(1), short(2), int(4), long(8) */
		byte b1 = 65;               // byte b1 = 165; byte의 크기를 초과해서 오류.
		int n1 = 210000000;         // 21억
		long l1 = 210000000L;       // 210억, long 값 할당시 정수 뒤에 L을 붙여야 함.

		/* 실수형 Type : float(4), double(8) */
		float f1 = 1.21231f;        // float 값 할당시 실수 뒤에 f를 붙여야 함.
		double d1 = 210000000.1111;

		/* 문자형 Type : char(2) */
		char c1 = '가';             // char ''을 사용, 문자열은 string 타입 및 "" 사용해야 함.

		/* 논리형 Type : boolean(1bit) */
		boolean check = true;       // boolean은 True(1)/False(0) 만 존재하는 1비트 Type

		System.out.println("정수형");
		System.out.println("byte 타입 : " + b1);
		System.out.println("int 타입 : " + n1);
		System.out.println("long 타입 : " + l1 + "\n");
		System.out.println("실수형");
		System.out.println("float 타입 : " + f1);
		System.out.println("double 타입 : " + d1 + "\n");
		System.out.println("문자형");
		System.out.println("char 타입 : " + c1 + "\n");
		System.out.println("Boolean");
		System.out.println("boolean 타입 : " + check);
	}
}
