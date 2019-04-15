import java.util.Scanner;

public class RegularPentagon extends Figure {
	Scanner scanner = new Scanner(System.in);
	private double valueSide;

	RegularPentagon() {
		this.name = "정오각형";
	}

	public void inputValue() {
		valueSide = tryCatchScanner("한 변의 길이를 입력하세요.");
	}

	public void cal() {
		this.area = (Math.sqrt(25 + (10 * Math.sqrt(5))) / 4) * Math.pow(valueSide, 2);
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
