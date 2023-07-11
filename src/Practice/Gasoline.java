package Practice;

public class Gasoline {
	
	public static void main(String[] args) {
		double gasoline = 8.86;
		double distance = 182.736;
		double efficiency = calcEffiency(gasoline, distance);
		System.out.printf("연비: %.2f km/L", efficiency);
	}
	
	public static double calcEffiency(double fuel, double distance) {
		// 연비는 리터당 가는거리 = 거리 / 연료
		return distance / fuel;
	}
}