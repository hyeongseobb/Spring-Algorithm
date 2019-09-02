
public class Generic {
	//자료형에 구애받지 않는 generic
	static class GenericClass<T> {
		private T wow;
		GenericClass(T t) {
			this.wow = t;
		}
		T getWow() {
			return wow;
		}
	}
	public static void main(String[] args) {
		GenericClass<String> s = new GenericClass<String>("test");
		GenericClass<Integer> n = new GenericClass<Integer>(123);
		
		System.out.println(s.getWow());
		System.out.println(n.getWow());
	}
}
