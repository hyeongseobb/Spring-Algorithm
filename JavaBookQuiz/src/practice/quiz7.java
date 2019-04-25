package practice;

import java.util.Scanner;

public class quiz7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 500; i++) {
			
			System.out.print("첫번째 수를 입력하세요 : ");
			int firstNum = sc.nextInt();
			
			System.out.print("계산할 연산자를 입력하세요 : ");
			String Operator = sc.next();
			
			System.out.print("두번째 수를 입력하세요 : ");
			int secondNum = sc.nextInt();
			
			if (Operator.equals("+")) {
				System.out.printf("\n%d + %d = %d입니다\n", firstNum, secondNum, firstNum + secondNum);
			} else if (Operator.equals("-")) {
				System.out.printf("\n%d - %d = %d입니다\n", firstNum, secondNum, firstNum - secondNum);
			} else if (Operator.equals("*")) {
				System.out.printf("\n%d * %d = %d입니다\n", firstNum, secondNum, firstNum * secondNum);
			} else if (Operator.equals("/")) {
				System.out.printf("\n%d - %d = %f입니다\n", firstNum, secondNum, (double) firstNum / secondNum);
			} else if (Operator.equals("%")) {
				System.out.println("\n" + firstNum + " % " + secondNum + " = " + firstNum % secondNum + "입니다\n");
			} else {
				System.out.println("응^^~ 꺼져\n");
			} 
		}
	}
}
