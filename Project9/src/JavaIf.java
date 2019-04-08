
public class JavaIf {
	public static void main(String[] args) {
		
		int a = 10;
		int b = 3;
		boolean c;
		
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
			System.out.println("num은 5와 같다.");
		}
			
	}
}
