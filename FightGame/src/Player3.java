import java.util.Random;

public class Player3 extends Player {
	int countT = 0;
	Player3() {
		this.hp = 1;
		this.name = "재원곤듀님*^o^*";
		System.out.println("\t\t\t\t\t\t\t\t\t\t\t 가녀린 숫가락살인마  " + this.name + " 드응자앙~! 뾰로롱~!~~! @@");
	}

	public int getAttackPower() {
		System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t 숫가락 속에 비친 내 모습에 째워니~~ 기절");
		return 1;
	}

	public void beUnderAttak(int attackPower) {
		Random random = new Random();
		int hitNumber = random.nextInt(2);
		countT++;
		if (hitNumber == 1 && countT <= 5) {
			if (attackPower > 0) {
				hp = hp + attackPower;
				System.out.println("\t\t\t\t\t\t\t 낄낄ㅋ ㅋ " + attackPower + "의 데미지를 흡수했습니다. 현재 체력은^^~? " + Math.abs(hp) + "이라능^-^");
			} else if (attackPower < 0) {
				hp = hp + Math.abs(attackPower);
				System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t 곤듀는 외로워..." );
			} else {
				System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t ^-^??");
			}
		} else if (countT <= 5) {
			System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t 재워니 무서워또 >ㅂ<");
		} else {
			hp = 0;
			System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t DIE");
		}
	}
}
