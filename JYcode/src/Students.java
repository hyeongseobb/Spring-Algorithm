
public class Students {
	//private => 클래스 안의 메소드에서는 접근이 가능하지만, 인스턴스를 통해 직접 필드에 접근할 수 없다.
	private String name = "";
	private int korean = 0;
	private int eng = 0;
	private int math = 0;
	//순위를 메기기 위해 평균 프로퍼티를 추가합니다.
	private double avg = 0;
	
	public void setName(String name) {
		this.name = name;
	}
	//Random클래스에서 점수를 입력하기위해 각각의 점수를 setting할수있는 메소드를 만듭니다.
	public void setScore(int korean, int eng, int math) {
		this.korean = korean;
		this.eng = eng;
		this.math = math;
		
		//순위를 메기기 위해 평균을 낸다.
		this.avg = (this.korean + this.eng + this.math) / 3.0;
		//소수 둘째자리 까지만 출력.
		this.avg = (int)(this.avg * 100) / 100; 
	}
	
	//순위를 메기기위해 낸 평균을 비교하기위해 평균을 가져올수 있는 메소드를 만들어야한다.
	public double getAvg() {
		return this.avg;
	}
	
	//Object클래스에서 제공되는 toString을 통해 print할때의 출력형태를 만들어줍니다.
	@Override
	public String toString() {
		String result = String.format("studentName : %s, Korean : %d, Eng : %d, Math : %d, Avg : %f\n", this.name, this.korean, this.eng, this.math, this.avg);
		return result;
	}
}
