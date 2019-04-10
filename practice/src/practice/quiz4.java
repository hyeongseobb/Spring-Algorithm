package practice;

import java.util.Scanner;

public class quiz4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 계산할 값을 입력하세요");
		float firstNum = sc.nextFloat();
		System.out.println("두번째 계산할 값을 입력하세요");
		float secondNum = sc.nextFloat();
		
		System.out.printf("\n%f + %f = %f", firstNum, secondNum, firstNum+secondNum);
		System.out.printf("\n%f - %f = %f", firstNum, secondNum, firstNum-secondNum);
		System.out.printf("\n%f * %f = %f", firstNum, secondNum, firstNum*secondNum);
		System.out.printf("\n%f / %f = %f", firstNum, secondNum, firstNum/secondNum);
		System.out.println("\n"+firstNum + " % " + secondNum + " = " + firstNum%secondNum);
	}
}
