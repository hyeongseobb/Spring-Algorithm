package practice;

import java.util.Scanner;

public class quizB {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("합계의 시작값 ==> ");
		int startNum = scanner.nextInt();
		
		System.out.print("합계의 끝값 ==> ");
		int endNum = scanner.nextInt();
		
		System.out.print("배수 ==> ");
		int multiple = scanner.nextInt();
		int sumNum = 0;
		
		for(int i = startNum; i <= endNum; i++) {
			if(i % multiple == 0) {
				sumNum = sumNum + i;
			}else {
				continue;
			}
		}
		System.out.printf("\n%d부터 %d까지의 %d배수의 합계 ==> %d", startNum, endNum, multiple, sumNum);
	}
}
