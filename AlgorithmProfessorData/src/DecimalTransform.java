
public class DecimalTransform {
	public static void main(String[] args) {
		//1. x진수를 10진수로 변환
		//Class : java.lang.Integer
		//Method : Static int parseInt(String s, int radix)
		//radix진수 숫자를 문자열로 바꾼 값과, 변환할 진수를 파라미터로 받음.
		
		//16진수 "FF"를 10진수로 변환
		System.out.println(Integer.parseInt("FF",16));
		//2진수 "1100110"를 10진수로 변환
		System.out.println(Integer.parseInt("1100110",2));
		
		
		//2. 10진수를 x진수로 변환
		//class : java.lang.Integer
		//Method : static String toBinaryString(int i) 2진수
		//static String toHexString(int i)	16진수
		//static String toOctalString(int i)	8진수	
		//static String toString(int i, int radix) 변환할 숫자,변환할 진수
		System.out.println(Integer.toOctalString(5678));
		System.out.println(Integer.toString(255,16));
	}
}
