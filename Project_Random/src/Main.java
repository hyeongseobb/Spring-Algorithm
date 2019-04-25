
public class Main {
	public static void main(String[] args) {
		NineByNine gugudan = new NineByNine();
		while (true) {
			try {
				gugudan.inputDan();
			} catch (Exception e) {
				System.out.println("숫자만 입력해주세요^^");
//				e.printStackTrace();
			}	
		}
	}
}
