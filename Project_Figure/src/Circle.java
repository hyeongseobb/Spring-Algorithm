import java.util.Scanner;

public class Circle extends Figure implements FugureRule {
	double pi = Math.PI;
	int r;

	Circle() {
		this.name = "원";
	}

	public void inputValue() {
		Scanner scan = new Scanner(System.in);
		System.out.println("반지름을 입력하세요");
		this.r = scan.nextInt();
	}

	public void cal() {
		this.area = this.r * this.r * this.pi;
	}
}
