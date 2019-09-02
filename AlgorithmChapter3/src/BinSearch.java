import java.util.Arrays;
import java.util.Scanner;

public class BinSearch {
	static int binSearch(int[] a, int n, int key) {
		int start = 0;
		int end = n - 1;
		
		//전제조건 배열이 오름차순으로 정렬되있어야함.
		do {
			int center = (start + end) / 2;
			if (a[center] == key) {
				//검색 성공!
				return center;
			} else if (a[center] < key) {
				start = center + 1;
			} else {
				end = center - 1;
			}
		}while (start <= end);
		
		//검색 실패
		return -1;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("배열의 크기를 입력 : ");
		int num = scanner.nextInt();
		int[] a = new int[num];
		
		for(int i = 0; i < num; i++) {
			System.out.println(i +"번째 배열요소 :");
			a[i] = scanner.nextInt();
		}
		Arrays.sort(a);
		//배열 오름차순 정렬
		System.out.println(Arrays.toString(a));
		
		System.out.println("찾을 요소를 입력하세요 :");
		int key = scanner.nextInt();
		int idx = binSearch(a, num, key);
		
		if(idx == -1) {
			System.out.println(key + "(이)라는 요소는 존재하지 않습니다.");
		}else {
			System.out.println(key + "가 존재하는 위치는" + idx + "입니다.");
		}
	}
}

