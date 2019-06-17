import java.util.Scanner;

public class Algorithm444 {
	static void rcopy(int[] a, int[] b) {
		for(int i = 0; i < a.length; i++) {
			b[a.length-(i+1)] = a[i];
		}
		System.out.println("배열a를 거꾸로 복사한 배열b -->");
		for(int i = 0; i < b.length; i++) {
			System.out.print(" " + b[i]);
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("배열 a의 크기를 입력해주세요->");
		int arraySize = scanner.nextInt();
		
		int[] a = new int[arraySize];
		int[] b = new int[arraySize];
		for(int i = 0; i < a.length; i++) {
			System.out.print("a배열의 요소를 입력해주세요. ->");
			a[i] = scanner.nextInt();
		}
		rcopy(a,b);
	}
}
