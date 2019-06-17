
public class Algorithm555 {
	
	public static void main(String[] args) {
		triangleLB(5); //Q15
		spira(5); //Q16
		npira(5); //Q17
	}
	
	//연습문제 Q15 왼쪽 아래가 직각인 이등변 삼각형을 출력
	static void triangleLB(int n) {
		for(int i = 0; i < n; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	//연습문제 Q16 n단의 피라미드를 출력하는 메서드를 작성.
	static void spira(int n) {
		for(int i = 0; i < n; i++) {
			for(int j = i; j < n - 1; j++) {
				System.out.print(" ");
			}
			for(int z = 0; z < (2 * i) + 1; z++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	//연습문제 Q17 n단의 숫자 피라미드를 출력하는 메서드를 작성.
	static void npira(int n) {
		for(int i = 1; i <= n; i++) {
			for(int j = i; j < n ; j++) {
				System.out.print(" ");
			}
			for(int z = 0; z < (2 * i) - 1; z++) {
				//******나머지 연산을 이용하여 숫자 출력가능!!*******
				System.out.print(i % 10);
			}
			System.out.println();
		}
	}
}
