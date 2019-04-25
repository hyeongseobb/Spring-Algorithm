import java.util.Scanner;

public class moneyBox {
	public int totalMoney = 0;
	private String name;
	//public과 private의 차이점
	//public은 외부에서 바꿔도 실행되나 private는 외부에서 바꾸면 오류가 발생함.
	
	public void setName(String name) {
		this.name = name; //내 안에 있는 속성, 메소드에 접근할때 this 사용
	}
	public void deposit(int inputMoney,String inputMess) {
		if(inputMess.equals("")) {
			this.totalMoney = this.totalMoney + inputMoney;
			System.out.println("땡그랑~ " + totalMoney);
			//딸그랑 이라는 메세지와 입금 액수 출력, 돈만 넣었을경우
		}
		else if(!inputMess.equals("")) {
			this.totalMoney = this.totalMoney + inputMoney;
			System.out.println(inputMess);
			System.out.println(totalMoney);
			//메시지와 입금 액수 출력, 둘다 넣었을경우
		}
		else if(inputMess.equals("crash")) {
			System.out.println(totalMoney);
			//액수 출력과 함게 프로그램 종료
		}
	}
	
	public void withdraw() {
		System.out.println(name + " 출금액 : " + totalMoney);
		totalMoney = 0;
	}
}
