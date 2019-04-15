package JyQuiz;

//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;

public class quizRemain {
	public void rem(int inputNum) {
		//나머지 구하기
		int inputNum2 = inputNum;
		String reverseRemain = "";
		String saveRemain = "";
		
		while(inputNum >= 8) {
			inputNum2 = inputNum % 8;
			inputNum = inputNum / 8;
			saveRemain = Integer.toString(inputNum2);
			reverseRemain = saveRemain + reverseRemain;
		}
		System.out.print(reverseRemain);
//			int len = saveRemain.length();
//			for (int i = len; i > 0; i--) {
//				System.out.print(saveRemain.substring(i - 1, i));
//			} 문자 역순출력
	}
}	

