import java.util.Scanner;

public class Algorithm333 {
	static void copy(int[] a, int[] b) {
		//연습문제 Q4 배열b의 모든 요소를 배열a에 복사하는 메서드 copy를 작성.
		for(int i = 0; i < b.length; i++) {
			a[i] = b[i];
		}
		System.out.println("배열b를 복사한 배열a :");
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " "); 
		}
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("배열의 크기를 정해주세요 -->");
		int arraySize = scanner.nextInt();
		
		int[] a = new int[arraySize];
		int[] b = new int[arraySize];
		
		for(int i = 0; i < b.length; i++) {
			System.out.println("b배열 값을 입력해주세요");
			b[i] = scanner.nextInt();
		}
		copy(a,b);
	}
}
