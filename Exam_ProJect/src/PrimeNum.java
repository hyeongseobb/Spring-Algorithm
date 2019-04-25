
public class PrimeNum {
	public static void main(String[] args) {
		PrimeNumber p1 = new PrimeNumber();
		for (int i = 0; i < 100; i++) {
			p1.doCheck(i + 1);
		}
	}
}
