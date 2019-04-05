import java.util.Scanner;

public class Student4 {
	public String name;
	int midScore;
	int finalScore;
	
	public void inputData() {
		Scanner sc = new Scanner(System.in);
		String tmp;
		System.out.print("학생이름 : ");
		tmp = sc.nextLine();
		System.out.print("중간고사 점수 : ");
		tmp = sc.nextLine();
		this.midScore = Integer.parseInt(tmp);
		System.out.print("기말고사 점수 : ");
		tmp = sc.nextLine();
		this.finalScore = Integer.parseInt(tmp);
	}
	
	@Override
	public String toString() {
		return this.name + " (중간고사" + this.midScore + ", 기말고사" + this.finalScore +")";
	}
	
	Student4(String name){
		this.name = name;
	}
}
