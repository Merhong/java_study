package ex05.exam;

// 추상클래스
abstract class 육식동물 {

  abstract void print(); // 추상메소드
}

class Tiger extends 육식동물 {

  private final String name;

  public Tiger(String name) {
    this.name = name;
  }

  // 재정의
  public void print() {
    System.out.println(name);
  }
}

class Lion extends 육식동물 {

  private final String name;

  public Lion(String name) {
    this.name = name;
  }

  // 재정의
  public void print() {
    System.out.println(name);
  }
}

public class ExtenExam {

  static void start(육식동물 u1) {
    u1.print();
  }

  public static void main(String[] args) {
    Lion lion = new Lion("사자1");
    Tiger tiger = new Tiger("호랑이1");
    start(lion);
    start(tiger);
  }
}
