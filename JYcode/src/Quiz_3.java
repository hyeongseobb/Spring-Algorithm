/***********************************
 * 학생 클래스를 만듭니다. Property : name, Korean, Eng, Math Random을 상속받아 nextInt를
 * 오버라이딩하는데 학생인스턴스를 인자로 받아야한다
 * 
 * 1. 총 10명의 객체 데이터에 랜덤한 값으로 국어, 영어, 수학 점수를 입력하세요 2. 순위 출력 3. 랜덤 값을 발생시키는 걸
 * 메인(또는 객체데이터)에서 처리하지말고, 새로운 랜덤클래스를 작성해서 해당 클래스에 새 메소드를 작성해서 처리하세요.
 * nextInt(classname Instance)형식으로
 ************************************/

//이 클래스는 학생클래스와 랜덤클래스를 모두 포함하여 프로세스화 시키는 클래스입니다.
//Students배열을 가지고있고, 데이터를 setting하는 메소드와 print메소드를 제공합니다. 내부적으로 sort메소드가 캡슐화되어있습니다.
public class Quiz_3 {
	//Students객체 배열을 크기 10로 만들어준다. 주의 : 공간만 만들었을 뿐, 데이터가 들어있는건 아니다.
	Students[] stdArr = new Students[10];

	//정렬 해주는 메소드. avg를 내림차순으로 정렬해준다.
	//avg만 따로 적용하여 이미 제공하고있는 sort메소드를 사용할수 있는 방법을 찾아보자.
	private void sortScore() {
		for (int i = 0; i < stdArr.length - 1; i++) {
			for (int j = i; j < stdArr.length; j++) {
				if (stdArr[i].getAvg() < stdArr[j].getAvg()) {
					Students temp = new Students();
					temp = stdArr[i];
					stdArr[i] = stdArr[j];
					stdArr[j] = temp;
				}
			}
		}
	}

	//각각의 stduents인스턴스에 점수를 입력해주는 메소드
	public void setStdArr() {

		for (int i = 0; i < stdArr.length; i++) {
			stdArr[i] = new Students();
			stdArr[i].setName("Students " + i);
			//각 students의 인스턴스의 프로퍼티(Korean, Eng, Math)에 점수를 랜덤하게 입력한다. 
			Random2 rand = new Random2();
			stdArr[i] = rand.nextInt(stdArr[i]);

		}
		
		//정렬시킨다. 메소드를 만들었으면 어딘가에서 실행해줘야 그 기능이 실행이된다.
		this.sortScore();
	}

	public void printStdArr() {

		for (int i = 0; i < stdArr.length; i++) {
			//Student 클래스에서 toString override로 모양을 만들어 주었다.
			//stdArr는 이미 내림차순 정렬이 되있으므로 rank는 (i + 1)과 동일하다.
			System.out.print("Rank : " + (i + 1) + "\t");
			System.out.print(stdArr[i]);
		}
	}
}
