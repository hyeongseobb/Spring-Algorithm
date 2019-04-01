import java.util.Scanner;

public class runClass {
	public static void main(String[] args) {
		Student[] sArray = new Student[10]; //배열공간을 만듬.
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < sArray.length; i++) {
			sArray[i] = new Student(); //Student클래스에서 선언한 것들로 배열안에 값을 넣음.
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
			//cf. 정규 표현식 참고하기
		}
	}
}
