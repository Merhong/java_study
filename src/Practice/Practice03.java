package Practice;

import java.util.Scanner;
import java.util.StringTokenizer;
// import java.math.*;                     // 절대값용 Math

public class Practice03 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);    // 키보드 입력을 받는다.
		int yyyy, mm, dd;                       // 날짜 문자열을 정수형으로 변환한 후에 받을 변수.
		
		System.out.println("====================");
		System.out.println("날짜 변경 프로그램");
		System.out.println("====================");
		System.out.println("날짜를 입력해 주세요(yyyy-mm-dd):");
		String data1 = sc.nextLine();           // 키보드로부터 문자열을 입력 받는다. (yyyy-mm-dd) 형식
		
		/* 토크나이저 */
		// yyyy mm dd 로 잘라준다.
		StringTokenizer st1 = new StringTokenizer(data1, "-");    // data 문자열을 "-" 구분자로 토크나이저 실행
		
		yyyy = Integer.parseInt(st1.nextToken());  // data문자열 yyyy값을 정수형으로 변환
		mm = Integer.parseInt(st1.nextToken());    // data문자열 mm값을 정수형으로 변환
		dd = Integer.parseInt(st1.nextToken());    // data문자열 dd값을 정수형으로 변환
		System.out.println(yyyy + " " + mm + " " + dd);
		
		System.out.println("변경할 항목을 입력해 주세요(year/month/day)");
		String type1 = sc.nextLine();           // 변경할 항목(year/month/day) 입력 받음
		System.out.println(type1);
		
		System.out.println("변경할 값을 입력해 주세요(정수)");
		int num1 = sc.nextInt();                // 변경할 값.
		System.out.println(num1);
		
		/* 조건부 */
		// 변경할 항목이 year일때
		if (type1.equals("year")) {       // 문자열을 비교연산자 ==으로 했을때 가르키는 주소가 달라서 다른곳으로 튐.
			yyyy = yyyy + num1;                    // 현재 연도와 변경할 값을 더해준다.
			System.out.println(yyyy + "-" + mm + "-" + dd + "\n\n");
			sc.close();
		}
		
		// 변경할 항목이 month 일때
		else if (type1.equals("month")) { // 현재 월과 변경할 값을 더해준다.
			
			// num1이 양수 값인 경우 (월 증가)
			if (num1 > 0) {                         // 12월을 넘게 되면 다음해로 넘어감.
				yyyy = yyyy + (mm + num1 - 1) / 12;  // num1 > 12면 yyyy+1
				mm = (mm + num1 - 1) % 12 + 1;       // 1월 ~ 12월만 존재함.
				System.out.println(yyyy + "-" + mm + "-" + dd + "\n\n");
			}
			
			//  num1이 음수 값인 경우 (월 감소)
			else if (num1 < 0) {
				int y_dec = Math.abs(num1) / 12;        // 연도를 빼기위한 변수
				int m_dec = Math.abs(num1) % 12 + 1;    // 월을 빼기위한 변수 +1은 0월 방지용
				
				// month보다 큰 값이 빼지면
				if (m_dec >= mm) {           // ex) 1월인데 1개월이상 빼는 경우 1년 감소후 +월 할당
					y_dec = y_dec++;        // 12개월 단위로 1년씩 더 감소한다.
					m_dec = m_dec - mm;     // 월 감소에서 month를 뺀다.
				}
				
				yyyy = yyyy - y_dec;        // 연도 재할당
				mm = mm - m_dec;            // 월 재할당
				
				// month가 음수거나 0일때 12를 더하여 1~12월 유지
				if (mm <= 0) {
					yyyy--;
					mm = mm + 12;
				}
				System.out.println(yyyy + "-" + mm + "-" + dd + "\n\n");
			}
			// num1 = 0
			else {
				System.out.println(yyyy + "-" + mm + "-" + dd + "\n\n");
			}
			sc.close();
		}
        
        /*  
        1년은 365일or 366일(윤년)
        1,3,5,7,8,10,12월 = 31일
        4,6,9,11월 = 30일
        2월은 = 28일/29일(윤년)
        */
		
		// 변경할 항목이 day일 때
		else if (type1.equals("day")) {
			boolean isLeapYear = isLeapYear(yyyy);    // 윤년 확인
			
			// num1이 양수인 경우(날짜 증가)
			if (num1 > 0) {
				for (int i = 0; i < num1; i++) {      // 날짜 증가
					dd++;                             // 일자를 1 증가시킴
					
					// 월이 2월인 경우
					if (mm == 2) {
						// 윤년인 경우
						if (isLeapYear) {
							// 일자가 30일을 넘어가면 3월로 넘어감
							if (dd > 29) {
								dd = 1;
								mm = 3;
							}
						}
						// 윤년이 아닌 경우
						else {
							// 일자가 29일을 넘어가면 3월로 넘어감
							if (dd > 28) {
								dd = 1;
								mm = 3;
							}
						}
					}
					
					// 1월, 3월, 5월, 7월, 8월, 10월, 12월인 경우
					else if (mm == 1 || mm == 3 || mm == 5 || mm == 7 || mm == 8 || mm == 10
						|| mm == 12) {
						// 일자가 32일을 넘어가면 다음 달로 넘어감
						if (dd > 31) {
							dd = 1;
							mm++;
							
							// 연도가 변경되는 경우
							if (mm > 12) {
								mm = 1;
								yyyy++;
								isLeapYear = isLeapYear(yyyy);  // 다음 연도의 윤년 여부 확인
							}
						}
					}
					
					// 4월, 6월, 9월, 11월인 경우
					else if (mm == 4 || mm == 6 || mm == 9 || mm == 11) {
						// 일자가 31일을 넘어가면 다음 달로 넘어감
						if (dd > 30) {
							dd = 1;
							mm++;
						}
					}
					
					// 그 외의 경우 (2월을 제외한 나머지 월)
					else {
						// 일자가 32일을 넘어가면 다음 달로 넘어감
						if (dd > 31) {
							dd = 1;
							mm++;
						}
					}
				}
				System.out.println(yyyy + "-" + mm + "-" + dd + "\n\n");
			}
			
			// num1이 음수인 경우(날짜 감소)
			else if (num1 < 0) {
				for (int i = 0; i < Math.abs(num1); i++) {
					dd--;                       // 일자를 1 감소시킴
					
					// 월이 3월인 경우
					if (mm == 3) {
						// 윤년인 경우
						if (isLeapYear) {
							// 일자가 0일이 되면 2월로 넘어감
							if (dd == 0) {
								dd = 29;
								mm = 2;
							}
						}
						// 윤년이 아닌 경우
						else {
							// 일자가 0일이 되면 2월로 넘어감
							if (dd == 0) {
								dd = 28;
								mm = 2;
							}
						}
					}
					
					// 1월, 5월, 7월, 8월, 10월, 12월인 경우 (31일)
					else if (mm == 1 || mm == 5 || mm == 7 || mm == 8 || mm == 10 || mm == 12) {
						// 일자가 0일이 되면 이전 달로 넘어감
						if (dd == 0) {
							mm--;
							
							// 연도가 변경되는 경우
							if (mm == 0) {
								mm = 12;
								yyyy--;
								isLeapYear = isLeapYear(yyyy);  // 이전 연도의 윤년 여부 확인
							}
							
							// 이전 달의 마지막 일자로 설정
							if (mm == 2) {
								if (isLeapYear) {
									dd = 29;
								} else {
									dd = 28;
								}
							} else if (mm == 4 || mm == 6 || mm == 9 || mm == 11) {
								dd = 30;
							} else {
								dd = 31;
							}
						}
					}
					
					// 4월, 6월, 9월, 11월인 경우(30일)
					else if (mm == 4 || mm == 6 || mm == 9 || mm == 11) {
						// 일자가 0일이 되면 이전 달로 넘어감
						if (dd == 0) {
							dd = 31;
							mm--;
						}
					}
					// 그 외의 경우 (2월을 제외한 나머지 월)
					else {
						// 일자가 0일이 되면 이전 달로 넘어감
						if (dd == 0) {
							dd = 30;
							mm--;
						}
					}
				}
				System.out.println(yyyy + "-" + mm + "-" + dd + "\n\n");
			}
			
			// num1이 0인 경우(그대로 출력)
			else {
				System.out.println(yyyy + "-" + mm + "-" + dd + "\n\n");
			}
			sc.close();
		}
		
		// 변경할 항목이 잘못 입력됐을때
		else {
			System.out.println("잘못된 항목을 입력하였습니다.");
			sc.close();
		}
	}
	
	// 윤년 여부 확인 메소드
	// 4로 떨어지는 연도이며 100으로는 나누어 떨어지지 않는 연도
	// 400으로 나누어떨어지는 연도
	public static boolean isLeapYear(int year) {
		return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
	}
}