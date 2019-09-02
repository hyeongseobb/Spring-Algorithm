import java.util.Scanner;

//선형검색에서 종료판단 횟수를 반으로 줄여주는 보초법
public class SeqSearchSen {
	static int seqSearchSen(int[] a, int n, int key) {
		int i = 0;
		//배열의 맨끝에 보초를 추가함.
		a[n] = key;
		
		while(true) {
			if(a[i] == key) {
				//검색 성공!
				break;
			}
			i++;
		}
		return i == n ? -1 : i;
	}
	
	static int seqSearchSen2(int[] a, int n, int key) {
		a[n] = key;
		int i;
		for(i = 0; i <= n; i++) {
			if(a[i] == key) {
				//검색 성공!
				break;
			}
		}
		return i == n ? -1 : i;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("배열의 크기를 입력:");
		int num = scanner.nextInt();
		int[] a = new int[num + 1];
		
		for(int i = 0; i < num; i++) {
			System.out.println(i + "번째의 요솟값 :");
			a[i] = scanner.nextInt();
		}
		
		System.out.println("검색할 값을 입력하시오 : ");
		int key = scanner.nextInt();
		int idx = seqSearchSen(a, num, key);
		if(idx == -1) {
			System.out.println(key + "라는 요소는 없습니다.");
		}else {
			System.out.println(key + "가 존재하는 위치는" + idx + "입니다.");
		}
	}
}
