import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Post {
	String title;
	String description;
	String createDate;
	
	public void insertPost() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("제목");
		this.title = sc.nextLine();
		System.out.println("내용");
		this.description = sc.nextLine();
		
		long time = System.currentTimeMillis();
		SimpleDateFormat dayTime = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		this.createDate = dayTime.format(new Date(time));
	}
}
