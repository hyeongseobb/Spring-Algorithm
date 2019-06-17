import java.util.Random;

public class Algorithm111 {
	//연습문제 Q1
	public static void main(String[] args) {
		Random random = new Random();
		int num = random.nextInt(20) + 1;
		int[] height = new int [num];
		
		for(int i = 0; i < num; i++) {
			height[i] = random.nextInt(100) + 100;
			System.out.println("height[" + i + "]  = " + height[i]);
		}
		System.out.println("Answer : height 배열의 최댓값  = "+ maxOfArray(height));
	}
	
	//배열 요소값의 max를 구해주는 메소드
	static int maxOfArray(int[] a) {
		int max = a[0];
		for(int i = 0; i < a.length; i++) {
			if(a[i] > max) {
				max = a[i];
			}
		}
		return max;
	}
}
