import java.util.Scanner;

public class SumNumber {
	public void dosum () {
		int number1 = 0;
		int number2 = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자 : ");
		number1 = scan.nextInt();
		
		System.out.println("숫자 : ");
		number2 = scan.nextInt();
		
		Sum2 sum2 = new Sum2();
		int result = sum2.sumNumber(number1, number2);
		System.out.println("두개의 숫자의 합은" + result + "입니다.");
	}
	
	public void hello() {
		System.out.println("Hello Java");
	}
}

