import java.util.Scanner;

public class Queue {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		IntQueue s = new IntQueue(64);
		
		while (true) {
			System.out.println("현재 데이터 수 : " + s.size() + " / " + s.capacity());
			System.out.print("(1)인큐  (2)디큐  (3)피크  (4)덤프  (5)검색 (0)종료  ==>");
			int menu = scanner.nextInt();
			if (menu == 0) break;
			
			int x;
			switch (menu) {
				case 1: // 인큐
					System.out.println("데이터 :");
					x = scanner.nextInt();
					try {
						s.enque(x);
					} catch (IntQueue.OverflowIntQueueException e) {
						System.out.println("큐가 가득 찼습니다.");
					}
					break;
					
				case 2: // 디큐
					try {
						x = s.deque();
						System.out.println("디큐한 데이터는 " + x + "입니다.");
					} catch (IntQueue.EmptyIntQueueException e) {
						System.out.println("큐가 비어 있습니다.");
					}
					break;
				
				case 3: //피크
					try {
						x = s.peek();
						System.out.println("피크한 데이터는 " + x + "입니다.");
					} catch (IntQueue.EmptyIntQueueException e) {
						System.out.println("큐가 비어 있습니다.");
					}
					break;
				
				case 4: //덤프
					s.dump();
					break;
					
				case 5: //검색 (index가 아닌 큐안에서 몇번재에 존재하는지를 반환)
					System.out.println("찾을 데이터를 입력해주세요 :");
					int findData = scanner.nextInt();
					int searchResult = s.search(findData);
					if(searchResult == 0) {
						System.out.println("찾는 데이터가 없습니다.");
					} else {
						System.out.println("찾는 데이터의 위치는 " + searchResult + "입니다.");
					}
					break;
			}
		}
	}
}
