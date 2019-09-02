import java.util.Scanner;

public class Stack {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		IntStack s = new IntStack(64);
		
		while (true) {
			System.out.println("현재 데이터 수 : " + s.size() + " / " + s.capacity());
			System.out.print("(1)푸시  (2)팝  (3)피크  (4)덤프  (5)검색  (6)삭제 (7)정보  (0)종료  ==>");
			int menu = scanner.nextInt();
			if (menu == 0) break;
			
			int x;
			switch (menu) {
				case 1: //푸시
					System.out.println("데이터: ");
					x = scanner.nextInt();
					try {
						s.push(x);
					} catch (IntStack.OverflowIntStackException e) {
						System.out.println("스택이 가득 찼습니다.");
					}
					break;
				
				case 2: //팝
					try {
						x = s.pop();
						System.out.println("팝한 데이터는 " + x + "입니다.");
					} catch (IntStack.EmptyIntStackException e) {
						System.out.println("스택이 비어 있습니다.");
					}
					break;
					
				case 3: //피크
					try {
						x = s.peek();
						System.out.println("피크한 데이터는 " + x + "입니다.");
					} catch (IntStack.EmptyIntStackException e) {
						System.out.println("스택이 비어 있습니다.");
					}
					break;
				
				case 4: //덤프
					s.dump();
					break;
					
				case 5: //검색
					System.out.println("찾을 데이터를 입력해주세요 :");
					int findData = scanner.nextInt();
					int searchResult = s.indexOf(findData);
					if(searchResult == -1) {
						System.out.println("찾는 데이터가 없습니다.");
					} else {
						System.out.println("찾는 데이터의 위치는 " + searchResult + "입니다.");
					}
					break;
				
				case 6: //삭제
					try {
						s.clear();
					} catch (IntStack.EmptyIntStackException e) {
						System.out.println("스택이 비어 있습니다.");
					}
					break;
					
				case 7: // 정보표시
					System.out.println("용량：" + s.capacity());
					System.out.println("데이터 수：" + s.size());
					System.out.println("비어 " + (s.isEmpty() ? "있습니다." : "있지 않습니다."));
					System.out.println("가득 " + (s.isFull() ? "찼습니다." : "차지 않았습니다."));
					break;
			}
		}
		
	
	}
}
