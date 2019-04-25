
public class StudentGrade {
	String name;
	int korScore;
	int engScore;
	int mathScore;
	int totalScore;
	double avgScore;
	
	@Override
	public String toString() {
		return this.name + " 총점 : " + this.totalScore +", 평균 : " + this.avgScore + ", (국어 " + this.korScore + ", 영어 " + this.engScore + ", 수학 " + this.mathScore + ")"; 
	}
}
