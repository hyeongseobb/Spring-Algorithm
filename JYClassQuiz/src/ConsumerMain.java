import java.util.Arrays;
import java.util.Scanner;

public class ConsumerMain {
	public static void main(String[] args) {
		Consumer[] consumer = new Consumer[5];
		Scanner scanner = new Scanner(System.in);
		Cloth cloth = new Cloth();
		
		for(int i = 0; i < 5; i++) {
			consumer[i] = new Consumer();
		}
		
		for(int i = 0; i < 5; i++) {
			consumer[i].name = scanner.next();
			consumer[i].size = cloth.setSize();
			consumer[i].totalPayment = cloth.setPrice();
		}
		
		System.out.println(Arrays.toString(consumer));
	}
}
