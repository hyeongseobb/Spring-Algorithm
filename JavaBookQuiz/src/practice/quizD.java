package practice;

import java.util.Scanner;

public class quizD {	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("숫자를 여러개 입력 : ");
		String inputValue = scanner.nextLine();
		String star = "";

		for(int i = 0; i <= inputValue.length() - 1; i++) {
			int a = (inputValue.charAt(i)) - 48; //(inputValue.charAt(i))은 아스키 코드이므로 숫자로 변환하기위해 48을 빼야함
			for(int j = 0; j <= a - 1; j++) {
				star += "*";
			}
			System.out.println(a + " = " + star);
			star = "";
		}
	}
}
