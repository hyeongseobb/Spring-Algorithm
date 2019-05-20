
public class Person {
	String name;
	Person[] players;
	int position = 0;
	int startNumber = 0;
	int endNumber = 0;
	int sayNumber = 0;
	Person(String name) {
		this.name = name;
	}
	//게임에 참여한 사람들을 알고 있어야 하며,
	//현재 순서를 알아야함.
	public void readyGame(Person[] players, int position, int startNumber, int endNumber) {
		this.players = players; //게임에 참여하는 사람들
		this.position = position; //현재 순서 1명씩 외칠 때마다 +1씩
		this.startNumber = startNumber;
		this.endNumber = endNumber;
	}
	
	public void sayNumber() {
		int prevPosition = this.position - 1;
		if (prevPosition < 0) {
			prevPosition = this.players.length - 1;
		}
		//위의 if문을 통한 예외처리 대신에 바로아래의 로직을 사용가능.
//		this.sayNumber = this.players[(this.position + (this.players.length - 1)) % this.players.length].sayNumber + 1;
//		System.out.println(this.name + " say " + this.sayNumber);
		//이전에 말한 사람의 숫자 +1을 말해야해
		if (this.sayNumber == -1) {
			this.sayNumber = this.startNumber;
		} else {
			this.sayNumber = this.players[prevPosition].sayNumber + 1;
		}
//		System.out.println(this.name + " say " + this.sayNumber);
		this.clapSet();
		
		int nextPosition = (this.position + 1) % this.players.length;
		if (this.sayNumber < this.endNumber) {
			this.players[nextPosition].sayNumber();
		}
	}
	public void gameStart() {
		this.sayNumber = -1;
//		this.players[this.players.length - 1].sayNumber = this.startNumber - 1;
		this.sayNumber();
	}
	
	public void clapSet() {
	    String strSayNumber = String.valueOf(sayNumber);
	    String result = "";
	    int count = 0;
		for (int j = 0; j < strSayNumber.length(); j++) {
			char check = strSayNumber.charAt(j);
			if (check == '3' || check == '6' || check == '9') {
				result += "짝";
				count++;
			}
		}
		if (count == 0) {
			result = strSayNumber;
		}
		System.out.println(this.name + " say " + result);
	}   
}
