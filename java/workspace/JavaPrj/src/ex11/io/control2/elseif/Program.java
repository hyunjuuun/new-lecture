package ex11.io.control2.elseif;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		int kor1, kor2, kor3;
		int total;
		float avg;
		int menu;

		Scanner scan = new Scanner(System.in);

		kor1 = 0;
		kor2 = 0;
		kor3 = 0;

		while (true) {
			System.out.println("┌──────────────────┐");
			System.out.println("             메인메뉴                     ");
			System.out.println("└──────────────────┘");
			System.out.println("  1. 성적 입력");
			System.out.println("  2. 성적 출력");
			System.out.println("  3. 종료");
			System.out.printf("  선택 >");
			menu = scan.nextInt();

			// ---- 성적 입력 부분 -------
			if (menu == 1) {
				System.out.println("┌──────────────────┐");
				System.out.println("             성적입력 ");
				System.out.println("└──────────────────┘");

				do {
					System.out.print("국어 1:");
					kor1 = scan.nextInt();

					if (kor1 < 0 || kor1 > 100)
						System.out.println("성적범위(0~100)를 벗어났습니다.");

				} while (kor1 < 0 || kor1 > 100);

				do {
					System.out.print("국어 2:");
					kor2 = scan.nextInt();

					if (kor2 < 0 || kor2 > 100)
						System.out.println("성적범위(0~100)를 벗어났습니다.");

				} while (kor2 < 0 || kor2 > 100);

				do {
					System.out.print("국어 3:");
					kor3 = scan.nextInt();

					if (kor3 < 0 || kor3 > 100)
						System.out.println("성적범위(0~100)를 벗어났습니다.");

				} while (kor3 < 0 || kor3 > 100);

			}

			// ---- 성적 출력 부분 -------
			else if (menu == 2) {
				total = kor1 + kor2 + kor3;
				avg = total / 3.0f;

				System.out.println("┌──────────────────┐");
				System.out.println("             성적출력                     ");
				System.out.println("└──────────────────┘");

				for(int i=0; i<3; i++)
					System.out.printf("국어%d: : %3d\n", i+1, kor1);
				
				System.out.printf("총점 : %3d\n", total);
				System.out.printf("평균 : %6.2f\n", avg);
			} else if (menu == 3) {
				break;
			} else {
				System.out.println("1~3 중에서 번호를 선택해주세요. > ");
			}
		}
		System.out.println("good bye~");
	}
}
