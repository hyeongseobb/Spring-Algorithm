import java.util.Scanner;

public class PrimeNumber {
	public void PrimeNumberMethod(){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("검사할 숫자를 입력해주세요.");
		int inputNumber = sc.nextInt();
		if(inputNumber < 1) {
			System.out.println("양수만 입력해주세요.");
			return;
		}
			
		//소수 출력하는법 : 2부터 (숫자-1)까지 나눴을때 나눠지지 않으면 소수.
		boolean isPrimeNumber = true;
		for(int i = 2; i < inputNumber / 2; i++) {
			if(inputNumber % i == 0) {
				isPrimeNumber = false;
				break;
			}
		}
		if(isPrimeNumber) {
			System.out.println("소수입니다.");
		}
		else {
			System.out.println("소수가 아닙니다.");
		}
	}
}
