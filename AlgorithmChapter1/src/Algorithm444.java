import java.util.Scanner;

public class Algorithm444 {
	public static void main(String[] args) {
		//연습문제 Q12 곱셈표 작성
		System.out.println("----------- 곱셈표 ------------");
		for (int i = 1; i < 10; i++) {
			for(int j = 1; j < 10; j++) {
				System.out.print(i * j + " ");
			}
			System.out.println();
		}
		//연습문제 Q13 덧셈을 출력하는 프로그램
		System.out.println();
		System.out.println("----------- 덧셈표 -----------");
		for (int i = 1; i < 10; i++) {
			for(int j = 1; j < 10; j++) {
				System.out.print(i + j + " ");
			}
			System.out.println();
		}
		
		//연습문제 Q14 오른쪽과 같이 입력한 수를 한 변으로 하는 정사각형을 기호로 출력
		System.out.println();
		System.out.print("사각형의 길이를 입력하시오. ->");
		Scanner scanner = new Scanner(System.in);
		int squreLen = scanner.nextInt();
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
