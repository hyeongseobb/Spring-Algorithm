import java.util.Scanner;

public class Square extends Figure {
	int low = 0;
	int hight = 0;

	Square() {
		this.name = "사각형";
	}

	public void inputValue() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("사각형의 밑변값을 입력해주세요 : ");
		this.low = scanner.nextInt();

		System.out.println("사각형의 높이값을 입력해주세요 : ");
		this.hight = scanner.nextInt();
	}

	public void cal() {
		this.area = (double) this.low * this.hight;
	}
}
