package Practice;

public class JavaCafe {
    public static void main(String[] args) {
        printPay(10.00, 40);
        printPay(10.00, 50);
        printPay(7.50, 38);
        printPay(8.50, 66);
    }

    public static void printPay(double basePay, int hours) {
        double pay = 0.0;
        // 40 시간이상 근무시 1.5배 추가수당 지급
        if (hours > 40) pay = basePay * 40 + ((1.5 * basePay) * (hours - 40));
        else pay = basePay * hours;
        // 시급 8미만시 에러, 60시간 초과근무시 에러
        if (basePay < 8) System.out.println("최저 시급 에러");
        else if (hours > 60) System.out.println("초과 근무시간 에러!");
            // 출력
        else System.out.printf("$ %.2f\n", pay);
    }
}
