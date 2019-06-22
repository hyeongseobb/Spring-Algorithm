
public class YMD {
	//연습문제 Q11서기 년월일을 필드로 갖는 클래스를 만드세요.
	//n일 뒤의 날짜를 반환 YMD after(int n)
	//n일 앞의 날자를 반환 YMD before(int n)
	int year;
	int month;
	int day;
	
	//생성자
	YMD (int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
		
	
	}
	
	public static void main(String[] args) {
		YMD ymd = new YMD(2019, 6, 19);
		
	}
}
