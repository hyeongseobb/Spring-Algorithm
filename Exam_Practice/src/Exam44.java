import java.util.Arrays;
import java.util.Random;

public class Exam44 {
	public static void main(String[] args) {
		Random random = new Random();
		int[] randArray = new int[30];
		int count = 0;
		
		for(int i = 0; i < randArray.length; i++) {
			randArray[i] = random.nextInt(101);
		}
		
		for(int i = 0; i < randArray.length; i++) {
			System.out.print(randArray[i] + " ");
		}
		System.out.println();
		
		int[] randArray2 = randArray;
		//버블정렬 오름차순
		for(int i = 0; i < randArray2.length-1; i++) {
			for(int j = 0; j < randArray2.length-1; j++) {
				if(randArray2[j] > randArray2[j+1]) {
					int temp = randArray2[j+1];
					randArray2[j+1] = randArray2[j];
					randArray2[j] = temp;
					count++;
				}
			}
		}
		for(int i = 0; i < randArray.length; i++) {
			System.out.print(randArray2[i] + " ");
		}
		
		//array.sort사용
		Arrays.sort(randArray);
		System.out.println();
		System.out.print(Arrays.toString(randArray));
	}
}
