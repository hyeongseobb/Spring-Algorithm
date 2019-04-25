import java.util.Random;

public class Exam11 {
	public static void main(String[] args) {
		//랜덤값을 출력하고 홀수 짝수 판별
		Random random = new Random();
		int randomValue = random.nextInt(101);
		
		System.out.println("임의의값은 : " + randomValue);
		System.out.println("나머지값은 : " + randomValue % 2);
		
		if(randomValue % 2 == 0) {
			System.out.println("짝수입니다.");
		} else {
			System.out.println("홀수입니다.");
		}
	}
}
