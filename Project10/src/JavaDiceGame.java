import java.util.Random;
import java.util.Scanner;

public class JavaDiceGame {
	public static void main(String[] args) {
		
		System.out.print("화면에 주사위를 굴릴까요?");
		
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		
		System.out.println("\n(당신의 주사위를 굴리려면 '네'를 입력해주세요)");
		String input = sc.next("네");
		
		int randUser = r.nextInt(5) + 1;
		System.out.println("당신이 굴린 주사위 :" + randUser);
		
		System.out.print("\n컴퓨터에 주사위를 굴립니다. 실행할까요?");
		System.out.println("\n(컴퓨터 주사위를 굴리려면 '네'을 입력해주세요)");
		String input2 = sc.next("네");
		
		int randComp = r.nextInt(5) + 1;
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
