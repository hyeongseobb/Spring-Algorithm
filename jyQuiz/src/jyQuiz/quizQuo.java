package jyQuiz;

public class quizQuo {
	//최종 몫 구하기
	public void quo(int inputNum){
		//최종 몫을 구하는 것.
		while(inputNum >= 8) {
			inputNum = inputNum / 8;
		}
		System.out.print(inputNum);
	}
}
