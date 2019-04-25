package practice;

import java.util.Scanner;

public class quiz {
	public static void main(String[] args) {
		for (int i = 0; i < 99; i++) {
			Scanner sc = new Scanner(System.in);
			try {
				System.out.println("입력 진수 결정 <0>10진수, <1>16진수, <2>8진수");
				int selectNum = sc.nextInt(3);
				System.out.println("진수변환 할 값을 입력해주세요.");
				int inputNum = sc.nextInt();
				
				
				if (selectNum == 0) {
					System.out.printf("10진수 : %d\n\n", inputNum);
				} else if (selectNum == 1) {
					System.out.printf("16진수 : %X\n\n", inputNum);
				} else if (selectNum == 2) {
					System.out.printf("8진수  :%o\n\n", inputNum);
				} 
			} catch (Exception e) {
				System.out.println("ㅗ\n");
				// TODO: handle exception
			}
		}
	}
}
