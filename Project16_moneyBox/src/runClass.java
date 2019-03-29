import java.util.Scanner;

public class runClass {
	public static void main(String[] args) {
		moneyBox box1 = new moneyBox();
		moneyBox box2 = new moneyBox();

		box1.deposit(5000,"");
		box1.deposit(100,"거지");
		box1.deposit(500,"crash");
		
	}
}
