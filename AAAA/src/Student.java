
import java.util.Random;

public class Student {
	public int korean;
	public int eng;
	public int math;
	public double avg = 0;
	
	public void setScore() {
		Random rand = new Random();
		this.korean = rand.nextInt(101);
		this.eng = rand.nextInt(101);
		this.math = rand.nextInt(101);
		
		this.setAvg();
	}
	
	public void setAvg() {
		this.avg = (korean + eng + math) / 3;
	}
	
	public void print() {
		System.out.println("학생의 국어 : " + this.korean
			+ ", 영어 : " + this.eng
			+ ", 수학 : " + this.math
			+ ", 평균 : " + this.avg + "\n");
	}
}

