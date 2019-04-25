package practice1;

import java.util.Random;

public class Random2 extends Random {
	public void randomStudent(Student2 target) {
		target.kor = super.nextInt(101); //여기서 재정의를 안해줬으니까 this.nextInt(101); 사용해도 작동함.
		target.eng = super.nextInt(101);
		target.math = super.nextInt(101);
		target.total = target.kor + target.eng + target.math;
		//call by value와 call by reference
		//전자는 값을 넘겨주는것 후자는 주소를 넘겨주는 것
		//ex) randomStudent(Student2 target) 객체에서 옮길때는 무조건 주소로 넘김 (call by Reference)
		// 위의 예시에서 target의 주소로 넘기기때문에 return값이 필요없음. 그러므로 Student2(데이터 타입,return 값이 필요함.) 대신에 void로 변경가능.
		
		//Student a = new Student();
		//Student b = a;
		//call by reference!
		//주소를 넘겨주는 것이기 때문에 주소자리를 한자리만 차지해!(객체를 넘겨줄때)
		
		//int a1 = 10;
		//int b1 = a1;
		//call by value!
		//값을 넘겨주는 것이기 때문에 주소자리를 두자리 차지해!(int,double,float,boolean)
		
		//특이한 애 String!!
		//String a = "b" new가 필요없이 바로 만들 수있음.
		// a = "hello" -> 문자열은 바꿀때마다 메모리를 사용해서 매번 값을 바꾸고 주소도 바꿔준다.
		// 컴퓨터가 만약에 있던 값의 주소를 다시 입력받았을때 그것을 인지하면 그 주소로 간다.
	}
}
