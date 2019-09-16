
public class ScoreMain {
	public static int totalScore(Student3 student) {
		int totalScore = student.kor + student.eng + student.math;
//		System.out.println(student.name + "의 총점은 : " + totalScore);
		return totalScore;
	}
	
	public static void swap(int[] a, int idx1, int idx2) {
		int temp = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = temp;
	}
	
	public static void bubbleSort(int[] a, int n) {
		//parameter n은 배열 a의 크기
		for(int i = 0; i < a.length; i++) {
			for(int j = n - 1; j > i; j--) {
				if(a[j-1] > a[j]) {
					swap(a, j-1, j);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Student3 seob = new Student3("이형섭", 100, 70, 60);
		Student3 young = new Student3("임선영", 10, 100, 80);
		Student3 hyun = new Student3("공현", 80, 75, 90);
		
		Student3[] studentInfo = {seob, young, hyun};
		int[] totalScore = new int[3]; 
		
		for(int i = 0; i < totalScore.length; i++) {
			totalScore[i] = totalScore(studentInfo[i]);
		}
		System.out.print("정렬전 : ");
		for(int i = 0; i < totalScore.length; i++) {
			System.out.print(totalScore[i] + " ");
		}
		System.out.println();
		bubbleSort(totalScore, totalScore.length);
		System.out.print("정렬후 : ");
		for(int i = 0; i < totalScore.length; i++) {
			System.out.print(totalScore[i] + " ");
		}
//		totalScore(seob);
//		totalScore(young);
//		totalScore(hyun);
		
	}
	
}
