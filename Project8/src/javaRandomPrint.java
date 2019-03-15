import java.util.Random;
import java.util.Scanner;

public class javaRandomPrint {
	public static void main(String[] args) {
		
		Random r = new Random();
		int randomValue = r.nextInt(100);
		int randomValue2 = r.nextInt(100);

		System.out.println(randomValue);
		// System.out.println("나머지 :"+ (randomValue % 2));
		System.out.println(randomValue2);
		
		if(randomValue > randomValue2) {
			System.out.println("첫번째가 승리\t" + randomValue);
		}
		else if(randomValue == randomValue2) {
			System.out.println("무승부");
		}
		else {
			System.out.println("두번째가 승리\t" + randomValue2);
		}
		
		System.out.println("숫자를 입력하시오");
		
		Scanner s = new Scanner(System.in);
		int inputNumber = s.nextInt();
		
		System.out.printf("당신이 입력한 값은 %d입니다.", inputNumber);
		
	}
}

