import java.util.Scanner;

public class Algorithm555 {
	static int cardConv(int x, int r, char[] d) {
		//연습문제 Q6 진수변환 하는 메소드 작성하기
		int digits = 0; //진수변환된 숫자의 자리수
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		do {
			d[digits++] = dchar.charAt(x % r);
			//진수변환할 숫자를 n진수의 n으로 나눈 나머지를 dchar의 index와 일치시켜서 뽑아옴.
			x = x / r;
		}while(x != 0);
		//x가 0이 아닐때까지 반복.
		return digits;
		//진수변환된 자리수를 반환
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int inputNum; // 변환할 숫자
		int whatJinsu; // 몇진수로 변환할꺼?(2-32)
		int jinsuVacancy; // 진수변환한 값의 자리수
		int retry; // 다시할지 말지
		char[] cno = new char[32]; //변환후 각자리수를 넣어두는 문자의 배열
		
		System.out.println("10진수를 기수변환 합니다.");
		
		do {
			do {
				System.out.print("기수변환할 양의 정수를 입력해주세요->");
				inputNum = scanner.nextInt();
			} while (inputNum <= 0);
			
			do {
				System.out.println("몇진수로 바꿀래?(2-32진수 까지가능)");
				whatJinsu = scanner.nextInt();
			} while (whatJinsu < 2 || whatJinsu > 32);
			
			jinsuVacancy = cardConv(inputNum, whatJinsu, cno);
			//cno에는 진수변환하기 위해 나누기를 한 나머지가 순서대로 담겨져나옴.
			System.out.println(whatJinsu + "진수로는 ");
			
			//(진수변환하기위해서는 나머지를 거꾸로해야함.)
			//cno를 역순으로 출력
			for (int i = jinsuVacancy - 1; i >= 0; i--) {
				System.out.print(cno[i]);
			}
			System.out.println("입니다.");
			System.out.println("한번 더할까요? 맞으면 1 아니면 0을 입력하세요");
			retry = scanner.nextInt();
		} while (retry == 1);
	}
}
