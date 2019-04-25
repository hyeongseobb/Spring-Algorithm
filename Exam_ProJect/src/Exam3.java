import java.util.Arrays;
import java.util.Scanner;

public class Exam3{
	public static void main(String[] args) {

		System.out.print("전체 학생 수를 입력하세요. ");
		Scanner s = new Scanner(System.in);
		int total_Student = 0;
		while (true) {
			try {
				total_Student = Integer.parseInt(s.nextLine());
				break;
			} catch (NumberFormatException e) {
				s = new Scanner(System.in);
				System.out.println("숫자만 입력해주세요.");
			}
		}

		double sum_KoreanScore = 0;
		double sum_EnglishScore = 0;
		double sum_MathScore = 0;

		double[] student_PerSum = new double[total_Student];
		double[] student_PerAverage = new double[total_Student];

		double score_Scanner;
		double[] score_Korean = new double[total_Student];
		double[] score_English = new double[total_Student];
		double[] score_Math = new double[total_Student];

		String student_Name_Scanner = null;
		String[] student_Name = new String[total_Student];
		int[] rank_Student = new int[total_Student];

		for (int i = 0; i < total_Student; i++) {
			System.out.printf("%d번 학생의 이름을 입력하세요. 취소하려면 \"quit\" 입력 ", (i + 1));
			student_Name_Scanner = s.nextLine();
			if (student_Name_Scanner.equalsIgnoreCase("quit")) {
				break;
			}
			student_Name[i] = student_Name_Scanner;

			System.out.printf(" %d번 학생의 국어성적을 입력하세요. ", (i + 1));
			while (true) {
				try {
					score_Scanner = Double.parseDouble(s.nextLine());
					break;
				} catch (NumberFormatException e) {
					s = new Scanner(System.in);
					System.out.println(" 숫자만 입력해주세요. ");
					System.out.printf(" %d번 학생의 국어성적을 입력하세요. ", (i + 1));
				}
			}
			score_Korean[i] = score_Scanner;
			sum_KoreanScore += score_Korean[i];

			System.out.printf(" %d번 학생의 영어성적을 입력하세요. ", (i + 1));
			while (true) {
				try {
					score_Scanner = Double.parseDouble(s.nextLine());
					break;
				} catch (NumberFormatException e) {
					s = new Scanner(System.in);
					System.out.println(" 숫자만 입력해주세요. ");
					System.out.printf(" %d번 학생의 영어성적을 입력하세요. ", (i + 1));
				}
			}
			score_English[i] = score_Scanner;
			sum_EnglishScore += score_English[i];

			System.out.printf(" %d번 학생의 수학성적을 입력하세요. ", (i + 1));
			while (true) {
				try {
					score_Scanner = Double.parseDouble(s.nextLine());
					break;
				} catch (NumberFormatException e) {
					s = new Scanner(System.in);
					System.out.println(" 숫자만 입력해주세요. ");
					System.out.printf(" %d번 학생의 성적을 입력하세요. ", (i + 1));
				}
			}
			score_Math[i] = score_Scanner;
			sum_MathScore += score_Math[i];

			student_PerSum[i] = score_Korean[i] + score_English[i] + score_Math[i];
			student_PerAverage[i] = student_PerSum[i] / 3;

		}

		for (int i = 0; i < total_Student; i++) {
			rank_Student[i] = 1;
			for (int j = 0; j < total_Student; j++) {
				if (student_PerSum[i] < student_PerSum[j]) {
					rank_Student[i]++;
				}
			}
		}

		if (student_Name_Scanner.equalsIgnoreCase("quit")) {

		} else {
			System.out.println("\r\n전체 학생의 국어 성적 총합 : " + sum_KoreanScore);
			System.out.println("국어성적 평균 : " + (sum_KoreanScore / total_Student));
			System.out.println("전체 학생의 영어 성적 총합 : " + sum_EnglishScore);
			System.out.println("영어성적 평균 : " + (sum_EnglishScore / total_Student));
			System.out.println("전체 학생의 수학 성적 총합 : " + sum_MathScore);
			System.out.println("수학성적 평균 : " + (sum_MathScore / total_Student));

			for (int i = 0; i < total_Student; i++) {
				System.out.printf("\r\n%d번 " + student_Name[i] + "\r\n", i + 1);
				System.out.print(" " + rank_Student[i] + "등\r\n");
				System.out.print(" 국어 : " + score_Korean[i] + "점\r\n 영어 : " + score_English[i] + "점\r\n 수학 : " + score_Math[i]
						+ "점\r\n 평균 : " + student_PerAverage[i] + "점\r\n");
			}
		}
	}

}