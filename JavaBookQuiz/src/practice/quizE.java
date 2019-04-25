package practice;

import java.util.Scanner;

public class quizE {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] array = new int[10];
		int sum = 0;
		
		for(int i = 0; i < array.length; i++) {
			System.out.printf("\n%d번째의 숫자를 입력해주세요 ==> ", i+1);
			array[i] = scanner.nextInt();
			sum = sum + array[i];
		}
		System.out.println(sum);
	}
}
