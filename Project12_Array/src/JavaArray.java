import java.util.Arrays;

public class JavaArray {
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5};
		
		for(int i = 0; i< arr.length; i++) {
			System.out.print(arr[i]);
			System.out.print("  ");				
		}
		System.out.println();
			
		int[] arr2 = arr;
		int[] arr3 = arr2;
		
		arr3[0] = 10;
		
		for(int i = 0; i< arr.length; i++) {
			System.out.print(arr[i]);
			System.out.print("  ");				
		}
		// System.arraycopy()를 이용하면 공간을 새로 만들어 값을 넣을 수 있음.
		
		System.out.println(Arrays.toString(arr)); //for문 필요없이 배열자체를 출력해주는것.
		
		int[] array = {10,20,30,40,50};
		
		for(int value : array) {
			System.out.print(value);
		}
	}
}
