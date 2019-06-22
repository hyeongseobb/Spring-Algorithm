import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DataStructure_Arrays {
	public static void main(String[] args) {
		int[] array = new int[]{100,200,1,3,1};
		Arrays.sort(array);
		
		for(int each: array) {
			System.out.print(each + " ");
		}
	}
}
