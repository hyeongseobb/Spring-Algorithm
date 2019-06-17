
public class Algorithm111 {
	
	public static void main(String[] args) {
		System.out.println("Q1의 정답: " +max4(1,2,3,4));
		System.out.println("Q2의 정답: " +min3(1,2,3));
		System.out.println("Q3의 정답: " +min4(4,3,2,1));
		System.out.println("Q4의 정답: " +med3(3,1,2));
		System.out.println("Q5의 정답: " +med(1,2,3));
	}
	
	//연습문제 Q1 page19
	static int max4(int a, int b, int c, int d) {
		int max = a;
		if(max < b) {
			max = b;
		}
		if(max < c) {
			max = c;
		}
		if(max < d) {
			max = d;
		}
		return max;
	}
	
	//연습문제 Q2 page19
	static int min3(int a, int b, int c) {
		int min = a;
		if(min > b) {
			min = b;
		}if(min > c) {
			min = c;
		}
		return min;
	}
	
	//연습문제 Q3 page19
	static int min4(int a, int b, int c, int d) {
		int min = a;
		if(min > b) {
			min = b;
		}if(min > c) {
			min = c;
		}if(min > d) {
			min = d;
		}
		return min;
	}
	
	//연습문제 Q4 page22(중앙값 구하기) 13가지 경우의 수가있음.
	static int med3(int a, int b, int c) {
		if (a >= b) {
			if(b >= c) {
				return b;
			}else if(a <= c) {
				return a;
			}else {
				return c;
			}
		}else if(a > c) {
			return a;
		}else if(b > c) {
			return c;
		}
		else {
			return b;
		}
	}
	
	//연습문제 Q5 Q4에비해 Q5의 답이 효율이 떨어지는 이유: 컴퓨터가 비교하는 경우의 수는 Q4에 비해 Q5가 더 많기 때문에. 
	static int med (int a, int b, int c) {
		if((b >= a && c <= a) || (b <= a && c >= a)) {
			return a;
		}else if((a > b && c < b) || (a < b && c > b)) {
			return b;
		}
		return c;
	}
}

