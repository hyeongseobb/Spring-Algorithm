import java.util.Scanner;

public class insertionSort {
	// 스왑
	static void swap(int[] a, int idx1, int idx2) {
		int temp = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = temp;
	}
	
	// 단순 삽입 정렬: 선택한 요소를 그보다 더 앞쪽의 알맞은 위치에 삽입하는 작업을 반복하여 정렬하는 알고리즘.
	static void insertionSort(int[] a, int n) {
		for(int i = 1; i < n; i++) {
			int j;
			int tmp = a[i];
			for(j = i; j > 0 && a[j - 1] > tmp; j--) {
				a[j] = a[j - 1];
			}
			a[j] = tmp;
		}
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("단순교환정렬(버블정렬)");
		System.out.print("요솟수：");
		int nx = stdIn.nextInt();
		int[] x = new int[nx];

		for (int i = 0; i < nx; i++) {
			System.out.print("x[" + i + "]：");
			x[i] = stdIn.nextInt();
		}

		insertionSort(x, nx); // 배열 x를 단순교환정렬

		System.out.println("오름차순으로 정렬했습니다.");
		for (int i = 0; i < nx; i++)
			System.out.println("x[" + i + "]＝" + x[i]);
	}
}
