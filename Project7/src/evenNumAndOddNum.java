import java.util.Random;

public class evenNumAndOddNum {
	public static void main(String[] args) {
		Random r = new Random();
		for (int i = 0; i < 5; i++) {
			int randomValue = r.nextInt(100);
			if (randomValue % 2 == 1) {
				System.out.printf("\n %d는 홀수입니다.", randomValue);
			} else {
				System.out.printf("\n %d는 짝수입니다.", randomValue);
			} 
		}
	}
}
