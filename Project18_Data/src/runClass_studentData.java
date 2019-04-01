import java.util.Scanner;

public class runClass_studentData {
	public static void main(String[] args) {	
		Student [] sArray = new Student[5];
		Scanner sc = new Scanner(System.in);
		
		//변수 선언
		double sum = 0;
		double avg = 0;
		double subjectSum1 = 0;
		double subjectAvg1 = 0;
		double subjectSum2 = 0;
		double subjectAvg2 = 0;
		double subjectSum3 = 0;
		double subjectAvg3 = 0;
		
		for(int i = 0; i < sArray.length; i++) {
			sArray[i] = new Student();
			System.out.println("" + (i + 1) + "번째학생 데이터 입력");
			System.out.print("이름 : ");
			sArray[i].name = sc.nextLine();
			System.out.print("국어 점수 : ");
			String korString = sc.nextLine();
			sArray[i].korScore = Integer.parseInt(korString);
			System.out.print("영어 점수 : ");
			String engString = sc.nextLine();
			sArray[i].engScore = Integer.parseInt(engString);
			System.out.print("수학 점수 : ");
			String mathString = sc.nextLine();
			sArray[i].mathScore = Integer.parseInt(mathString);
		
			
			subjectSum1 = subjectSum1 + sArray[i].korScore;
			subjectAvg1 = subjectSum1 / sArray.length; 
		
			subjectSum2 = subjectSum2 + sArray[i].engScore;
			subjectAvg2 = subjectSum2 / sArray.length; 
			
			subjectSum3 = subjectSum3 + sArray[i].mathScore;
			subjectAvg3 = subjectSum3 / sArray.length; 
			
		}
		System.out.println("\n" + "전체 학생의 국어 점수의 합 : " + subjectSum1);
		System.out.println("전체 학생의 국어 점수의 평균 : " + subjectAvg1+ "\n");
		
		System.out.println("전체 학생의 영어 점수의 합 : " + subjectSum2);
		System.out.println("전체 학생의 영어 점수의 평균 : " + subjectAvg2+ "\n");
		
		System.out.println("전체 학생의 수학 점수의 합 : " + subjectSum3);
		System.out.println("전체 학생의 수학 점수의 평균 : " + subjectAvg3+ "\n");
	}
}
