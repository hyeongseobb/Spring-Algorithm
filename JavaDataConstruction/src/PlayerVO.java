
public class PlayerVO implements Comparable<PlayerVO> {
	private String name;
	private String position;
	private int regYear;
	
	public PlayerVO(String name, String position, int regYear) {
		this.name = name;
		this.position = position;
		this.regYear = regYear;
	}
	
	public String toString() {
		return name + "은 " + position + "이고 " + regYear + "년에 데뷔함";
	}
	
	@Override
	public int compareTo(PlayerVO otherPlayer) {
		//compareTo에서는 뺀 값이 음수면 앞으로가고 양수면 뒤로 감.
		return this.regYear - otherPlayer.regYear; //오름차순
		//return otherPlayer.regYear - this.regYear; => 내림차순
	}
}
