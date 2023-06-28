package ex04;

class Elis {

  int height = 160;
  int x = 0;

  void eat() {
  }
}

class Cal01 {

  void add() {     // void형은 리턴값이 없음.
    System.out.println("add 호출됨");
  }

  void minus() {
    System.out.println("minus 호출됨");
  }

  void multi() {
    System.out.println("multi 호출됨");
  }

  void divide() {
    System.out.println("divide 호출됨");
  }
}

public class Meth01 {

  public static void main(String[] args) {
    Cal01 c1 = new Cal01();
    c1.add();
    c1.minus();
    c1.multi();
    c1.divide();

    Cal01 c2 = new Cal01();
    c2.add();
    c2.minus();
    c2.multi();
    c2.divide();
  }
}
