
public class moneyBox2 {
	private int coin;
	public void deposit2(int coin,String message) {
		this.coin = this.coin + coin;
		if(message.equals("")) {
			System.out.println("땡그랑");
		}
		else {
			System.out.println(message);
		}
	}
	public void crash() {
		System.out.println("전체 코인 " + coin + "이 출금되었습니다.");
		this.coin = 0;
	}
}
