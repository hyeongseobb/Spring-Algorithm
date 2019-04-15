
public class O2 { // extends Object와 동일
	int name = 1;
	@Override //부모가 아래의 메소드가없으면 에러가 발생. 부모 클래스에 있는 메소드를 자식 클래스에서 재정의한다는 뜻!
	//왠만하면 지우지 말것.
	public String toString() {
		// TODO Auto-generated method stub
		return "" + this.name;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		O2 obj2 = (O2)obj;
		//전역변수 String name을 사용하기 위해서 obj를 (O2)로 형변환(casting)함. 캐스팅은 값을 바꾸는것이아니라
		//값을 인지하는 기준을 바꿔 주는 것이다.
		if(this.name == obj2.name) {
			return true;
		}
		return false;
		// return this.name == obj2.name if아래3줄대신에 왼쪽에 있는걸 써도 동일한 결과가 출력된다.
	}
}
