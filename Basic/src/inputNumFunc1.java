
public class inputNumFunc1 {
	public int inputNum;
	public int remainder = 0;
	public int a = 1;
	
	//최종 몫을 구하는 함수
	public void Quotient(int inputNum) {
		for(int i = 0; i < a; i++) {
			if(inputNum >= 8) {
				inputNum = inputNum / 8;
				a = a + 1;
			}
			else if (inputNum < 8){
				break;
			}	
		}
		System.out.print(inputNum);	
	}
}
