
public class DataStructure_StringBuilder {
	
	public static void main(String[] args) {
		//문자열 역순 배열하기
		//자바에 내장된 StringBuilder클래스 객체화하여
		//인스턴스 builder를 이용한 StringBuilder클래스의 메소드(append,reverse) 사용
		StringBuilder builder = new StringBuilder();
		builder.append("이형섭바보");
		
		builder.reverse();
		System.out.println(builder);
	}
}
