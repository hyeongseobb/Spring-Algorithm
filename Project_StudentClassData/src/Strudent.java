import java.util.Scanner;

public class Strudent {
	String name;
	int korScore;
	int engScore;
	int mathScore;
	static int korTotal = 0;
	static int engTotal = 0;
	static int mathTotal = 0;
	
	public void inputScore() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("이름을 입력해주세요.");
		this.name = scanner.nextLine();
		
		System.out.println("국어점수를 입력해주세요.");
		String tmp = scanner.nextLine();
		this.korScore = Integer.parseInt(tmp);

		System.out.println("영어점수를 입력해주세요.");
		tmp = scanner.nextLine();
		this.engScore = Integer.parseInt(tmp);

		System.out.println("수학점수를 입력해주세요.");
		tmp = scanner.nextLine();
		this.mathScore = Integer.parseInt(tmp);
	}
}
