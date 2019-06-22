import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class DataStructure_PriorityQueue {
	public static void main(String[] args) {
		// MAX HEAP 자료구조를 유지하기 위한 자료구조 : PriorityQueue
		// MAX HEAP? 부모 노드의 키 값이 자식 노드의 키 값보다 크거나 같은 완전 이진 트리, key(부모 노드) >= key(자식노드)
		Comparator<Integer> reverseOrdering = new Comparator<Integer>(){
			@Override
			public int compare(Integer o1, Integer o2){
				return o2 - o1;
			}
		};
		Queue<Integer> queue = new PriorityQueue<Integer>(reverseOrdering);
		queue.add(10);
		queue.add(20);
		queue.add(1);
		queue.add(7);
		queue.add(100);
		System.out.println(queue);
		queue.poll();
		System.out.println(queue);
		queue.poll();
		System.out.println(queue);

		System.out.println();
		Queue<Integer> queue2 = new PriorityQueue<Integer>(10,reverseOrdering);
		queue2.add(10);
		queue2.add(20);
		queue2.add(1);
		queue2.add(7);
		queue2.add(100);
		System.out.println(queue2);
		queue2.poll();
		System.out.println(queue2);
		queue2.poll();
		System.out.println(queue2);
	}
}
