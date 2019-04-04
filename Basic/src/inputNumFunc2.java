import java.util.Arrays;

public class inputNumFunc2 {
	public int inputNum;
	public int remainder;
	public int a = 1;
	public int b = 0;
	
//	static void reverse(int a[], int n) {
//		int[] b = new int[n];
//		int j = n;
//		for (int i = 0; i < n; i++) {
//			b[j - 1] = a[i];
//			j = j - 1;			
//		}
//		for(int k = 0; k < n; k++) {
//			System.out.print(b[k] + " ");
//		}	
//	}
	
	//나머지를 구하는 함수
	public void Remain(int inputNum2) {
		for(int i = 0; i < a; i++) {
			if(inputNum2 >= 8) {
				remainder = inputNum2 % 8;
				inputNum2 = inputNum2 / 8;
				a = a + 1;
			}
			else if (inputNum2 < 8){
				break;
			}
			System.out.println(Integer.toString(reverse(remainder)));
		}
	}	
}
