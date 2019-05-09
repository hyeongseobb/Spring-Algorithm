import java.util.Random;

public class StudentMain {
	public static void main(String[] args) {
		Student[] studentMidScore = new Student[100];
		Student[] studentFinalScore = new Student[100];
		
		Random random = new Random();
		//mid와 final의 배열의 크기는 같음.
		for (int i = 0; i < studentMidScore.length; i++) {
			studentMidScore[i] = new Student();
			studentFinalScore[i] = new Student();
		}
		//중간고사의 점수
		for(int i = 0; i < studentMidScore.length; i++) {
			studentMidScore[i].name = (i + 1) + "번째 학생";
			studentMidScore[i].korScore = random.nextInt(101);
			studentMidScore[i].engScore = random.nextInt(101);
			studentMidScore[i].mathScore = random.nextInt(101);
		}
		//기말고사의 점수
		for(int i = 0; i < studentFinalScore.length; i++) {
			studentFinalScore[i].name = (i + 1) + "번째 학생";
			studentFinalScore[i].korScore = random.nextInt(101);
			studentFinalScore[i].engScore = random.nextInt(101);
			studentFinalScore[i].mathScore = random.nextInt(101);
		}
		//중간고사의 합
		for (int i = 0; i < studentMidScore.length; i++) {
			studentMidScore[i].totalMid = studentMidScore[i].korScore + studentMidScore[i].engScore + studentMidScore[i].mathScore;
		}
		
		//기말고사의 합
		for (int i = 0; i < studentFinalScore.length; i++) {
			studentFinalScore[i].totalFinal = studentFinalScore[i].korScore + studentFinalScore[i].engScore + studentFinalScore[i].mathScore;
		}
		
		//중간고사 결과 출력
		for (int i = 0; i < studentMidScore.length; i++) {
			studentMidScore[i].printMid();
		}
		System.out.println();
		
		//기말고사 결과 출력
		for (int i = 0; i < studentFinalScore.length; i++) {
			studentFinalScore[i].printFinal();
		}
		System.out.println();
		
		//기말고사의합이 중간고사의 합보다 큰 학생만 뽑아보자
		for (int i = 0; i < studentFinalScore.length; i++) {
			if(studentMidScore[i].totalMid < studentFinalScore[i].totalFinal) {
				studentFinalScore[i].printGradeUpStudent();
			}
		}
	}
}
