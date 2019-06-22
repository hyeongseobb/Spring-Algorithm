
public class ForEach {
	public static void main(String[] args) {
		int [] testArray = {1, 2, 3, 4, 5};
		int sum = 0;
		
		for(int i : testArray) {
			System.out.print(i + " ");
			sum += i;
		}
		System.out.println("\n 배열 모든 요소의 합계 : " + sum);
	}
}
