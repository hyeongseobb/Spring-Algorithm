
public class MakeSum {
	public void doMake(int startNumber, int endNumber) { //doMake 라는 메소드를 만듬
		int totalNumber = 0;
		for(int i = startNumber; i< endNumber; i++) {
			totalNumber = totalNumber + i;
		}
		System.out.println("시작값 : " + startNumber + ", 종료값: " + endNumber);
		System.out.println("범위 합계 : " + totalNumber);
	}
}
