
public class RunClass {
	public static void main(String[] args) {
		Stadium stadium = new Stadium(100);
		Horse[] horse = new Horse[3];
		
		for(int i = 0; i < horse.length; i++) {
			horse[i] = new Horse();
			horse[i].horseName = (i + 1) + "번째 말";
			horse[i].speedSet();
		}
		
		for(int i = 0; i < horse.length; i++) {
			System.out.println(horse[i].horseName + " " + horse[i].speed);
		}
	}
}
