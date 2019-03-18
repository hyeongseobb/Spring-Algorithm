import java.util.Scanner;

public class JavaScoreSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("김미정의 국어 점수 : ");
		int studentScore1 = sc.nextInt();
		
		System.out.println("박철수의 국어 점수 : ");
		int studentScore2 = sc.nextInt();
		
		System.out.println("이한솔의 국어 점수 : ");
		int studentScore3 = sc.nextInt();
		
		//모두다 동점인 경우
		if(studentScore1 == studentScore2 && studentScore2 == studentScore3){
			System.out.println("공동 일등");
		}
		
		//순위가 명확하게 매겨지는 경우
		else if(studentScore1 > studentScore2 && studentScore2 > studentScore3){
			System.out.println("김미정 학생 1등, 박철수 학생 2등, 이한솔 학생 3등");
		}
		else if(studentScore2 < studentScore3 && studentScore3 < studentScore1){
			System.out.println("김미정 학생 1등, 박철수 학생 3등, 이한솔 학생 2등");
		}
		else if(studentScore2 < studentScore1 && studentScore1 < studentScore3){
			System.out.println("김미정 학생 2등, 박철수 학생 3등, 이한솔 학생 1등");
		}
		else if(studentScore3 < studentScore1 && studentScore1 < studentScore2){
			System.out.println("김미정 학생 2등, 박철수 학생 1등, 이한솔 학생 3등");
		}
		else if(studentScore1 < studentScore2 && studentScore2 < studentScore3){
			System.out.println("김미정 학생 3등, 박철수 학생 2등, 이한솔 학생 1등");
		}
		else if (studentScore1 < studentScore3 && studentScore3 < studentScore2){
			System.out.println("김미정 학생 3등, 박철수 학생 1등, 이한솔 학생 2등");
		}
		
		//공동 2등인경우
		else if (studentScore1 == studentScore2 && studentScore1 < studentScore3){
			System.out.println("김미정 박철수 학생 공동2등 , 이한솔 학생 1등");
		}
		else if (studentScore1 == studentScore2 && studentScore2 > studentScore3){
			System.out.println("김미정 박철수 학생 공동 1등 , 이한솔 학생 3등");
		}
		else if (studentScore1 == studentScore3 && studentScore1 < studentScore2){
			System.out.println("김미정 이한솔 학생 공동2등 , 박철수 학생 1등");
		}
		else if (studentScore1 == studentScore3 && studentScore1 > studentScore2){
			System.out.println("김미정 이한솔 학생 공동 1등 , 박철수 학생 3등");
		}
		else if (studentScore2 == studentScore3 && studentScore2 < studentScore1){
			System.out.println("박철수 이한솔 학생 공동2등 , 김미정 학생 1등");
		}
		else if (studentScore2 == studentScore3 && studentScore3 > studentScore1){
			System.out.println("박철수 이한솔 학생 공동 1등 , 김미정 학생 3등");
		}
	}
}
