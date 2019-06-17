import java.util.Scanner;

public class Algorithm333 {
	public static void main(String[] args) {
		//연습문제 Q10 a,b에 정수를 입력하고 b-a를 출력하기(단, b가 a보다 작으면 b를 다시입력받기.)
		Scanner scanner = new Scanner(System.in);
		System.out.print("a의 값을 입력해주세요 ->");
		int a = scanner.nextInt();
		int b;
		
		do {
			System.out.print("b의 값 :");
			b = scanner.nextInt();
		} while(b < a);
		
		System.out.println("Q10의 정답은 : " + (b - a));
		
		//연습문제 Q11 양의 정수를 입력하고 자리수를 출력하는 프로그램 작성
		System.out.println("자리수를 구할 양의 정수를 입력하세요 ->");
		int c = scanner.nextInt();
		String castStrValue = String.valueOf(c);
		System.out.printf("그 수는 %d자리입니다.", castStrValue.length());
		
		//연습문제 Q12 곱셈표 작성
		System.out.println();
		for (int i = 1; i < 10; i++) {
			for(int j = 1; j < 10; j++) {
				System.out.print(i * j + " ");
			}
			System.out.println();
		}
	}
}
