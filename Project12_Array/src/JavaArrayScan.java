import java.util.Scanner;

public class JavaArrayScan {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [][] arr = new int[4][4];
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				int inputValue = sc.nextInt();
				arr[i][j] = inputValue;
			}
		}
		
		int arrResult = 0;
		for(int i = 0; i < arr.length-1; i++) {
			arrResult=0;
			for(int j = 0; j < arr[i].length; j++) {
				
				if(j == arr[i].length-1) {
					arr[i][j] = arrResult;
					arr[3][j] = arr[i][j] + arr[3][j];
				}else {
				
					arrResult = arr[i][j] + arrResult;
					System.out.print(arr[i][j] + "       ");
					
					if(i == arr[i].length-1) {
						
					}else {
						arr[3][j] = arr[i][j] + arr[3][j];
					}
				
				}
			}
			System.out.println();
		}		
	}
}
