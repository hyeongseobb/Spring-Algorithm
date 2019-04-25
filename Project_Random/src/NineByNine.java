import java.util.Scanner;

public class NineByNine {
	int dan;
	public void inputDan() throws Exception {
		//throws Exception을 사용하면 try catch문을 빼주고 main쪽으로 이동시켜준다.
		//아래를 실행하다가 에러가 발생하면 main쪽으로 에러를 던져준다?
		//에러를 상위클래스에서 처리
		//throws를 사용하는 경우는 강제로 예외를 발생시킬때/ 예외를 모아서 처리해야할 때 사용한다.
		Scanner scanner = new Scanner(System.in);
		System.out.println("출력할 단을 입력하세요 : ");
		String inputNum = scanner.next();
		this.dan = Integer.parseInt(inputNum);

//		if (this.dan == 0) {
//			throw new Exception("not allow 0");
//			//강제로 에러를 발생시키
//		}
		this.printResult();
	}
	
	private void printResult() {
		//private를 사용하면 이 메소드는 클래스 내부에서만 사용가능함. 외부클래스에서 사용불가능.
		for (int j = 1; j < 10; j++) {
			System.out.println(this.dan + " * " + j + " = " + this.dan * j);
		}
	}
}
