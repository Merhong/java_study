package ex06;

// 인터페이스
interface Remocon {

  void on();

  void off();
}

class 삼성 implements Remocon {

  @Override
  public void off() {
    System.out.println("티비 끄다");
  }

  @Override
  public void on() {
    System.out.println("티비 켜다");
  }
}

class 엘지 implements Remocon {

  @Override
  public void off() {
    System.out.println("티비 끄다");
  }

  @Override
  public void on() {
    System.out.println("티비 켜다");
  }
}

public class Inter02 {

  public static void main(String[] args) {
    Remocon s1 = new 삼성();
    s1.on();
    s1.off();

    Remocon s2 = new 엘지();
    s2.on();
    s2.off();
  }
}
