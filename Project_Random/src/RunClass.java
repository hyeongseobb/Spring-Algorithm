
public class RunClass {
	public static void main(String[] args) {
		double randNum = Math.random();
		System.out.println(randNum);
		
		double choice = Math.floor(randNum * 5);
		//floor는 내림
		System.out.println(choice);
		
//		Integer a = new Integer(10);
//		int b = a;
//		System.out.println(b);
		//위처럼 new로 쓰지 말고 valueOf로 쓴다.
		Integer a = Integer.valueOf(10);
		//기존에 있는 값을 가져와서 객체 형태로써라
		int b = a;
		System.out.println(b);
		
		//랜덤 import없이 사용하는 법
		java.util.Random rand = new java.util.Random();
	}
}
