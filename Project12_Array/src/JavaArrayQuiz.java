import java.util.Arrays;
import java.util.Scanner;

public class JavaArrayQuiz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] grades = new int[3];
		
		//성적을 입력받기
		for(int i = 0; i < grades.length; i++) {
			System.out.println("국어 점수를 넣어주세요");
			int inputValue = sc.nextInt();
			grades[i] = inputValue;
		}
		
		System.out.println("학생들의 점수는 다음과 같습니다.");
		for(int i = 0; i< grades.length; i++) {
			System.out.print(grades[i]);
			System.out.print("    ");				
		}
		//System.out.println(Arrays.toString(grades)); 위의 for문을 대신해서 배열을 바로 출력할 수 있는 기능.
		
		int inputSum = 0;
		double inputAvg = 0;
		
		//합계와 평균을 구하기
		for(int i = 0; i <grades.length; i++) {
			inputSum = inputSum + grades[i];		
		}
		inputAvg = (double) inputSum/ grades.length;
		
		System.out.println();
		System.out.println("총점은" + inputSum);
		System.out.println("평균은" + inputAvg);
	}
}
