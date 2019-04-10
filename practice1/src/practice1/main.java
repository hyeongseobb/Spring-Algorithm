package practice1;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		main m = new main();
		Scanner sc = new Scanner(System.in);
		System.out.println("키(m)를 입력해주세요");
		double height = sc.nextDouble();
		System.out.println("몸무게(kg)를 입력해주세요");
		double weight = sc.nextDouble();
		
		m.kaupMethod(height, weight);
	}
	
	
	public void kaupMethod (double height,double weight) {
		double kaupIndex = weight /(height * height);
		System.out.println(kaupIndex);
		
	}
}
