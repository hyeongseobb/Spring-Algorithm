import java.util.Random;

public class JavaScore3 {
	public static void main(String[] args) {
		Random r = new Random();
		
		int totalScore = 0;
		/*for(int i = 0; i < 3; i++) {
			int randomScore = r.nextInt(101);
			System.out.println("입력된 점수 : " + randomScore);
			totalScore = totalScore + randomScore;
		}*/
		
		int index = 0;
		while(index < 3) {
			int randomScore = r.nextInt(101);
			System.out.println("입력된 정수 : " + randomScore);
			totalScore = totalScore + randomScore;
			index++;	
		}
		
		System.out.println("총점은 " + totalScore + "입니다.");
		
		double averageScore = 0;
		averageScore = (double)totalScore / 3;
		
		System.out.println("평균은 " + averageScore + "입니다.");
  }
}