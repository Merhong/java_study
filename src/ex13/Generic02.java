package ex13;

/* 싱글톤 패턴 */
class 윤석열 {
    private static final 윤석열 instance = new 윤석열();
    // new를 개발자한테 맡기면 제네릭 사용가능.
    // 이 상태로는 제네릭 사용 불가.
    private Object data;

    private 윤석열() {
    }

    public static 윤석열 getInstance() {
        return instance;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}


public class Generic02 {
    public static void main(String[] args) {
        // 윤석열 d1 = new 윤석열(); 싱글톤이라 사용불가
        윤석열 d1 = 윤석열.getInstance(); // 이렇게 사용해야 함.
        d1.setData(1234);

        int value = (int) d1.getData();
        System.out.println(value);
    }
}
