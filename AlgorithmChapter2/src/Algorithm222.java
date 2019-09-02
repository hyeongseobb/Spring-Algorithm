import java.util.Random;
import java.util.Scanner;

public class Algorithm222 {
	//연습문제 Q2
	static void swap(int[] a, int index1, int index2) {
		int temp = a[index1];
		a[index1] = a[index2];
		a[index2] = temp;
	}
	
	static void reverse(int[] a) {
		//바꾸는 횟수는 배열의길이를 2로나눈 몫의 값만 바꿔주면 된다.(배열의 크기가 홀수일 경우, 가운데값은 바꾸지 않아도됨.)
		for(int i = 0; i < a.length/2; i++) {
			swap(a, i, (a.length - 1) - i);
			System.out.println();
			System.out.println("a[" + i + "]와" + "a[" + (a.length - 1 - i) + "]를 교환합니다." );
			for(int j = 0; j < a.length; j++) {
				System.out.print(a[j] + " ");
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		System.out.print("배열의 크기를 입력해주세요 -->");
		int num = scanner.nextInt();
		int[] seobArray = new int[num];
		
		System.out.println("초기 배열의 순서");
		for(int i = 0; i < num; i++) {
			seobArray[i] = random.nextInt(100);
			System.out.print(seobArray[i] + " ");
		}
		
		reverse(seobArray);
		System.out.println();
		System.out.println("요소를 역순으로 정렬했습니다.");
		for(int i = 0; i < num; i++) {
			System.out.print(seobArray[i] + " ");
		}
		System.out.println();
		System.out.println("모든 배열 요소의 합은? " + sumOf(seobArray));
	}
	
	//연습문제 Q3
	static int sumOf(int[] a) {
		int sum = 0;
		for(int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		return sum;
	}
}
