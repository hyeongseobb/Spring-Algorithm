package practice1;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RunClass2 {
	public static void main(String[] args) {
		//Random 클래스안에 있는 메소드를 사용하기위해 객체 :rand 생성
		Random rand = new Random();
		Scanner scanner = new Scanner(System.in);
		//Student 클래스안에 있는 속성값 (이름,국어점수,영어점수,수학점수,점수 합계)을 사용하기 위한 객체 배열 : student 생성
		//for문을 통한 student[i]의 공간을 만들어냄.
		Student2[] student = new Student2[10];
		String[] names = new String[10];
		
		for (int i = 0; i < student.length; i++) {
			student[i] = new Student2();
		}
		
		for (int i = 0; i < names.length; i++) {
			System.out.println((i + 1) + "번째 학생의 이름을 입력해주세요.");
			names[i] = scanner.nextLine();
			System.out.println();
		}
		
		Random2 random2 = new Random2();
		//student[i]라는 객체를 통한 클래스 Student에 있는 속성값들 랜덤으로 값채워주기.
		for (int i = 0; i < student.length; i++) {
			student[i].name = names[i]; //(i + 1) + "번 학생";
			random2.randomStudent(student[i]);
//			student[i].kor = rand.nextInt(101);  Random2라는 새로운 클래스를 만들었므로  더이상 필요없어서 주석처리
//			student[i].eng = rand.nextInt(101);
//			student[i].math = rand.nextInt(101);
		}
		
		//student[i]라는 객체를 통한 클래스 Student에 있는 점수합계 더해서 값채워주기.
//		for (int i = 0; i < student.length; i++) {
//			student[i].total = student[i].kor + student[i].eng + student[i].math;
//		}
		//순위를 매겨주기위한 배열을 정렬하는 포문 (자세하게 펼쳐봐야겠다.) 내림차순 정렬
//		for (int i = 0; i < student.length; i++) {
//			for (int j = i; j < student.length; j++) {
//				if (student[i].total < student[j].total) {
//					Student2 tmp = student[i];
//					student[i] = student[j];
//					student[j] = tmp;
//				}
//			}
//		}
		Arrays.sort(student);
		//student[0].compareTo
		for (int i = 0; i < student.length; i++) {
			System.out.println(student[i].print());
		}
	}
}
