import java.util.Random;

public class Student {
	String name;
	int middleScore;
	int finalScore;
	int scoreGap;
	
	Student(String name) {
		this.name = name;
		Random random = new Random();
		this.middleScore = random.nextInt(1001);
		this.finalScore = random.nextInt(1001);
		this.scoreGap = this.finalScore - this.middleScore;
	}
	@Override
	public String toString() {
		return "성적이 떨어진 " + this.name + " (중간 : " + this.middleScore + ", 기말 : " + this.finalScore + ")";
	}
}
