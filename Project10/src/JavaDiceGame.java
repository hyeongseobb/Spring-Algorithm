import java.util.Random;
import java.util.Scanner;

public class JavaDiceGame {
	public static void main(String[] args) {
		int randUser = 0;
		int randComp = 0;
		
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		
		for (int i = 0; i < 100; i++) {
			System.out.println("화면에 주사위를 굴릴까요? (종료하실려면 q를 입력하세요.)");
			String inputString = sc.nextLine();
			if (inputString.equalsIgnoreCase("q")) {
				System.out.println("게임이 종료되었습니다.");
				break;
			}
			randUser = r.nextInt(5) + 1;
			System.out.println("당신이 굴린 주사위 :" + randUser);
		
			System.out.print("\n컴퓨터에 주사위를 굴립니다. 실행할까요?");
			String input2 = sc.nextLine();
		
			randComp = r.nextInt(5) + 1;
			System.out.print("컴퓨터가 굴린 주사위 :" + randComp);
			System.out.println();
		
			if(randUser > randComp){
				System.out.println("\n You Win!");
			}
			else if(randUser < randComp) {
				System.out.println("\n You Lose!");
			}
			else {
				System.out.println("\n Draw");
			}
		}
	}
}
