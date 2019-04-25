import java.util.Scanner;

public class Exam66 {
	
	public static void main(String[] args) {
		int[][] inputArray = new int[4][4];
		
		Scanner scanner = new Scanner(System.in);
		
		for(int i = 0; i < inputArray.length-1; i++) {  // 0 1 2
			for (int j = 0; j < inputArray.length-1; j++) { // 0 1 2
				
				inputArray[i][j]=scanner.nextInt();
				
//				inputArray[0][3] = inputArray[0][0] + inputArray[0][1] + inputArray[0][2];
//				inputArray[1][3] = inputArray[1][0] + inputArray[1][1] + inputArray[1][2];
//				inputArray[2][3] = inputArray[2][0] + inputArray[2][1] + inputArray[2][2];	
//				inputArray[i][3] = inputArray[i][0] + inputArray[i][1] + inputArray[i][2];
				
				inputArray[i][3] += inputArray[i][j];
				
					
//				inputArray[3][0] = inputArray[0][0] + inputArray[1][0] + inputArray[2][0];
//				inputArray[3][1] = inputArray[0][1] + inputArray[1][1] + inputArray[2][1];
//				inputArray[3][2] = inputArray[0][2] + inputArray[1][2] + inputArray[2][2];
				inputArray[3][j] += inputArray[i][j];
				
				inputArray[3][3] += inputArray[i][j];
				
			}
		}
		for (int i = 0; i < inputArray.length; i++) {
			for (int j = 0; j < inputArray.length; j++) {
				System.out.print(inputArray[i][j] + "  ");
			}
			System.out.println();
		}
	}

}
