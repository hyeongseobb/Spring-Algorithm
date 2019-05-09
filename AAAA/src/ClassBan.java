
public class ClassBan {
	public Student[] studentList = new Student[10];
	public double[] avg = new double[3];
	public double totalAvg = 0;
	
	public void setStudents() {
		for(int i = 0; i < this.studentList.length ; i++) {
			this.studentList[i] = new Student();
			this.studentList[i].setScore();
		}
	}
	
	public void setAvgArray() {
		
	}
	
	public void setTotalAvg() {
		
	}
	
	public void sort() {
		for (int i = 0; i < studentList.length; i++) {
			for (int j = i; j < studentList.length; j++) {
				if (studentList[i].avg < studentList[j].avg) {
					Student tmp = studentList[i];
					studentList[i] = studentList[j];
					studentList[j] = tmp;
				}
			}
		}
	}
	
	public void printClassBan() {
		
	}
}
