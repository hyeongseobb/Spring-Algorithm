
public class StudentGrade {
	String name;
	int korScore;
	int engScore;
	int mathScore;
	int totalScore;
	double avgScore;
	
	public int totalMethod () {
		return this.korScore + this.engScore + this.mathScore;
	}
	
	public double avgMethod() {
		StudentGrade sum = new StudentGrade();
		this.totalScore = sum.totalMethod();
		return (double)totalScore / 3;	
	}
	
	@Override
	public String toString() {
		return this.name + " 총점 : " + this.totalScore +", 평균 : " + this.avgScore + "(국어 " + this.korScore + ", 영어 " + this.engScore + ", 수학 " + this.mathScore + ")"; 
	}
}
