import java.util.Scanner;

public class MoneyBox {
	Scanner scanner = new Scanner(System.in);
	//private 사용시 MoneyBox 클래스의 {}외에 접근할수 없음.
	private int money;
	private int sumMoney;
	private String message;
	private int selectNum;
	private String crash;
	
	//사용자가 번호를 고르게함
	//1. 돈만 입금    2. 돈 입금과 메세지 넣기
	public void choice() {
		this.selectNum = scanner.nextInt();
		if(this.selectNum == 1) {
			select1();
			//select1 메소드는 여기 클래스에 존재
		}else if (this.selectNum == 2) {
			select2();
			//select2 메소드 마찬가지로 여기 클래스에 존재
		}else {
			System.out.println("1과 2만 입력해주세요");
			//입력 받은숫자가 1,2외에 다른상황
			//만약 사용자가 문자나 특수문자를 입력했을 경우는 아직 예외처리하지 않았음. (try catch 사용하면 될듯) 
		}
	}
	
	private void select1() {
		//1번을 입력했을때 컴퓨터가 해야할 action
		System.out.println("입금할 금액 : ");
		this.money = scanner.nextInt();
		
		
		System.out.println("딸그랑");
		System.out.printf("%d원이 입금되었습니다.\n",this.money);
		scanner.nextLine();
	}
	
	private void select2() {
		//2번을 입력했을때 컴퓨터가 해야할 action
		System.out.println("입금할 금액 : ");
		this.money = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("남길 메세지 : ");
		this.message = scanner.nextLine();
		
		System.out.printf("\n%s %d원이 입금되었습니다.\n", this.message , this.money);
	}
	
	public void crash() {
		while (true) {
			System.out.println("1. 돈만 입금    2. 돈 입금과 메세지 넣기");
			choice();
			this.sumMoney += this.money;
			
			System.out.println("입금을 진행하려면 엔터를 눌러주세요. 종료하려면 crash입력");
			this.crash = scanner.nextLine();
			if (this.crash.equals("crash")) {
				System.out.printf("\n지금까지 넣은 금액 : %d원\n", sumMoney);
				System.out.println("프로그램을 종료합니다.");
				break;
				//break를 통한 강제종료.
			} 
		}
	}
}
