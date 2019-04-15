import java.util.Random;

public class RandomMethod extends Random {
	//Random 클래스를 상속을해서 RandomMethod 라는 클래스를 만듬.
	public int[] nextInt2(int range) {
		//nextInt라는 부모 클래스에 있는 메소드를 자식클래스에서 똑같은 이름으로 재정의 할경우 @Override를 꼭써주세요
		int[] array = new int[10];
		for(int i = 0; i < array.length; i++) {
			array[i] = super.nextInt(range);
			//super. << 부모 클래스의 nextInt 매소드를 그대로 사용함.
		}
		return array;
	}
}
