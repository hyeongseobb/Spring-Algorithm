
public class PrimeNumberAlgorithm2 {
	public static void main(String[] args) {
		int counter = 0; //나눗셈의 횟수
		int ptr = 0; //찾은 소수의 개수
		int[] prime = new int[500]; //소수를 저장하는 배열
		
		prime[ptr++] = 2; //2는 소수임
		
		for(int n = 3; n <= 1000; n += 2) { // 짝수는 소수가 아님.
			int i;
			for(i = 1; i < ptr; i++) { // 이미 찾은 소수로 나누어봄.
				counter++;
				if(n % prime[i] == 0) { // 나누어 떨어지면 소수가 아님.
					break;
				}
			}
			if(ptr == i) { // 마지막까지 나누어 떨어지지 않음.
				prime[ptr++] = n;
			}
		}
		for(int i = 0; i < ptr; i++) {
			System.out.println(prime[i]);
		}
		System.out.println("수행한 횟수는 : " + counter);
	}
}