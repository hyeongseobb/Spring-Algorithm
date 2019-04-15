package practice;

import java.util.Scanner;

public class quizC {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str;
		
		System.out.print("문자열을 입력 ==> ");
		str = scanner.nextLine();
		int countBig = 0;
		int countSmall = 0;
		int countNumber = 0;

//		System.out.println((int)('a')); 아스키코드
//		System.out.println((int)('z'));

		
		for(int i = 0; i <= str.length() - 1; i++) {
			if(str.charAt(i) >= (int)('A') && str.charAt(i) <= (int)('Z')) {
				countBig += 1;
			} else if(str.charAt(i) >= (int)('a') && str.charAt(i) <= (int)('z')) {
				countSmall += 1;
			} else if(str.charAt(i) >= (int)('1') && str.charAt(i) <= (int)('9')) {
				countNumber += 1;
			} 
		}
		
		System.out.printf("\n\n대문자 %d개, 소문자 %d개, 숫자%d개", countBig, countSmall, countNumber);
	
	}
}
