package Practice;

public class Gamble {
    public static void main(String[] args) {
        double dollar = dice() + dice() + dice();
        System.out.println(dollar);
        double won = exchange(dollar);
        System.out.printf("획득 금액: $%.2f(%.0f원)", dollar, won);
    }

    public static int dice() {
        // 1~6 숫자 반환 Math.random()
        return (int) (Math.random() * (6 - 1 + 1)) + 1;
    }

    public static double exchange(double dollar) {
        // 입력 받은 달러 환전
        return dollar * 1082.25108;
    }
}
