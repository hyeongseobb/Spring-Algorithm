import java.util.Scanner;

public class run2 {
	public static void main(String[] args) {
		moneyBox2 box2 = new moneyBox2();
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < 99999; i++) {
			System.out.println("메뉴 선택 1.입금, 2.입금+메세지, 3.종료 : ");
			int selectMenu = sc.nextInt();
			if (selectMenu == 1) {
				System.out.print("입금할 금액 : ");
				int coin = sc.nextInt();
				box2.deposit2(coin, "");
			}
			else if (selectMenu == 2) {
				System.out.print("입금할 금액 : ");
				int coin = sc.nextInt();
				sc.nextLine();
				String message = sc.nextLine();
				box2.deposit2(coin, message);
			}
			else if (selectMenu == 3) {
				box2.crash();
				break;
			}
		}		
	}
}
