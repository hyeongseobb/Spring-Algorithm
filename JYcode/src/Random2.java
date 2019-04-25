import java.util.Random;

public class Random2 extends Random {
	// overloading
	// nextInt를 Students 객체데이터를 인자로 받을 수 있게 overloading한다.
	// 이부분 잘모르게써요 -형섭
	public Students nextInt(Students std) {
		//Students 객체를 인자로 받아 해당 인스턴스의 setScore메소드를 통해 점수를 setting한다.
		std.setScore(super.nextInt(101), super.nextInt(101), super.nextInt(101));
		return std;
	}
}
