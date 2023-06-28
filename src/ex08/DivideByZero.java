package ex08;


public class DivideByZero {

  static void divide(int n) {
    int result = 10 / n;
    System.out.printf("나눗셈 결과 : %s", result);

  }

  public static void main(String[] args) {
    try {
      divide(0);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
}
