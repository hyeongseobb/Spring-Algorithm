import java.util.Random;

public class NewRandom extends Random {
	@Override
	public int nextInt(int scale){
		return super.nextInt(scale) + 30;
	}
}