import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int count = scanner.nextInt();
		
		for (int i = 0; i < count; i++) {
			int repeat = scanner.nextInt();
			String message = scanner.next();
			for (int j = 0; j < repeat; j++) {
				for(int k = 0; k < message.length(); k++) {
					System.out.print(message.charAt(k));
				}
			}
		}
	}
}
