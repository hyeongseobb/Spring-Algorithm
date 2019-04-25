
public class Exam22 {
	public static void main(String[] args) {
		//1~100까지 홀수의 합, 짝수의 합을 구하는 프로그램
		int sum = 0; //홀수 짝수의합
		
		int sum2 = 0; //짝수의 합
		for (int i = 1; i < 101; i++) {
			if(i % 2 == 0) {
				sum2 += i;
			}
			sum += i;
		}
		int sum1 = sum - sum2;//홀수의 합
		
		System.out.println("전체의 합 : " + sum);
		System.out.println("홀수의 합 : " + sum1);
		System.out.println("짝수의 합 : " + sum2);
	}
}
