
public class HealthPointCalculation {
	public int newHp;
	public boolean whetherDie;
	public void damageLoad(int hp){
		Attack damage = new Attack();
		ParameterInfo parainfo = new ParameterInfo();
	
		this.newHp = hp - damage.damage;
		if(newHp <= 0) {
			whetherDie = true;
		} else {
			whetherDie = false;
		}
	}
}
