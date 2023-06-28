package ex01;           // java 파일이 어느 폴더에 있는지 자동으로 생성됨.

// package ex02;        // 폴더명과 package가 일치하지 않음.
// class명은 파스칼 표기법을 지켜야 한다. (첫글자 대문자)
public class Var01 {    // class명과 소스파일명은 같아야 한다.
	public static void main(String[] args) {     // main이 없으면 실행을 못한다.
		int n1 = 7;                 // 변수 초기화. 메모리 공간 확보 (4바이트), '=' 은 할당(Assign)의 의미임 같다라는 의미가 아님.
		System.out.println(n1);     // 7 출력
		n1 = 20;                    // n1의 값을 7에서 20으로 재할당.
		System.out.println(n1);     // 20 출력
	}
}