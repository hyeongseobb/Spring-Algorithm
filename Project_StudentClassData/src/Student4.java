import java.util.Random;
import java.util.Scanner;

public class Student4 {
	public String name;
	int midScore;
	int finalScore;
	
	public void inputData() {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		
		String tmp;
		int tmp1;
		int tmp2;
		
		System.out.println("학생이름을 입력해주세요");
		tmp = sc.nextLine();
		System.out.printf("학생이름 : %s  ", tmp);
		
		tmp1 = rd.nextInt(101);
		System.out.printf("중간고사 점수 : %d  ", tmp1);
		this.midScore = tmp1;
		
		tmp2 = rd.nextInt(101);
		System.out.printf("기말고사 점수 : %d\n\n", tmp2);
		this.finalScore = tmp2;
	}
	
//	@Override
//	public String toString() {
//		return this.name + " (중간고사" + this.midScore + ", 기말고사" + this.finalScore +")";
//	}
	
	Student4(String name){
		this.name = name;
	}
}
