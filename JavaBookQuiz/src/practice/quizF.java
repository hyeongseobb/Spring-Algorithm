package practice;

import java.util.Scanner;

public class quizF {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int [] queArray = new int[4];
		int rear = 0;
		char car = 'A';
		int selectNum = 0;
		
		//미완성 ㅠㅠ 큐,스택의 개념을 다시잡고 더 깊이 파보자.
		//selectNum이 3(종료)이 아닌동안에는 반복 수행해주어야함.
		while(selectNum != 3) {
			try {
				System.out.print("<1>자동차 넣기  <2>자동차 빼기  <3>끝 : ");
				selectNum = scanner.nextInt(4);
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("1~3의 숫자만 입력 가능합니다.");
				break;
			}			
			switch (selectNum) {
			case 1:
				if (rear >= 3) {
					System.out.println("꽉차서 자동차는 더이상 못들어갑니다.\n");
				
				} else {
					System.out.printf("%c 자동차가 터널에 들어감\n", car);
					queArray[rear] = car++;
					rear = rear + 1;
				}
				break;
			case 2:
				if(rear <= 0) {
					System.out.println("빠져나갈 자동차가 없습니다.\n");
				} else {
					System.out.printf("%c 자동차가 터널에서 빠짐\n",queArray[0]);
					for(int i = 0; i < 3; i++) {
						queArray[i] = queArray[i+1];
					}
					rear--;
				}
				break;
			case 3:
				System.out.printf("\n현재 터널에 %d대가 있음\n", rear);
				System.out.println("프로그램을 종료합니다.\n");
				break;
			}
		}
	}
}


