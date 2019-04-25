import java.util.Arrays;
import java.util.Scanner;

public class ArrayQuizTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[4][4];
				
		for(int i = 0; i < 3; i++) {
			for(int j = 0 ; j < 3; j++) {
				int inputValue = sc.nextInt();
				arr[i][j] = inputValue;
			}
		}
			
		int sum = 0;
		int sum1 = 0;
		int sum2 = 0;
		
		for(int i = 0; i < arr.length-1; i++) {
			for(int j = 0; j < arr.length-1; j++) {
				System.out.print(arr[i][j] + " ");
				if(i==0) {
					sum = sum + arr[0][j];
				}
				else if(i==1) {
					sum1 = sum1 + arr[1][j];
				}
				else {
					sum2 = sum2 + arr[2][j];
				}					
			}
			if(i==0) {
				System.out.print(sum);
			}
			else if(i==1) {
				System.out.print(sum1);
			}
			else {
				System.out.print(sum2);
			}					
			System.out.println();
		}
	}
}
