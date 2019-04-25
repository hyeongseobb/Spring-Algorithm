
public class Student {
	public String name;
	public int korScore;
	public int engScore;
	public int mathScore;
	public int totalScore;

	//Arrays.toString 을 통해 출력할 경우
//	@Override
//	public String toString() {
//		return this.name + " 국어점수 : " + this.korScore + " 영어점수 : " + this.engScore + " 수학점수 : " + this.mathScore + " 총점 : " + this.totalScore + "\n";
//	}
	
	public String print() { 
		return this.name + " 국어점수 : " + this.korScore + " 영어점수 : " + this.engScore + " 수학점수 : " + this.mathScore + " 총점 : " + this.totalScore;
	}
}
