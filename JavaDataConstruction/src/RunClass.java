import java.util.ArrayList;
import java.util.Arrays;

public class RunClass {
	public static void main(String[] args) {
		String[] names1 = {"철수", "영희", "짱구", "유리", "길동", "꺽정", "둘리", "뽀로로", "보고", "유신"};
		ArrayList<Student> student1 = new ArrayList<Student>();
		
		for (int i = 0; i < names1.length; i++) {
			student1.add(new Student(names1[i]));
		}
		System.out.println(student1); //list student1
		
		
		//위의 리스트를 배열로 바꿔주기
		Student[] arr = new Student[student1.size()];
		student1.toArray(arr);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
