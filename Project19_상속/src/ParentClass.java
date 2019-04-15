
public abstract class ParentClass {
	public void print1() {
		System.out.println("hello");
	}
	//abstract 추상화란, 상속받는애는 꼭 print2라는 메소드를 만들어야 해!라고 컴퓨터에게 말하는것
	public abstract void print2();
}
