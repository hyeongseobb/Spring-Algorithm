
public class TotalNumber {
	public void doTotal() {
		int totalNumber = 0;
		for (int i = 0; i < 100; i++) {
			int number = i + 1;
			totalNumber = totalNumber + number;
		}
		
		System.out.println("1부터 100까지 합은 " + totalNumber);
	}
}
