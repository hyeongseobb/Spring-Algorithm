import java.util.Random;

public class JavaDiceIf {
	public static void main (String[] args) {
		
		Random r = new Random();
		int dice = r.nextInt(6) + 1;
		
		System.out.println(dice);
		
		if(dice == 1) {
			System.out.println("멍멍");
		}
		else if(dice == 2) {
			System.out.println("야옹");
		}
		else {
			System.out.println(dice);
		}
	}
}
