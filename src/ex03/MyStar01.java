package ex03;

public class MyStar01 {
	public static void main(String[] args) {
		/* 1->5 */
		for(int row = 0; row < 5; row++) {              // 5행까지
			for(int col = 0; row >= col; col++) {       // 0열부터 하나씩 증가하면서 *을 찍어준다.
				System.out.print("*");
			}
			System.out.println();                   // 줄바꿈
		}

		/* 5->1 */
		for(int row = 0; row < 5; row++) {              // 5행까지
			for(int col = 5; row < col; col--)          // 0열부터 감소하면서 *을 찍어준다.
			{
				System.out.print("*");
			}
			System.out.println();                   // 줄바꿈
		}

		/* 1 3 5 3 1 */
		int maxStar = 5;                                        // 행 변수
		for(int row = 1; row <= maxStar; row++) {              // 행 변수를 반으로 나눠서 생각한다.
			if(row < (maxStar + 1) / 2) {                           // 5행 기준 0~2행일때
				for(int col = 1; col <= (row * 2) - 1; col++) {   // (2*행-1)개의 *을 찍어준다.
					System.out.print("*");
				}
			}
			// 5행 절반의 나머지인
			else { // row >= (maxStar+1/2)                      // 3,4행
				for(int col = 1; col <= (maxStar - row + 1) * 2 - 1; col++) { // (역순)절반부터 감소하는 *의 개수
					System.out.print("*"); // (최대행-절반+1)*2 - 1 개의 *을 찍어준다.
				}
			}
			System.out.println();
		}
	}
}