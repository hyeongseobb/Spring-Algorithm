import java.util.ArrayList;
import java.util.Random;

public class List {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("AAAA");
		list.add("BBBB");
		list.add("CCCC");
		list.add("DDDD");
		//배열은 원하는 Index에 데이터를 넣을 수 있지만,
		//list는 무조건 하나씩 데이터를 추가해주어야함.(.add를 사용해서)
		//list는 데이터를 인덱스에 넣는 것이 아닌 데이터가 있는 주소를 가르키기 때문
		//list는 거의 객체데이터들만 사용
		System.out.println(list);
		list.set(3,"wow");
		//Index 3에 있는것을 wow로 바꿔준다.
		System.out.println(list);
		String tmp = list.get(2);
		System.out.println(tmp);
		
		int[] num = {2, 5, 10, 3, 1};
		ArrayList<Integer> number = new ArrayList<Integer>();
		for (int i = 0; i < num.length; i++) {
			number.add(num[i]);
		}
		System.out.println(number);
		
		//리스트를 순차적으로 접근하는 방법
		//1. get(index) 형태로 쓰는거 (size 이용하면 for문으로 사용 가능)
		//2. 배열로 바꿔서 사용하는 방법
		//지난시간에 본 것
		//배열로 변경하는것 (이번시간에 볼것)
		//iterator 하는것
		
		//list는 .length가 아닌 .size를 사용함.
		for (int i = 0; i < number.size(); i++) {
			System.out.println(number.get(i));
		}	
	}
}
