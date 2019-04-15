import java.util.Scanner;

public abstract class Figure {
	String name;
	double area;

	public abstract void inputValue();
	public abstract void cal();

	public void printResult() {
		System.out.println(this.name + "의 넓이는 : " + this.area);
	}
}
