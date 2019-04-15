import java.util.Arrays;
import java.util.Random;

public class RunClass {
	public static void main(String[] args) {
		//Random 클래스안에 있는 메소드를 사용하기위해 객체 :rand 생성
		Random rand = new Random();
		
		//Student 클래스안에 있는 속성값 (이름,국어점수,영어점수,수학점수,점수 합계)을 사용하기 위한 객체 배열 : student 생성
		//for문을 통한 student[i]의 공간을 만들어냄.
		Student[] student = new Student[10];
		for (int i = 0; i < student.length; i++) {
			student[i] = new Student();
		}
		
		//student[i]라는 객체를 통한 클래스 Student에 있는 속성값들 랜덤으로 값채워주기.
		for (int i = 0; i < student.length; i++) {
			student[i].name = (i + 1) + "번 학생";
			student[i].kor = rand.nextInt(101);
			student[i].eng = rand.nextInt(101);
			student[i].math = rand.nextInt(101);
		}
		
		//student[i]라는 객체를 통한 클래스 Student에 있는 점수합계 더해서 값채워주기.
		for (int i = 0; i < student.length; i++) {
			student[i].total = student[i].kor + student[i].eng + student[i].math;
		}
		//순위를 매겨주기위한 배열을 정렬하는 포문 (자세하게 펼쳐봐야겠다.)
		for (int i = 0; i < student.length; i++) {
			for (int j = i; j < student.length; j++) {
				if (student[i].total < student[j].total) {
					Student tmp = student[i];
					student[i] = student[j];
					student[j] = tmp;
				}
			}
		}
		for (int i = 0; i < student.length; i++) {
			System.out.println(student[i].print());
		}
	}
}
