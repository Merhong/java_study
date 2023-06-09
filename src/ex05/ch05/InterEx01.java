package ex05.ch05;


/**
 * 인터페이스
 * 1. 필요한 메소드만 노출시키고 싶을 때!!
 * 2. 프로그램 설계시 특정 메소드만 사용하도록 강제시키고 싶을 때!!
 */

 // CarAble의 구현체는 Car이다.
interface CarAble {
    public abstract void 엑셀(); // 추상 메소드
}

class Car implements CarAble {
    @Override
    public void 엑셀() {
        엔진가열();
        모터작동();
        바퀴회전();
    }
    private void 엔진가열() {
        System.out.println("엔진가열");
    }
    private void 모터작동() {
        System.out.println("모터작동");
    }
    private void 바퀴회전() {
        System.out.println("바퀴회전");
    }
}

public class InterEx01 {
    public static void main(String[] args) {
        CarAble carAble = new Car();        // 다형성이랑 상관이 없다. *예외
        carAble.엑셀();
    }
    
}
