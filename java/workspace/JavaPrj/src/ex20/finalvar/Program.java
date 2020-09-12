package ex20.finalvar;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		final int SIZE = 3;
		int[] kors = new int[SIZE];
		int total = 0;
		float avg;
		int menu; // 1:INPUT, 2:PRINT, 3:EXIT
		final int MENU_INPUT = 1;
		final int MENU_PRINT = 2;
		final int MENU_EXIT = 3;

		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < SIZE; i++) {
			kors[i] = 0;
		}

		종료: while (true) {
			// ---- 메인 메뉴 부분 -------

			System.out.println("┌──────────────────┐");
			System.out.println("             메인메뉴                     ");
			System.out.println("└──────────────────┘");
			System.out.println("  1. 성적 입력");
			System.out.println("  2. 성적 출력");
			System.out.println("  3. 종료");
			System.out.printf("  선택 >");
			menu = scan.nextInt();

			switch (menu) {

			case MENU_INPUT:
				// ---- 성적 입력부분 -------
				System.out.println("┌──────────────────┐");
				System.out.println("             성적입력 ");
				System.out.println("└──────────────────┘");

				for (int i = 0; i < SIZE; i++)
					do {
						System.out.printf("국어%d:", i + 1);
						kors[i] = scan.nextInt();

						if (kors[i] < 0 || kors[i] > 100)
							System.out.println("성적범위(0~100)를 벗어났습니다.");

					} while (kors[i] < 0 || kors[i] > 100);

				break;

			// ---- 성적 출력 부분 -------
			case MENU_PRINT:
				
				for(int i=0; i<SIZE; i++)
					total += kors[i];
				
				avg = total / 3.0f;

				System.out.println("┌──────────────────┐");
				System.out.println("             성적출력                     ");
				System.out.println("└──────────────────┘");

				for (int i = 0; i < SIZE; i++)
					System.out.printf("국어%d: : %3d\n", i + 1, kors[i]);

				System.out.printf("총점 : %3d\n", total);
				System.out.printf("평균 : %6.2f\n", avg);

				break;

			case MENU_EXIT:
				break 종료;
			default:
				System.out.println("1~3 중에서 번호를 선택해주세요. > ");
			}
		}

		System.out.println("good bye~");
	}
}
