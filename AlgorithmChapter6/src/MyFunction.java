public class MyFunction {
	public static void myFunction (int[] a, int b) {
		for(int i = 0; i < a.length; i++) {
			for(int j = i + 1; j < a.length; j++) {
				if(a[i] + a[j] == b) {
					System.out.println("두개의 합이 5가되는 index1:" + i + ", index2:" + j);
				}
			}
		}
	}
	public static void main(String[] args) {
		int[] a = {1,2,3,4};
		myFunction(a,5);
	}
}
