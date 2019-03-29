package project17_kaupIndex;
import java.util.Scanner;

public class runKaupIndex {
	public static void main(String[] args) {
		kaupIndex kaup = new kaupIndex();
		Scanner sc = new Scanner(System.in);
	
		for (int i = 0; i < 99999; i++) {
			System.out.println("카우푸 지수 계산 \n1.할래 , 2.안할래 : ");
			int selectNumber = sc.nextInt();
			if (selectNumber == 1) {
				System.out.print("당신의 키(cm) : ");
				double inputHeight = sc.nextDouble();
				System.out.print("당신의 몸무게(kg) : ");
				int inputWeight = sc.nextInt();		
				kaup.kaupValue(inputWeight, inputHeight);
			}
			else if (selectNumber == 2) {
				System.out.println("흥 하지마");
				break;
			}	
		}
	}
}
