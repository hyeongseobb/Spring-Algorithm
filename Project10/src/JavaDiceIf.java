import java.util.Random;

public class JavaDiceIf {
	public static void main (String[] args) {
		
		Random r = new Random();
		int dice = r.nextInt(7);
		
		if(dice == 1) {
			System.out.println("港港");
		}
		else if(dice == 2) {
			System.out.println("具克");
		}
		else if(dice == 3) {
			System.out.println("3");
		}
		else if(dice == 4) {
			System.out.println("4");
		}
		else if(dice == 5) {
			System.out.println("5");
		}
		else {
			System.out.println("6");
		}
	}
}
