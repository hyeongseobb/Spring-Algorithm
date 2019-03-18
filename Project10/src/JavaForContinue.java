
public class JavaForContinue {
	public static void main(String[] args) {
		for (int i = 0; i < 11; i++) {
			if(i == 9) {
				continue;
				//continue의 9에서는 출력이 되지않고 위의 for문으로 다시 돌아간다.
			}
		System.out.println(i);
		}
	}
}
