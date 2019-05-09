
public class Student {
	public String name;
	public int korScore = 0;
	public int engScore = 0;
	public int mathScore = 0;
	public int totalMid = 0;
	public int totalFinal = 0;
	
	//중간고사 출력 메소드
	public void printMid() {
		System.out.println(this.name + "학생의 중간고사 국어점수 : " + this.korScore
			+ ", 중간 영어점수 : " + this.engScore
			+ ", 중간 수학점수 : " + this.mathScore + "\t중간고사 총점 : " + this.totalMid );
	}
	
	//기말고사 출력 메소드
	public void printFinal() {
		System.out.println(this.name + "학생의 기말고사 국어점수 : " + this.korScore
			+ ", 기말 영어점수 : " + this.engScore
			+ ", 기말 수학점수 : " + this.mathScore + "\t기말고사 총점 : " + this.totalFinal);
	}
	
	//성적이 오른학생 출력 메소드
	public void printGradeUpStudent() {
		System.out.println("성적이 오른 학생 : " + this.name);
	}
}
