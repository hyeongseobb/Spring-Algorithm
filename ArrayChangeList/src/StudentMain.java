
import java.util.Arrays;
import java.util.List;

public class StudentMain {
	public static void main(String[] args) {
		String[] names = {"동준", "지인", "형섭", "성민", "경현", "형석", "공현", "예근", "태현", "성욱"};
		Student[] student = new Student[names.length];
		
		for(int i = 0; i < names.length; i++) {
			student[i] = new Student(names[i]); //이 부분이 신기했어
			student[i].printScore();
		}
		
		System.out.println();
		//리스트로 바꿔보기
		List <Student> list = Arrays.asList(student);
		for(int i = 0; i < student.length; i++) {
			if(student[i].midTotal < student[i].finalTotal) {
				student[i].printGradeUpStudent();
			}
		}
	}
}
