
public class Java7 {
	public static void main(String[] args) {
		
	
	int d = 10;
	d++;
	System.out.println (d);
	
	int f = 10;
	++f;
	System.out.println (f);
	
	int e = 10 + d++;
	System.out.println (e);
	
	int b = 10;
	b += 10;
	/*
	b =+ 10; 라고해도 오류없이 출력되기 때문에(잘못된 결과가 나옴.)
	b = b + 10; 이라고 쓰는게 좋음.*/
	System.out.println(b);
	
	}
}
