package project17_kaupIndex;

public class kaupIndex {
	public void kaupValue(int inputWeight, double inputHeight) {
		double kaupValue = (double) inputWeight * 10000 / (inputHeight*inputHeight);
		System.out.println(kaupValue);
		
			if(kaupValue >= 30) {
				System.out.println("당신은 비만! 운동하세요^^");
				System.out.println();
			}
			else if(kaupValue < 30 && kaupValue >= 24) {
				System.out.println("당신은 과체중! 좀만빼자^^");
				System.out.println();
			}
			else if(kaupValue < 24 && kaupValue >= 20) {
				System.out.println("당신은 정상! 건강한 신체를 가지셨군요^^");			
				System.out.println();
			}
			else if(kaupValue < 20 && kaupValue >= 15) {
				System.out.println("당신은 저체중! 더드세요^^");
				System.out.println();
			}
			else if(kaupValue < 15 && kaupValue >= 13) {
				System.out.println("당신은 야위었군요..");
				System.out.println();
			}
			else if(kaupValue < 13 && kaupValue > 10) {
				System.out.println("당신은 영양실조..");
				System.out.println();
			}
			else if(kaupValue <= 10) {
				System.out.println("당신은 소모증.. 119가 자동으로 호출됩니다.");
				System.out.println();
			}
	}
}