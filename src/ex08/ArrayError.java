package ex08;

public class ArrayError {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		int i = 0;

		try {
			for(i = 0; i <= arr.length; i++) {
				System.out.println(arr[i] + " ");
			}
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("인덱스 " + i + "는 사용할 수 없습니다.");
		}
	}
}
