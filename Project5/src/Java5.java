 import java.util.Scanner;

public class Java5 {
	public static void main(String[] args) {
		System.out.println("숫자를 입력해주세요");
		
		Scanner scan1 = new Scanner(System.in);
		int number1 = scan1.nextInt();
		int sumNumber = number1 + 10;

		System.out.printf("당신이 입력한 숫자 더하기 10은 : %d ", sumNumber);
		
		System.out.print('\n');
		System.out.println();
		
		System.out.println("첫번째 숫자를 입력해주세요");
		double fN = scan1.nextDouble();
		System.out.println("두번째 숫자를 입력해주세요");
		double sN = scan1.nextDouble();
		double sum = fN + sN;
		
		System.out.printf("%f와 %f의 합은 %f 입니다.", fN, sN, sum);
		
 }
}