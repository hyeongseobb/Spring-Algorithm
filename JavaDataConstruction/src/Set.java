import java.util.HashSet;

public class Set {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		
		set.add("A");
		set.add("D");
		set.add("C");
		set.add("B");
		set.add("E");
		set.add(new String("A"));
		System.out.println(set);
	}
}
