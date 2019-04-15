
public class RunClass {
	public static void main(String[] args) {
		
		Pet pet1 = new Pet("강아지", 8);
		Pet.count++;
		Pet pet2 = new Pet("고양이", 13);
		Pet.count++;

		pet1.move();
		pet2.move();
		
		System.out.println(pet1.getKind() + "는 " + pet1.getAge() + "개월입니다.");
		System.out.println(pet2.getKind() + "는 " + pet2.getAge() + "개월입니다.");
		
		System.out.println("현재 우리집 애완동물 수는 " + Pet.getCount() + "마리 입니다.");
	}
}
