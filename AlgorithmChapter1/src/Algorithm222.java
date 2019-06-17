import java.util.Scanner;

public class Algorithm222 {
	public static void main(String[] args) {
		
		System.out.print("1부터 n까지 더하는 함수의 n의 값을 입력해주세요 ->");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		//연습문제 Q6 while문이 종료될 때 변수 i 값이 n+1이 됨을 확인.
		int sum = 0;
		int i = 1;
		while (i <= n) {
			sum += i;
			i++;
		}
		System.out.println("1부터 " + n + "까지의 합은" + sum + "입니다.");
		System.out.println("Q6의 정답: " + i);
		
		//연습문제 Q7 n=7 이면 1+2+3+4+5+6+7 = 28 출력
		if (n == 7) {
			sum = 0;
			for (int j = 1; j <= n; j++) {
				sum += j;
			}
		}
		System.out.println("Q7의 정답: " +sum);
		
		//연습문제 Q8 가우스 덧셈활용 1부터 10까지의 합은 (1 + 10) * 5와 같은 방법으로 구할 수 있음.
		sum = 0;
		sum = (1 + n) * (n / 2);
		System.out.println("Q8의 정답: " + sum);
		
		System.out.println("Q9의 정답: " + sumof(5,7));
	}
	
	//연습문제 Q9 정수 a,b를 포함하여 그 사이의 모든 정수의 합을 구하여 반환하는 메소드 작성.
	static int sumof(int a, int b) {
		int sum = 0;
		// 입력받는 a와 b의 case를 3가지로 나눔(swift 중간시험과 동일)
		if(a == b) {
			return a;
		} else if (a > b) {
			for(int i = b; i <= a; i++) {
				sum += i;
			}return sum;
		} else {
			for(int j = a; j <= b; j++) {
				sum += j;
			}return sum;
		}
	}
}
