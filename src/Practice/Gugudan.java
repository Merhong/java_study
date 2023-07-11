package Practice;

public class Gugudan {
	
	public static void main(String[] args) {
		int[][] multi_arr = new int[8][9];     // 10 10을 하면 여유롭지만 공간이 낭비된다.
		
		for (int i = 0; i < 8; i++) {                // A*B 에서 A는 2부터 시작 (Index : 0~7)
			for (int j = 0; j < 9; j++) {            // B는 1부터 시작(Index : 0~8)
				int m = i + 2;                    // 2단부터 시작
				int n = j + 1;                    // 곱하기 1~9까지
				multi_arr[i][j] = m * n;          // [0][0]에 2x1을 할당...
				
				if (n == 9) {                      // 9를 곱할때는 쉼표를 붙이지말고 줄바꿈
					System.out.println(m + "x" + n + "=" + multi_arr[i][j]);
				} else {
					System.out.print(m + "x" + n + "=" + multi_arr[i][j] + ",");
				}
				// System.out.println("i의 값:"+i+" "+"j의 값:"+j+" "+multi_arr[i][j]);
				// System.out.print(multi_arr[i][j] + "\t");
				// System.out.print(i + "x" + j + "=" + i*j + ", ");
			}
		}
	}
}
