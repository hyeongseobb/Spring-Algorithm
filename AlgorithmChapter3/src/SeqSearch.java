import java.util.Scanner;

//선형 검색
public class SeqSearch {
	static int seqSearch(int[] a, int n, int key) {
		for(int i = 0; i < n; i++) {
			if (a[i] == key) {
				return i; //검색성공!
			}
		}
		return -1; //검색실패!
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("배열의 크기를 입력:");
		int num = scanner.nextInt();
		int[] a = new int[num];
		
		for(int i = 0; i < num; i++) {
			System.out.println( i +"번째의 요소를 입력:");
			a[i] = scanner.nextInt();
		}
		
		System.out.println("검색할 값:");
		int key = scanner.nextInt();
		
		int idx = seqSearch(a, num, key);
		if(idx == -1) {
			System.out.println(key + "라는 요소가 없습니다.");
		}else {
			System.out.println("배열요소" + key +"가 존재하는 주소값은 " + idx + "입니다.");	
		}
	}
}
