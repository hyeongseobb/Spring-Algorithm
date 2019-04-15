
public class Pet {
	private String kind;
	private int age;
	static int count = 0;
	
	//생성자
	Pet(String kind, int age) {
		this.kind = kind;
		this.age = age;
	}
	
	public void move() {
		System.out.println(this.kind + "가 움직입니다.");
	}
	
	public String getKind() {
		return this.kind;
	}
	
	public int getAge() {
		return this.age;
	}
	
	static int getCount() {
		return count;
	}
}
