import java.util.Scanner;

public class FigureMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int userInputNumber;
		while (true) {
			while (true) {
				try {
					System.out.println("숫자를 입력하세요. (1 : 삼각형, 2 : 사각형, 3 : 사다리꼴, 4 : 정오각형, 5 : 정육각형, 6 : 원, 7 : 동심원)");
					userInputNumber = Integer.parseInt(scanner.nextLine());
					break;
				} catch (NumberFormatException e) {
					System.out.println("지정된 정수만 입력하세요.");
				}
			}
			if (userInputNumber < 1 || userInputNumber > 7) {
				System.out.println("1~7의 숫자만 입력해주세요.");
			} else {
				break;
			}
		}
		Figure figure = null;
		if (userInputNumber == 1) {
			figure = new Triangle();
		} else if (userInputNumber == 2) {
			figure = new Square();
		} else if (userInputNumber == 3) {
			figure = new Trapezoid();
		} else if (userInputNumber == 4) {
			figure = new RegularPentagon();
		} else if (userInputNumber == 5) {
			figure = new RegularHexagon();
		} else if (userInputNumber == 6) {
			figure = new Circle();
		} else if (userInputNumber == 7) {
			figure = new ConcentricCircle();
		} else {
			System.out.println("User Input Number Error");
		}

		System.out.println(figure.name + "을 선택하셨습니다.");

		figure.inputValue(); //값입력함수실행
		figure.cal();//계산함수실행
		figure.printResult(); //프린트함수실행
	}
}
