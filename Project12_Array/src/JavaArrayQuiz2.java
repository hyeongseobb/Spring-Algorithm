import java.util.Arrays;
import java.util.Scanner;

public class JavaArrayQuiz2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String [] student1 = new String[4];
		String [] student2 = new String[4];
		String [] student3 = new String[4];
		String [] student4 = new String[4];
		
		//학생의 이름, 국어점수, 수학점수, 영어점수 입력받기 문자열로 입력받은뒤 형변환을 해보자!

		for (int i = 0; i < student1.length; i++) {
			System.out.println("학생의 이름, 국어점수, 수학점수, 영어점수를 순서대로 입력해주세요.");
			String student1Value = sc.next();
			student1 [i] = student1Value;
		}
		System.out.println(Arrays.toString(student1));
		//아직 미완성..
	}
}
