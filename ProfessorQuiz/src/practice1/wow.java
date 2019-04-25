package practice1;
import java.util.Scanner;

public class wow {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("배열크기입력");
		int inputValue1 = sc.nextInt();
		int [][] arr = new int[inputValue1+1][inputValue1+1];
		
		System.out.println("배열내용입력");
		for(int i = 0; i < inputValue1; i++) {
			for(int j = 0; j < inputValue1; j++) {
				int inputValue = sc.nextInt();
				arr[i][j] = inputValue;
			}
		}
		
		for(int i = 0; i < inputValue1+1; i++) {
			for(int j = 0; j < inputValue1+1; j++) {
				System.out.print(arr[i][j] + " ");
				arr[i][inputValue1] = arr[i][j] + arr[i][inputValue1];
				arr[inputValue1][j] = arr[i][j] + arr[inputValue1][j];
			}
			System.out.println();
		}
		
		
//		int [][] arr = new int[4][4];
//		
//		for(int i = 0; i < 3; i++) {
//			for(int j = 0; j < 3; j++) {
//				int inputValue = sc.nextInt();
//				arr[i][j] = inputValue;
//			}
//		}
//		
//		for(int i = 0; i < arr.length; i++) {
//			for(int j = 0; j < arr.length; j++) {
//				System.out.print(arr[i][j] + "        ");
//				arr[i][3] = arr[i][j] + arr[i][3];
//				arr[3][j] = arr[i][j] + arr[3][j];
//			}
//			System.out.println();
//		}
	}
}
