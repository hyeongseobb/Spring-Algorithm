import java.util.Random;
import java.util.Scanner;

public class javaRandomPrint {
	public static void main(String[] args) {
		
		Random r = new Random();
		int randomValue = r.nextInt(100);
		int randomValue2 = r.nextInt(100);

		System.out.println(randomValue);
		System.out.println(randomValue2);
		
		if(randomValue > randomValue2) {
			System.out.println("더 큰 값은 : " + randomValue);
		}
		else if(randomValue == randomValue2) {
			System.out.println("두 값은 같다.");
		}
		else {
			System.out.println("더 큰 값은 : " + randomValue2);
		}
		
		System.out.println("숫자 하나 입력해주시오.");
		
		Scanner s = new Scanner(System.in);
		int inputNumber = s.nextInt();
		
		System.out.printf("입력한 숫자는 : %d", inputNumber);
		
	}
}

