import java.util.Scanner;

public class Java5 {
	public static void main(String[] args) {
		System.out.println("숫자를 입력해주세요!");
		
		Scanner scan1 = new Scanner(System.in);
		int number1 = scan1.nextInt();
		int sumNumber = number1 + 10;
		/*System.out.println("입력받은 숫자 +10은");
		System.out.println(sumNumber);
		System.out.println("입니다.");
		*/
		System.out.printf("입력받은 숫자 +10은 %d입니다.", sumNumber);
		
		System.out.print('\n');
		System.out.println();
		System.out.println("첫번째 숫자를 입력해주세요!");
		double fN = scan1.nextDouble();
		System.out.println("두번째 숫자를 입력해주세요!");
		double sN = scan1.nextDouble();
		double sum = fN + sN;
		
		System.out.printf("%f와 %f의 합은 %f입니다.", fN, sN, sum);
		
 }
}