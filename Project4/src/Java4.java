import java.util.Scanner;

public class Java4 {
	public static void main(String[] args) {
		System.out.println("화면에 숫자를 입력해주세요!");
		Scanner s = new Scanner(System.in);
		int inputNumber = s.nextInt();
		System.out.println("당신이 입력한 숫자는");
		System.out.println(inputNumber);
		System.out.print('\n');
		
		System.out.println();
		System.out.println("첫번째 숫자 입력 요망");
		int iN3 = s.nextInt();
		System.out.println();
		System.out.println("두번째 숫자 입력 요망");
		int iN4 = s.nextInt();
		System.out.println(iN3*iN4);
		
		System.out.println();
		System.out.println("당신은 몇살이십니까?");
		Scanner y = new Scanner(System.in);
		int iN = y.nextInt();
		System.out.println("당신의 나이는");
		System.out.print('\"');
		System.out.print(iN);
		System.out.print('\"');
		System.out.print("세 입니다.");
		System.out.print('\n');
		/*Scanner y = new Scanner(System.in);
		   <- 새로 정의할 필요없이 위에만든것 그대로 사용가능한 것을 아랫줄 코드를 통해 볼 수 있음.*/
		
		System.out.print('\n');
		System.out.println("또 숫자를 입력해 주세요!");
		int iN2 = s.nextInt();
		System.out.println("당신이 입력한 숫자 +10은");
		System.out.print(iN2+10);
		
	}	
}