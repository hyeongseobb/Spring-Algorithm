import java.util.Scanner;

public class Trapezoid extends Figure {
	Scanner scanner = new Scanner(System.in);
	private double valueLowerSide;
	private double valueUpperSide;
	private double valueHeight;

	Trapezoid() {
		this.name = "사다리꼴";
	}

	public void inputValue() {
		valueLowerSide = tryCatchScanner("밑변을 입력하세요.");
		valueUpperSide = tryCatchScanner("윗변을 입력하세요.");
		valueHeight = tryCatchScanner("높이를 입력하세요.");
	}

	public void cal() {
		this.area = (valueLowerSide + valueUpperSide) * valueHeight / 2;
	}

	private double tryCatchScanner(String outputMessage) {
		double inputValue;
		System.out.println(outputMessage);
		while (true) {
			try {
				inputValue = Double.parseDouble(scanner.nextLine());
				break;
			} catch (NumberFormatException e) {
				System.out.println("숫자만 입력해주세요.");
			}
		}
		return inputValue;
	}
}
