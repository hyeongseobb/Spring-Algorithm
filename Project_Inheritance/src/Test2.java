
public class Test2 extends Test {
	public void printResult () { 
		
		//자식 클래스에 있는 printResult의 기능을 바꾸면 부모클래스의 printResult의 기능은 수행하지 않음.
		
		super.printResult(); //단, 옆의 super.를 활용하면 부모 클래스에 있는 printResult의 기능(메소드)도 실행이 가능함.
		System.out.println("더하기 결과 : " + (this.number1 + this.number2));
		System.out.println("빼기 결과 : " + (this.number1 - this.number2));
		System.out.println("곱하기 결과 : " + (this.number1 * this.number2));
		System.out.println("나누기 결과 : " + ((double)this.number1 / this.number2));
		//나누기 할 때는 항상 형변환(캐스팅)을 해준다.
	}
	public void newMethod() {
		
	}
}
