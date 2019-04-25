
public class Runclass {
	public static void main(String[] args) {
		Test test = new Test2(); //Test는 부모 클래스(example 한국 폴리텍 학생), Test2는 자식 클래스 (example 스마트 금융과 학생)
		//위의 형태로 작성했을경우, test객체를 통해 printResult이외의 자식클래스에 있는 메소드를 사용할 수 없다 ****
		//위의 형태로 작성하는 이유 : 앞에 쓰는 Test는 묶는 기준이 됨. 특정한 분류를 통해서 묶어야될 필요성이 있기 때문에 이러한 형태로 작성함. 한꺼번에 관리하기 위해 (배열형태)
		test.inputNumbers();
		test.printResult();
		test.newMethod(); //왼쪽이 안되는 이유 : 위의 형태로 작성했을경우, test객체를 통해 printResult이외의 자식클래스에 있는 메소드를 사용할 수 없다 **
	}
}
