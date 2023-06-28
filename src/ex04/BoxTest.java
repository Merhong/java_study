package ex04;

class Box {

  int width;
  int length;
  int height;

  double getVolume() {
    return (double) width * height * length;    // 업캐스팅
  }
}

public class BoxTest {

  public static void main(String[] args) {
    Box b;              // Box 클래스 참조 변수
    b = new Box();
    b.width = 20;       // 가로
    b.length = 20;      // 세로
    b.height = 30;      // 높이

    System.out.println("상자의 가로, 세로, 높이는 " + b.width + ", " + b.length + ", " + b.height + "입니다.");
    System.out.println("상자의 부피는 " + b.getVolume() + "입니다.");
  }
}