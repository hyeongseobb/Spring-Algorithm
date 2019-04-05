import java.util.Scanner;

public class Game1 {
	public static void main(String[] args) {
		
		Player player = new Player("동지형성", 100, 10, 150); //(이름, 체력, 크리확률, 크리데미지)
		Enemy[] enemy = new Enemy[3];
		enemy[0] = new Enemy("과제", 100, 10, 120);
		enemy[1] = new Enemy("시험", 100, 10, 120);
		enemy[2] = new Enemy("퀴즈", 100, 10, 120);
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("턴 진행은 엔터를 입력하세요.");
		for (int i = 0; i < 10000; i++) {
			scanner.nextLine();
			
			for (int j = 0; j <enemy.length; j++) {
				if(enemy[j].status()) {
					enemy[j].attacked();
				}
			}
			
			boolean nonDefeat = false;
			for (int j = 0; j <enemy.length; j++) {
				if(enemy[j].status()) {
					nonDefeat = true;
				}
			}
			
			if (!nonDefeat) {
				System.out.println("ALL ENEMY DIE. YOU WIN");
				break;
			}
			
			player.attack();
			if (player.status()) {
				
			} else {
				System.out.println("YOU LOSE");
				break;
			}
		}
	}
}
