
public class RunClass {
	public static void main(String[] args) {
		final int GAME_START_NUMBER = 1;
		final int GAME_END_NUMBER = 100;
		String[] names = {"짱구", "영희", "철수"};
		Person[] players = new Person[names.length];
		for (int i = 0; i < names.length; i++) {
			players[i] = new Person(names[i]);
		}
		for (int i = 0; i < players.length; i++) {
			//call by reference (players[i]의 주소값만 넘겨줌)
			players[i].readyGame(players, i, GAME_START_NUMBER, GAME_END_NUMBER);
		}
		//짱구부터 시작하고 싶으면 0, 영희 1, 철수 2
		players[0].gameStart();
	}
}
