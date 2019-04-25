import java.util.Arrays;
import java.util.Random;

public class JavaQuiz {
	public static void main(String[] args) {
		Random r = new Random();
		int[] arr = new int[30];
		
		for (int i = 0; i < arr.length; i++) {
			int randValue = r.nextInt(101);
			for (int j = 0; j < arr.length; j++) {
				arr[i] = randValue;
			}
		}
		System.out.println(Arrays.toString(arr)); //정렬 전 배열 출력
		
		Arrays.sort(arr); //배열 오름차순 정렬
		System.out.println(Arrays.toString(arr)); //정렬 후 배열 출력
	
	}
}
