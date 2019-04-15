import java.util.Arrays;
import java.util.Random;

public class RunClass2 {
	public static void main(String[] args) {
		StudentGrade[]student = new StudentGrade[10];
		Random random = new Random();
		
		for(int i = 0; i < student.length; i++) {
			student[i] = new StudentGrade();
		}
		
		for(int i = 0; i < student.length; i++) {
			student[i].name = (i + 1) + "번 학생";
			student[i].korScore = random.nextInt(101);
			student[i].engScore = random.nextInt(101);
			student[i].mathScore = random.nextInt(101);	
			student[i].totalScore = student[i].korScore + student[i].engScore + student[i].mathScore;
		}
		
		for(int i = 0; i < student.length; i++) {
			student[i].avgScore = (double)student[i].totalScore /3;
		}
		
		for(int i = 0; i < student.length; i++) {
			System.out.print(student[i] + "\n");
		}
	}
}
