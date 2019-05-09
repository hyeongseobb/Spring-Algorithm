
public class Exam4 {
	public static void main(String[] args) {
		//짱구 철수 유리
		for(int i = 1; i <= 50; i++){
			if(i == 33 || i == 36 || i == 39) {
				//어차피 3으로나눈 나머지가 0이므로 유리만 말함.
				System.out.println("유리 : " + "짝짝");			
			}else if(i >= 30 & i < 40){
				if(i % 3 == 0) {
					System.out.println("유리 : " + "짝");
				}else if(i % 3 == 1) {
					System.out.println("짱구 : " + "짝");
				}else {
					System.out.println("철수 : " + "짝");
				}				
			}else if(i % 10 == 3 || i % 10 == 6 || i % 10 == 9){
				if(i % 3 == 0) {
					System.out.println("유리 : " + "짝");
				}else if(i % 3 == 1) {
					System.out.println("짱구 : " + "짝");
				}else {
					System.out.println("철수 : " + "짝");
				}				
			}else if(i % 3 == 0 && i % 10 == 0){
				//어차피 3으로나눈 나머지가 0이므로 유리만 말함.
				System.out.println("유리 : " + "짝");
			}else {
				if(i % 3 == 0) {
					System.out.println("유리 : " + i);
				}else if(i % 3 == 1) {
					System.out.println("짱구 : " + i);
				}else {
					System.out.println("철수 : " + i);
				}
			}
		}
	}
}
