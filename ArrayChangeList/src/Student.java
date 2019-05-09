
import java.util.Random;

public class Student {
	public String name = "";
	public int midTotal = 0;
	public int finalTotal  = 0;
	
	//생성자 변수의 초기값 설정
	Student(String name) {
		this.name = name;
		Random random = new Random();
		this.midTotal = random.nextInt(1001);
		this.finalTotal = random.nextInt(1001);
	}
	
	public void printScore() {
		System.out.println(this.name + "의 (중간고사 총점 : " + this.midTotal
				+ ",  기말고사 총점 : " + this.finalTotal + ")");
	}
	
	public void printGradeUpStudent() {
		System.out.println("성적이 향상된 학생 : " + this.name);
	}
}
