
public class JavaStar1 {
	public static void main (String[] args) {
		for(int i=0; i<4; i++){
			for(int j=0; j<10-i; j++) {
				System.out.print(" ");
			}
			for(int k=0; k<(2*i+1); k++) {
				System.out.print("*");
			}
			System.out.println();		
		}
		
		for(int i=0; i<4; i++) {
			for(int j=0; j<i; j++) {
				System.out.print(" ");
			}
			for(int k=0; k<21-2*i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<4-i; j++) {
				System.out.print(" ");
			}
			for(int k=0; k<13+2*i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=0; i<4; i++) {
			System.out.print(" ");
			for(int j=0; j<6+i; j++) {
				System.out.print(" ");
			}
			for(int k=0; k<7-2*i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("\r\r");
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<5-i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

