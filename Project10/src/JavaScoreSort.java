import java.util.Scanner;

public class JavaScoreSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������� ���� ���� : ");
		int studentScore1 = sc.nextInt();
		
		System.out.println("��ö���� ���� ���� : ");
		int studentScore2 = sc.nextInt();
		
		System.out.println("���Ѽ��� ���� ���� : ");
		int studentScore3 = sc.nextInt();
		
		//��δ� ������ ���
		if(studentScore1 == studentScore2 && studentScore2 == studentScore3){
			System.out.println("���� �ϵ�");
		}
		
		//������ ��Ȯ�ϰ� �Ű����� ���
		else if(studentScore1 > studentScore2 && studentScore2 > studentScore3){
			System.out.println("����� �л� 1��, ��ö�� �л� 2��, ���Ѽ� �л� 3��");
		}
		else if(studentScore2 < studentScore3 && studentScore3 < studentScore1){
			System.out.println("����� �л� 1��, ��ö�� �л� 3��, ���Ѽ� �л� 2��");
		}
		else if(studentScore2 < studentScore1 && studentScore1 < studentScore3){
			System.out.println("����� �л� 2��, ��ö�� �л� 3��, ���Ѽ� �л� 1��");
		}
		else if(studentScore3 < studentScore1 && studentScore1 < studentScore2){
			System.out.println("����� �л� 2��, ��ö�� �л� 1��, ���Ѽ� �л� 3��");
		}
		else if(studentScore1 < studentScore2 && studentScore2 < studentScore3){
			System.out.println("����� �л� 3��, ��ö�� �л� 2��, ���Ѽ� �л� 1��");
		}
		else if (studentScore1 < studentScore3 && studentScore3 < studentScore2){
			System.out.println("����� �л� 3��, ��ö�� �л� 1��, ���Ѽ� �л� 2��");
		}
		
		//���� 2���ΰ��
		else if (studentScore1 == studentScore2 && studentScore1 < studentScore3){
			System.out.println("����� ��ö�� �л� ����2�� , ���Ѽ� �л� 1��");
		}
		else if (studentScore1 == studentScore2 && studentScore2 > studentScore3){
			System.out.println("����� ��ö�� �л� ���� 1�� , ���Ѽ� �л� 3��");
		}
		else if (studentScore1 == studentScore3 && studentScore1 < studentScore2){
			System.out.println("����� ���Ѽ� �л� ����2�� , ��ö�� �л� 1��");
		}
		else if (studentScore1 == studentScore3 && studentScore1 > studentScore2){
			System.out.println("����� ���Ѽ� �л� ���� 1�� , ��ö�� �л� 3��");
		}
		else if (studentScore2 == studentScore3 && studentScore2 < studentScore1){
			System.out.println("��ö�� ���Ѽ� �л� ����2�� , ����� �л� 1��");
		}
		else if (studentScore2 == studentScore3 && studentScore3 > studentScore1){
			System.out.println("��ö�� ���Ѽ� �л� ���� 1�� , ����� �л� 3��");
		}
	}
}
