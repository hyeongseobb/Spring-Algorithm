
public class JavaIf {
	public static void main(String[] args) {
		
		int a = 10;
		int b = 3;
		boolean c;
		
		// 괄호를 꼭 넣어 연산순서를 정해주자!
		c = (a != b) && (a > b);
		System.out.print(c);
		System.out.println();
		System.out.println();
		
		int num = 5;
		
		if(num < 5) {
			System.out.println("num은 5보다 작다.");
		}
		else if(num > 5) {
			System.out.println("num은 5보다 크다.");
		}
		else {
			System.out.println("num과 5는 같다.");
		}
			
	}
}
