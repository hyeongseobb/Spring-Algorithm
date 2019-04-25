import java.util.Scanner;

public class ConcentricCircle extends Figure implements FugureRule {
	public int r1;
	public int r2;
	public double pi = Math.PI;

	ConcentricCircle() {
		this.name = "동심원";
	}
	
	Scanner scan = new Scanner(System.in);

	public void inputValue() {
		System.out.println("밖의 원의 반지름을 입력하세요");
		this.r1 = scan.nextInt();
		System.out.println("안의 원의 반지름을 입력하세요");
		this.r2 = scan.nextInt();
	}

	public void cal() {
		this.area = (this.r1 * this.r1 * pi) - (this.r2 * this.r2 * pi);
	}

}
