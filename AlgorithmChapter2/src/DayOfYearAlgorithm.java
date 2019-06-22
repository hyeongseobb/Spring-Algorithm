import java.util.Scanner;

public class DayOfYearAlgorithm {
	static int[][] mdays = {
		// 각 달의 일수 연습문제 Quiz8
		{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}, // 평년
		{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}, // 윤년
	};
	
	//서기 year년은 윤년인가?(윤년:1 // 평년:0)
	static int isLeap(int year) {
		return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0;
	}
	
	static int dayOfYear(int y, int m, int d) {
		int days = d;
		for (int i = 1; i < m; i++) {
			days += mdays[isLeap(y)][i-1];
		}
		// 역으로 날짜 더하기
//		while (--m != 0)
//		d += mdays[isLeap(y)][m - 1];
		return days;
	}
	
	//Quiz9 y년 m월 d일의 그 해 남은 일 수를 구하는 메소드를 작성하시오.
	static int leftDayOfYear(int y, int m, int d) {
		int totalDaysOfYear = 365;
		int leftDayOfYear = totalDaysOfYear + isLeap(y) - dayOfYear(y, m, d);
		return leftDayOfYear;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int retry;
		int year;
		int month;
		int day;
		
		System.out.println("그 해 경과 일수를 구합니다.");
		
		do {
			do {
				System.out.println("년 : ");
				year = scanner.nextInt();
			} while (year < 0);
			do {
				System.out.println("월 : ");
				month = scanner.nextInt();
			} while (month <= 0 || month > 12);
			do {
				System.out.println("일 : ");
				day = scanner.nextInt();
			} while (day <= 0 || day > 32);
			System.out.printf("그 해 %d일째입니다.\n", dayOfYear(year, month, day));
			System.out.printf("올해가 %d일 남았습니다.\n", leftDayOfYear(year, month, day));
			
			System.out.print("한 번 더 할까요? (1. 예 /0. 아니오) : ");
			retry = scanner.nextInt();
		} while (retry == 1);
		
	}
}
