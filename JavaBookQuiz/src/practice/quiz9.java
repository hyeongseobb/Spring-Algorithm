package practice;

public class quiz9 {
	public static void main(String[] args) {
		for(int i = 2; i < 10; i++) {
			System.out.printf("  #제 %d단#\t",i);
		}
		System.out.println();
		
		for(int i = 2; i < 10; i++) {
			for(int j = 1; j < 10; j++) {
				System.out.println(i + "x " + j + "= " + i*j);
			}
			System.out.println();
		}
	}
}
