package practice1;

//인터페이스란? 외부에서 규칙을 수정하거나 만들기
public class Student2 implements Comparable<Student2> {
	String name;
	int kor;
	int eng;
	int math;
	int total;

	public String print() {
		return this.name + " 총점 : " + this.total + "(국어 " + this.kor + ", 영어 " + this.eng + ", 수학 " + this.math + ")";
	}
	
	@Override
	public String toString() {
		String tmp = String.format("%03d", this.total);
		//String.format(); ->숫자를 문자열로 바꿔주는것! %03d의 의미는 3자리에서 빈부분은 0으로 채워 주는거야!
		//문자열은 첫글자부터 비교하기 때문에 자리수가 작으면 앞에 0을 붙여줘야한다!
		return tmp;
	}
	
	//우리가만든 클래스에다가 implements라는 키워드를 이용해서 (정렬을 하기위한)비교 규칙을 추가함.
	//외부에서 만든 compareTo의 규칙을 따라함.
	//compareTo의 규칙 : 내가더작을때는 음수 클때는 양수 같을때는 0을 리턴해주면 내가 알아서 오름차순정렬로 작동하는 규칙!
	@Override
	public int compareTo(Student2 o) {
		if(this.total > o.total) {
			return -1;
		} else if(this.total < o.total) {
			return 1;
		} else {
			return 0;
		}
	}
}
