import java.util.Random;

public class Cloth {
	public String[] clothType = { "top", "bottom", "outer", "inner"};
	public String size;
	public int price;

	public String setSize() {
		Random random = new Random();
		int a = random.nextInt(3);
		if (a == 0) {
			return "S";
		} else if (a == 1) {
			return "M";
		} else if (a == 2) {
			return "L";
		} else {
			return "";
		}
	}

	public int setPrice() {
		Random random = new Random();
		int b = random.nextInt(491) + 10;
		int c = b * 100;
		return c;
	}

	public void printResult() {
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 4; j++) {
				System.out.println(this.clothType[j] + "사이즈 : " + setSize() + " 가격 :" + setPrice());
			}
			System.out.println();
		}
	}
}
