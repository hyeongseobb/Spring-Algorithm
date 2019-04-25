import java.util.Random;

public class Attack {
	public int damage;
	public boolean criticalActive;
	public boolean avoidActive;
	
	public void attack() {
		ParameterInfo parainfo = new ParameterInfo();
		Random random = new Random();
		int whetherActive;
		whetherActive = random.nextInt(100);
		if (parainfo.avoidProbability - 1 <= whetherActive) {
			avoidActive = true;
			
		} else {
			
			avoidActive = false;
			whetherActive = random.nextInt(100);
			int whetherCritical;
			if (parainfo.criProbability - 1 <= whetherActive) {
				whetherCritical = 1;
				this.criticalActive = true;
			} else {
				whetherCritical = 0;
				this.criticalActive = false;
			}
			
			double turnDamage;
			turnDamage = parainfo.strength * ((1 + (parainfo.criDamage / 100)) * whetherCritical);
			
			this.damage = Integer.parseInt(String.valueOf(Math.round(turnDamage)));
			
		}
	}
}