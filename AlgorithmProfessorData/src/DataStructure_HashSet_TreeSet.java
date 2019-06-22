import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class DataStructure_HashSet_TreeSet {
	public static void main(String[] args) {
		//중복을 허용하지 않고, 정렬되지 않는 자료구조 : HashSet
		Set<Integer> hashSet = new HashSet<Integer> ();
		hashSet.add(10);
		hashSet.add(20);
		hashSet.add(1);
		hashSet.add(3);
		hashSet.add(4);	
		System.out.println(hashSet);

		//중복을 허용하지 않고, 정렬되는 자료구조 : TreeSet
		Set<Integer> treeSet = new TreeSet<Integer>();
		treeSet.add(10);
		treeSet.add(20);
		treeSet.add(1);
		treeSet.add(3);
		treeSet.add(4);
		System.out.println(treeSet);
		
		//treeSet 역순으로 정렬
		Comparator<Integer> reverseOrdering = new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2){
				return o2 - o1;
			}
		};
		Set<Integer> set = new TreeSet<Integer>(reverseOrdering);
		set.add(10);
		set.add(20);
		set.add(1);
		set.add(7);
		set.add(1);
		System.out.println(set);
	}
}
