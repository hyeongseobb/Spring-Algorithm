package practice;

import java.util.Scanner;

public class quiz8 {
	public static void main(String[] args) {
		
		String[] str;
		Scanner sc = new Scanner(System.in);
		System.out.println("수식을 한줄로 띄워쓰기로 입력하세요 : ");
		
		str = sc.nextLine().split(" ");
		
		int firstNum = Integer.parseInt(str[0]);
		String operator = str[1];
		int secondNum = Integer.parseInt(str[2]);
		
		switch(operator) {
		case "+" :
			System.out.printf("%d + %d = %d입니다.", firstNum, secondNum, firstNum+secondNum);
			break;
		case "-" :
			System.out.printf("%d - %d = %d입니다.", firstNum, secondNum, firstNum-secondNum);
			break;
		case "*" :
			System.out.printf("%d * %d = %d입니다.", firstNum, secondNum, firstNum*secondNum);
			break;
		case "/" :
			System.out.printf("%d / %d = %f입니다.", firstNum, secondNum, (double)firstNum/secondNum);
			break;
		case "%" :
			System.out.println(firstNum + " % " + secondNum + " = " + firstNum % secondNum + "입니다.");
			break;
		default :
			System.out.println("연산자를 잘못 입력했습니다^^, 제대로 입력해주세요");		
		}
	}
}
