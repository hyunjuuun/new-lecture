package part2.ex3.데이터구조화.copy;

import java.util.Scanner;

public class ExamProgram{

	public static void main(String[] args) {

		Exam exam = new Exam();
		
		input(exam);
		
		print(exam);
	}

	private static void print(Exam exam) {
		System.out.println("--------");
		System.out.println("  성적출력");
		System.out.println("--------");
		
		int kor = exam.kor;
		int eng = exam.eng;
		int math = exam.math;
		
		int total = kor + eng + math;
		float avg = total/3.0f;
		
		System.out.printf("국어:%d\n", kor);
		System.out.printf("영어:%d\n", eng);
		System.out.printf("수학:%d\n", math);
		System.out.printf("총점:%3d\n", total);
		System.out.printf("평균:%6.2f\n", avg);
		
	}

	private static void input(Exam exam) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("--------");
		System.out.println("  성적입력");
		System.out.println("--------");
		System.out.println();
		
		int kor,eng,math;
		
		do {
			System.out.printf("국어 : ");
			kor = scan.nextInt();

			if (kor < 0 || 100 < kor)
				System.out.println("성적의 범위는 0~100 입니다.");
		} while (kor < 0 || 100 < kor);
		
		do {
			System.out.printf("영어 : ");
			eng = scan.nextInt();

			if (eng < 0 || 100 < eng)
				System.out.println("성적의 범위는 0~100 입니다.");
		} while (eng < 0 || 100 < eng);
		
		do {
			System.out.printf("수학 : ");
			math = scan.nextInt();

			if (math < 0 || 100 < math)
				System.out.println("성적의 범위는 0~100 입니다.");
		} while (math < 0 || 100 < math);
		
		exam.kor = kor;
		exam.eng = eng;
		exam.math = math;
		
	}
}
