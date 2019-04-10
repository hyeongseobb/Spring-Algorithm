package practice;

import java.util.Scanner;

public class quiz5 {
	public static void main(String[] args) {
		System.out.println("## 교환할 돈은 ?");
		Scanner sc = new Scanner(System.in);
		int changeMoney = sc.nextInt();
		int numberOf500 = 0;
		int numberOf100 = 0;
		int numberOf50 = 0;
		int numberOf10 = 0;
		
		while(changeMoney > 500) {
			numberOf500 = changeMoney / 500;
			changeMoney = changeMoney % 500;
		}
		while(changeMoney > 100) {
			numberOf100 = changeMoney / 100;
			changeMoney = changeMoney % 100;
		}
		while(changeMoney > 50) {
			numberOf50 = changeMoney / 50;
			changeMoney = changeMoney % 50;
		}
		while(changeMoney > 10) {
			numberOf10 = changeMoney / 10;
			changeMoney = changeMoney % 10;
		}
		
		System.out.printf("\n오백원짜리 ==> %d 개", numberOf500);
		System.out.printf("\n백원짜리 ==> %d 개", numberOf100);
		System.out.printf("\n오십원짜리 ==> %d 개", numberOf50);
		System.out.printf("\n십원짜리 ==> %d 개", numberOf10);
		System.out.printf("\n바꾸지 못한 잔돈 ==> %d 원", changeMoney);
	}
}
