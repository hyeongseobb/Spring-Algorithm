package jyQuiz;
import java.util.Scanner;

public class quizMain {	
	//메인
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력해주세요 : ");
		int inputNum = sc.nextInt();
		
		System.out.print("8진수로 변환한 값은 : ");
		quizQuo qu = new quizQuo();
		qu.quo(inputNum);
		
		quizRemain re = new quizRemain();
		re.rem(inputNum);
	}
}
