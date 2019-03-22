import java.util.Scanner;

public class JavaArrayString {
	public static void main(String[] args) {
		String a = "hello";
		Scanner scan = new Scanner(System.in);
		String b = scan.nextLine();
		String c = scan.nextLine();
		
		System.out.println(a == b); //파이썬에선 이방법으로 해도되지만 자바에선 안된다!(다른결과초래)
		System.out.println(a.equals(b)); //자바에서는 꼭 equals를 통한 문자열 비교를 해야함.
		System.out.println(b == c);
		System.out.println(b.equals(c));
		
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		System.out.println(c.hashCode());
	}
}
