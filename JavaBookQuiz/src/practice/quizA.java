package practice;

import java.util.Scanner;

public class quizA {
	public static void main(String[] args) {
		
		String inputString;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("글자를 입력해주세요^^!");
		inputString = sc.next();
		
		System.out.printf("\n\n입력한 문자열은 ==> %s\n",inputString);
		
		System.out.print("변환한 문자열은 ==> ");
		for(int i = inputString.length() - 1; i >= 0; i--) {
			System.out.print(inputString.charAt(i));
		}
	}
}
