
public class Sumsum {
	public void SumMethod(int start, int end) {
		int sumValue = 0;
		for(int i = 0; i <= end;i++ ) {
			sumValue = sumValue + i ;
		}		
		System.out.println("시작값 : " + start);
		System.out.println("종료값 : " + end);
		System.out.println("총합 : " + sumValue);
	}
	
	public static void main(String[] args) {
		Sumsum s = new Sumsum();
		s.SumMethod(1,100);
	}
}
