import java.util.HashMap;
import java.util.Map;

public class Hashmap {
	public static void main(String[] args) {
		String[] names1 = {"철수", "영희", "짱구", "유리", "길동", "꺽정", "둘리", "뽀로로", "보고", "유신"};
		HashMap<String, Student> map = new HashMap<String, Student>();
		//자료형 안에 객체를 넣을 수 있음. ex) HashMap<String, 객체명>
		for(int i = 0; i < 10; i++) {
			map.put(names1[i], new Student(names1[i]));
		}
		//key, value 형태로 출력됨
		//{key=value, key=value, key=value}
		//순서가 없음.
		
		//entrySet이 뭐하는거야?
		for (Map.Entry<String, Student> item : map.entrySet()) {
			Student one = item.getValue();
			//getKey(); -> key를 가져옴
			//getValue(); -> value를 가져옴
			if(one.scoreGap < 0) {
				//toString을 써놔야함.
				System.out.println(one.toString());
			}
		}
		//map에서 entry를 사용해서 데이터에 하나씩 접근하는 법
	}
}
