import java.util.ArrayList;
import java.util.function.Consumer;

public class RunClass {
	public static void main(String[] args) {
		String[] names1 = {"철수", "영희", "짱구", "유리", "길동", "꺽정", "둘리", "뽀로로", "보고", "유신"};
		ArrayList<ListStudent> student1 = new ArrayList<ListStudent>();
		
		for (int i = 0; i < names1.length; i++) {
			student1.add(new ListStudent(names1[i]));
		}
		
		//student1.get(index);
		//student1.get(0);
		//student1.get(1);
		//student1.get(2);
		//student1.get(3); ......... 
		//대신에 forEach를 사용해서 리스트안에 데이터를 넣어줄수 있다!
		//바로 index로 접근하는것이아니라 get은 주소로 먼저 접근을 해야함.
		
		//***********리스트에 데이터 넣기***************************************
		//인덱스 하나씩 돌아가면서 접근을 해주는 forEach!
//		student1.forEach(new Consumer<ListStudent>() {
//			@Override
//			public void accept(ListStudent t) {
//				if(t.middleScore < t.finalScore) {
//					System.out.println(t);
//				}
//			}
//		});
		
		//*************배열로 만들기******************************************
		ListStudent[] arr = (ListStudent[]) student1.toArray();
		for(int i = 0; i < arr.length; i++) {
			if (arr[i].middleScore < arr[i].finalScore) {
				System.out.println(arr[i]);
			}
		}
		//캐스팅하는것을 따로 만들어줘야함.
	}
}
