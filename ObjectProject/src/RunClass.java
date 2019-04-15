import java.util.Random;

public class RunClass {
	public static void main(String[] args) {
		RandomMethod rand = new RandomMethod();
		int [] array2 = rand.nextInt2(100);
		//자식 클래스에 있는 메소드를 통해서 객체를 만들때 override될시에 앞에 클래스명을 부모 클래스여도 상관없음.
		//만약 자식클래스에서 nextInt라는 메소드를  똑같은 이름으로 override하지않고  다른 이름으로 새로 만들시에
		//객체 생성시 앞 뒤 둘다 자식클래스명으로 적어야함.
		for(int i = 0; i < array2.length; i++) {
			System.out.print(array2[i] + " ");
		}
		double n2 = rand.nextDouble();
	}
}
