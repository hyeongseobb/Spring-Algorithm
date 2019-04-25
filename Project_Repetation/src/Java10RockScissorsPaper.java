import java.util.Random;
import java.util.Scanner;

public class Java10RockScissorsPaper {
	public static void main(String[] args) {
		
		System.out.println("숫자 0부터 2까지 입력하시오.");
		System.out.println("0은 가위, 1은 바위, 2는 보");
		
		Random r = new Random();
		int computer = r.nextInt(3);
		String Data[] = {"가위", "바위", "보"};
		
		Scanner s = new Scanner(System.in);
		int user = s.nextInt();
		
		if(computer == user) {
			System.out.println("비겼습니다.");
		}
		else if(computer == 0 && user == 1) {
			System.out.println("사용자가 이겼습니다.");
		}
		else if(computer == 0 && user == 2 ) {
			System.out.println("컴퓨터가 이겼습니다.");
		}
		else if(computer == 1 && user == 0 ) {
			System.out.println("컴퓨터가 이겼습니다.");
		}
		else if(computer == 1 && user == 2 ) {
			System.out.println("사용자가 이겼습니다.");
		}
		else if(computer == 2 && user == 0 ) {
			System.out.println("사용자가 이겼습니다.");
		}
		else if(computer == 2 && user == 1 ) {
			System.out.println("컴퓨터가 이겼습니다.");
		}
		System.out.printf("컴퓨터는 %d를 냈습니다.", Data[computer]);
	}
}
