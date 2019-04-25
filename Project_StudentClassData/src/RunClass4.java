public class RunClass4 {
	public static void main(String[] args) {
		Student4 [] sArray = new Student4[10];
		
		//변수 선언
		double midSum = 0;
		double midAvg = 0;
		double finalSum = 0;
		double finalAvg = 0;
		
		for(int i = 0; i < sArray.length; i++) {	
			sArray[i] = new Student4((i + 1) + "번 학생");
			sArray[i].inputData();
			
			midSum = midSum + sArray[i].midScore;
			midAvg = midSum / sArray.length;
		
			finalSum = finalSum + sArray[i].finalScore;
			finalAvg = finalSum / sArray.length;
		}

		System.out.println("\n" + "전체 학생의 중간고사의 합 : " + midSum);
		System.out.println("전체 학생의 중간고사의 평균 : " + midAvg + "\n");
		
		System.out.println("전체 학생의 기말고사의 합 : " + finalSum);
		System.out.println("전체 학생의 기말고사의 평균 : " + finalAvg + "\n");
	}
}
