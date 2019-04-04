import java.util.Scanner;

public class basic1 {
	
	// 메인
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("십진수를 입력해주세요 ==>");	
		int inputNum = sc.nextInt();
		
		inputNumFunc1 quo = new inputNumFunc1();
		quo.Quotient(inputNum);
		
		int inputNum2 = inputNum; 
		inputNumFunc2 rem = new inputNumFunc2();
		rem.Remain(inputNum2);
		
//		System.out.println("8진수로 변환한 값은 : " + Integer.toString(inputNum) + Integer.toString(array[1]) + Integer.toString(array[0]));
	}
}
