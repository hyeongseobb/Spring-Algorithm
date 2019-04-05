import java.util.Scanner;

public class Game1 {
	public static void main(String[] args) {
		Player player = new Player("동지형성",1);
		Enemy enemy = new Enemy("나머지조들",100);

		Scanner scanner = new Scanner(System.in);
		System.out.println("턴 진행은 엔터를 입력하세요.");
		for (int i = 0; i < 10000; i++) {
			scanner.nextLine();
			
			enemy.beUnderAttak(1);
			if (enemy.status()) {
				
			} else {
				System.out.println("너네짐ㅉㅉ");
				break;
			}
			
			player.beUnderAttak(1);
			if (player.status()) {
				
			} else {
				System.out.println("ㅜㅜ");
			}	
		}
	}
}
