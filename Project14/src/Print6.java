import java.util.Scanner;

public class Print6 {
	public void print6num() {
			
		//6의배수 출력하기
		boolean is6Number = false;
		System.out.println("6의 배수만 출력합니다.");
		for(int i = 1; i < 100; i++) {
			if(i % 6 == 0) {
				is6Number = true;
				System.out.print("  "+ i);
			}
			else {
				is6Number = false;
			}
		}
	}
}
