
public class PrimeNumberAlgorithm3 {
	public static void main(String[] args) {
		//같은 답을 얻는 알고리즘은 하나가 아니다.
		//빠른 알고리즘은 메모리를 많이 요구한다.
		int counter = 0;
		int ptr = 0;
		int[] prime = new int[500]; //2이외의 짝수는 소수가 아닌것이 분명하므로, 적어도 절반을 준비하면 소수를 배열에 저장 할 수 있음.
		
		prime[ptr++] = 2; //2는 소수임
		prime[ptr++] = 3; //3은 소수임
		
		for(int n = 5; n <= 1000; n += 2) { //짝수는 소수가 아님.
			boolean flag = false;
			for(int i = 1; prime[i]*prime[i] <=n; i++) { // 소수의 제곱근까지만 비교.
				counter+=2; //곱한것과 나눈것이 두가지 있으므로 2의 비용을 더함.
				if(n % prime[i] == 0) { //나누어 떨어지면 소수가 아님.
					flag = true;
					break;
				}
			}
			if(!flag) { //소수인 경우 배열에 저장
				prime[ptr++] = n; 
				counter++;
			}
		}
		for(int i = 0; i < ptr; i++) { //찾은 ptr개의 소수를 출력
			System.out.println(prime[i]);
		}
		System.out.println("수행한 횟수 : " + counter);
	}
}
