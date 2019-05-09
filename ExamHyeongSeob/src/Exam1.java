
public class Exam1 {
	public static void main(String[] args) {
		//1번문제 5의 배수의 합을 구하시오
		int fiveSumValue = 0;
		for(int i = 1; i < 1001; i++) {
			if(i % 5 == 0) {
				fiveSumValue += i;
			}
		}
		System.out.println("1부터 1000까지의 5의배수의 합은 : " + fiveSumValue);
	}
}
