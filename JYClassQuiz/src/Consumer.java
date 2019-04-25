
public class Consumer {
	public String name;
	public String size;
	public String[] clothType = { "top", "bottom", "outer", "inner"};
	public int totalPayment;

	@Override
	public String toString() {
		return this.name + " 사이즈 : " + this.size + " 지불가격 : " + this.totalPayment +"\n";
	}
}
	
