import java.util.Scanner;

public class JavaScore2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		 System.out.println("첫번째 학생의 점수는 : ");
		int firstScore = sc.nextInt();
		
		System.out.println("두번째 학생의 점수는 : ");
		int secondScore = sc.nextInt();
		
		System.out.println("세번째 학생의 점수는 : ");
		int thirdScore = sc.nextInt(); 
		
		int scoreSum = (firstScore + secondScore + thirdScore);
		double scoreAverage = (double)(firstScore + secondScore + thirdScore) / 3;
		
		System.out.printf("\n 세 학생의 총점은 %d, 세 학생의 평균은 %f", scoreSum, scoreAverage);
		
	}
}
