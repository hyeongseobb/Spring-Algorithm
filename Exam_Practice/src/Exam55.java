import java.util.Scanner;

public class Exam55 {
	public static void main(String[] args) {
		int[][] inputArray = new int[4][4];
		Scanner scanner = new Scanner(System.in);
		
		for(int i = 0; i < inputArray.length-1; i++) {  
			for (int j = 0; j < inputArray.length-1; j++) { 
				inputArray[i][j]=scanner.nextInt();
			}
		}
		for (int i = 0; i < inputArray.length; i++) {
			for (int j = 0; j < inputArray.length; j++) {
				System.out.print(inputArray[i][j] + "  ");
				//출력을 먼저해주면 값이 제대로나옴^^
				inputArray[i][3] += inputArray[i][j];	
				inputArray[3][j] += inputArray[i][j];
			}
			System.out.println();
		}
	}
}
