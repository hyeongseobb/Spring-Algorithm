import java.util.Collections;
import java.util.Comparator;
import java.util.Vector;

public class DataStructure_Vector {
	public static void main(String[] args) {
		//중복을 허용하는 자료구조 Vector
		//vector는 동적으로 확장/축소가 가능한 dynamic array로 구현되어 있다.
		Vector<Integer> vector = new Vector<Integer>();
		vector.add(100);
		vector.add(500);
		vector.add(300);
		vector.add(400);
		System.out.println("정렬 전 : "+ vector);
		System.out.println(vector.contains(100));
		System.out.println(vector.contains(800));
		
		//오름차순 정렬
		Collections.sort(vector);
		System.out.println("정렬 후 : "+ vector);
		
		//역순 정렬 (내림차순은 오름차순의 반대)	
		Collections.sort(vector, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2){
				return o2 - o1;
			}
		});
		System.out.println("역순 정렬 후 : "+ vector);
	}
}