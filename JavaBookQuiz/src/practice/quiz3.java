package practice;

import java.util.Scanner;

public class quiz3 {
	public static void main(String[] args) {
		//문자열을 입력받고 거꾸로 출력하기
		Scanner sc = new Scanner(System.in);
		String str;
		
		System.out.println("문자열을 입력하세요");
		str = sc.next();
		
		for(int i = str.length() - 1; i >= 0; i--) {
			System.out.print(str.charAt(i)); //charAt(i) -> i에 위치한 문자열을 앞에 출력
		}
		System.out.println();
	}
}
