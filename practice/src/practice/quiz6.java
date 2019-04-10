package practice;

import java.util.Scanner;

public class quiz6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("연도를 입력해주세요 : ");
		int year = sc.nextInt();
		
		if(year % 4 == 0 && year % 100 != 0) {
			System.out.printf("\n%d년은 윤년입니다.", year);
		} else if (year % 400 == 0) {
			System.out.printf("\n%d년은 윤년입니다.", year);
		} else {
			System.out.printf("\n%d년은 윤년이 아닙니다.", year);
		}	
	}
}
