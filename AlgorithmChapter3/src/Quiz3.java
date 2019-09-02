import java.util.Arrays;
import java.util.Scanner;

public class Quiz3 {
	
	static int searchIdx(int[] a, int n, int key, int[] idx) {
		int count = 0;
		for(int j = 0; j < n; j++) {
			if(a[j] == key) {
				idx[count++] = j;
			}
		}
		return count;
		//반환해야할값 = key가 일치 하는것의 개수.
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("배열의 크기를 입력:");
		int num = scanner.nextInt();
		int[] a = new int[num];
		int[] idx = new int[num];
		
		for(int i = 0; i < num; i++) {
			System.out.println( i +"번째의 요소를 입력:");
			a[i] = scanner.nextInt();
		}
		
		System.out.println("검색할 값:");
		int key = scanner.nextInt();
	
		int result = searchIdx(a, num, key, idx);
		if(result == 0) {
			System.out.println(key + "가 존재하지 않습니다.");
		}
		else {
			for(int i = 0; i < result; i ++) {
				System.out.println("배열요소" + key +"가 " + idx[i] + "에 존재합니다.");
			}
		}
	}
}
