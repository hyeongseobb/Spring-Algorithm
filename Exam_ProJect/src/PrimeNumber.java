import java.util.Scanner;

public class PrimeNumber {
	public void doCheck(int inputNumber) {
		if (inputNumber < 1) {
			System.out.println("양수만 입력해 주세요.");
			return;
		}
		
		boolean isPrimeNumber = true;
		for (int i = 2; i < inputNumber / 2; i++) {
			if (inputNumber % i == 0) {
				isPrimeNumber = false;
				break;
			}
		}
		
		if (isPrimeNumber) {
			System.out.println("" + inputNumber + "는 소수입니다.");
		}
	}
}
