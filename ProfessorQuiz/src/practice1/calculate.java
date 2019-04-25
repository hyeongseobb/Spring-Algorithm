package practice1;

import java.util.Scanner;

public class calculate {
	int firstNum;
	int secondNum;
	String temp;
	String temp2;
	public void execute () {

		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 숫자를 입력해주세요");
		temp = sc.next();
		
		System.out.println("두번째 숫자를 입력해주세요");
		temp2 = sc.next();
		
		this.firstNum = Integer.parseInt(temp);
		this.secondNum = Integer.parseInt(temp2);
		
		System.out.printf("%d / %d = %f입니다.", this.firstNum, this.secondNum, (double)this.firstNum / this.secondNum);
	}
	
	public void decimal (int a) {
		double result = (double)this.firstNum / this.secondNum * Math.pow(10,a);
		result = (double) Math.round(result);
		result = result / Math.pow(10,a);
		
		System.out.println("\n최종 결과 : " + result);
	}
}
