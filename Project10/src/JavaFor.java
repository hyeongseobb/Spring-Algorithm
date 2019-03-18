
public class JavaFor {
	public static void main(String[] args) {
		
		for (int i = 0; i < 4; i++) {
			/* i = 10; i를 변경할 때 for문에서 이렇게 바로 변경하지말것.
			꼭  아래의 방법으로 사용
			int test = i;
			test = 10; */
			
			System.out.println(i); //i는 for문이 몇번째 반복되고 있는지에 대한 index가 된다.
			
		}
	}
}
