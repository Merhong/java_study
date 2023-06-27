package ex13;

class Data<T> {
    int status;     // 숫자(정수)
    T body;         // 값
}

public class Generic03 {
    public static void main(String[] args) {
        Generic03 g3 = new Generic03();
        // int n = g3.getNum2(1);  // (int) 다운캐스팅 필요
        Data<?> d = g3.getNum(1);
        // Data<String> d1 =(String) g3.getNum(1); // 오류
        // Data<String> d2 =(Data<String>) g3.getNum(1); // 다운캐스팅 할꺼면 이렇게 써야 함...

        System.out.println(d);
        // System.out.println(d2);
    }

    // 와일드카드 : 물음표(?)
    Data<?> getNum(int check) {
        if (check == 1) {
            Data<String> data = new Data<>();
            return data;
        } else { // (check != 1)
            Data<Integer> data = new Data<>();
            return data;
        }
    }

    Object getNum2(int check) {
        if (check == 1) {
            return "안녕";
        } else { // (check != 1)
            return 1;
        }
    }
}
