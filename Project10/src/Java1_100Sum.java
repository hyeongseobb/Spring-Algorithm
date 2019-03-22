
public class Java1_100Sum {
	public static void main(String[] args) {
	
	//1부터 100까지의 합
	
		int sum0 = 0;
		for(int i = 0; i < 100; i++) {
				int number = i + 1;
				sum0 = sum0 + number;
		}
		System.out.println("1부터 100까지의 합은 : " + sum0);
		
	/*홀수의 합
		int sum1 = 0;
		for(int i = 0; i < 101; i++) {
			if(i % 2 == 1) {
				sum1 = sum1 + i;
			}
			else {
				sum1 = sum1;
			}
		}
		System.out.println("1부터 100까지 홀수의 합은 : " + sum1);
		
	짝수의 합
		int sum2 = 0;
		for(int i = 0; i < 101; i++) {
			if(i % 2 == 0) {
				sum2 = sum2 + i;
			}
		}
		System.out.println("1부터 100까지 짝수의 합은 : " + sum2);*/
		
		int sum1 = 0;
		int sum2 = 0;
		for(int i = 0; i < 101; i++) {
			if(i % 2 == 1) {
				sum1 = sum1 + i;
			}
			else if(i % 2 == 0) {
				sum2 = sum2 + i;
			}
		}
		System.out.println("1부터 100까지 홀수의 합은 : " + sum1);
		System.out.println("1부터 100까지 짝수의 합은 : " + sum2);
	}
}

