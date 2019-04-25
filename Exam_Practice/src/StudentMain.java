import java.util.Arrays;
import java.util.Random;
//다음 단계 -> 오름차순으로 정렬하여 순위 매기기
public class StudentMain {
	public static void main(String[] args) {
		Student[] student = new Student[10];
		NewRandom random2 = new NewRandom();
		
		for (int i = 0; i < student.length; i++) {
			student[i] = new Student();
		}
		
		for(int i = 0; i < student.length; i++) {
			student[i].name = (i + 1) + "번째 학생";
			student[i].korScore = random2.nextInt(70);
			student[i].engScore = random2.nextInt(70);
			student[i].mathScore = random2.nextInt(70);
		}
		
		for (int i = 0; i < student.length; i++) {
			student[i].totalScore = student[i].korScore + student[i].engScore + student[i].mathScore;
		}
		
		//오름차순 정렬
		for (int i = 0; i < student.length; i++) {
			for (int j = i; j < student.length; j++) {
				if (student[i].totalScore < student[j].totalScore) {
					Student tmp = student[i];
					student[i] = student[j];
					student[j] = tmp;
				}
			}
			System.out.println(i + 1 + "등 ! " + student[i].print());
			//.print!
		}
		
//		System.out.println(Arrays.toString(student));
	}
}
