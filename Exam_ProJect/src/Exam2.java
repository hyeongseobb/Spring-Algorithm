import java.util.Arrays;
import java.util.Random;

public class Exam2 {
	public static void main(String[] args) {
		int settingValue = 30;
		int[] randomNumber = new int[settingValue];
		Random r = new Random();
		System.out.println("정렬 전" );
		for (int i = 0; i < settingValue; i++) {
			randomNumber[i] = r.nextInt(100) + 1;
			System.out.print(randomNumber[i] + " ");
		}
		System.out.println();
		Arrays.sort(randomNumber);
		System.out.println("정렬 후" );
		for  (int i = 0; i < settingValue; i++) {
			System.out.print(randomNumber[i] + " ");
		}
	}
}
