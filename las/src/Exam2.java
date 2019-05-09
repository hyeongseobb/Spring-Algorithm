import java.util.Scanner;

public class Exam2 {
	private String inputNum;
	private int calNum = 0;
	private int sumValue = 0;
	private int factValue = 1;
	
	public void inputValue() {//입력받기
		Scanner scanner = new Scanner(System.in);
		inputNum = scanner.nextLine();
	}
	
	public void sumMethod() {//형변환 후 합하고 출력
		this.calNum = Integer.parseInt(inputNum);
		for(int i = this.calNum; i > 0; i--) {
			sumValue += i;
		}
		System.out.println("1부터 "+ this.calNum + "까지의 합은: " + sumValue);
	}
	
	public void factorialMethod() {//형변환 후 factorial 구하고 출력
		//한계: int 자료형의 숫자범위를 넘어버리면 마이너스 값이 나온다.
		this.calNum = Integer.parseInt(inputNum);
		for(int i = this.calNum; i > 0; i--) {
			factValue = factValue * i;
		}
		System.out.println("1부터 "+ this.calNum + "까지의 곱은: " + factValue);
	}
}
