package ex03;

public class While01 {

  public static void main(String[] args) {
    // for -> 끝이 있는 반복문
    // while -> 끝을 모르는 반복문
    int i = 1;
    while (true) {   // 데몬, 끝이 없는 프로그램
      if (i == 101) {
        break;      // 반복문 탈출
      }

      System.out.println("Hello world:" + i);

      i++;

    }
  }
}
