import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String inputNum = scanner.next();
		String inputNum2 = "";
		String calNum = "";
		int count = 0;
		
		inputNum2 = inputNum;
		if(Integer.parseInt(inputNum) < 10) {
			inputNum = "0" + inputNum;
		}
		while(true) {
			if(inputNum.equals(calNum)) {
				System.out.println(count);
				break;
			} else {
				String first = Integer.parseInt(inputNum2) % 10 + "";
				String second = (Integer.parseInt(inputNum2) / 10) + (Integer.parseInt(inputNum2) % 10) +"";
				calNum = first + Integer.parseInt(second) % 10;
				inputNum2 = calNum;
				count++;
				continue;			
			}
		}
	}
}