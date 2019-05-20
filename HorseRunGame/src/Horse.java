import java.util.Random;

public class Horse {
	public String horseName;
	public int speed;
	public int movementStatus;
	
	//말의 스피드는 랜덤하게
	public void speedSet() {
		Random random = new Random();
		this.speed = random.nextInt(20) + 5;
	}
	
	//앞으로 가
	public void run() {
		
	}

	//도착하면 멈춰
	public void stop() {
		
	}
	
	//순위 알기
	public void takeRank() {
		
	}

}
