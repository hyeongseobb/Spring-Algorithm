
public class PrimeNumberAlgorithm1 {
	public static void main(String[] args) {
		int counter = 0;
		
		for(int n = 2; n <= 1000; n++) {
			int i;
			for(i = 2; i < n; i++) {
				counter++;
				//나누어떨어지면 소수가 아님.
				if(n % i == 0) {
					break;
				}
			}
			//마지막 까지 나누어떨어지지 않으면 소수
			if(n == i) {
				System.out.println(n);
			}
		}
		System.out.println("수행한 횟수 : " + counter);
	}
}
