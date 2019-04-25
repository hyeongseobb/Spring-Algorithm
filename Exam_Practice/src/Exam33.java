import java.util.Random;
import java.util.Scanner;

public class Exam33 {
	public static void main(String[] args) {
		System.out.println("화면에 주사위를 굴릴까요? (엔터를 눌러 실행해주세요.)");
		
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		int userDice = random.nextInt(6) + 1;
		scanner.nextLine();
		System.out.println(userDice);
		
		System.out.println("\n컴퓨터가 주사위를 굴립니다. 실행할까요? (엔터를 눌러 실행해주세요.)");
		scanner.nextLine();
		int compDice = random.nextInt(6) + 1;
		System.out.println(compDice);
		
		if(userDice > compDice) {
			System.out.println("\nYou Win!"); //사용자가 이긴경우
		} else if(userDice < compDice) {
			System.out.println("\nYou Lose!"); //사용자가 진경우
		} else {
			System.out.println("\nDraw!"); //무승부
		}
	}
}
