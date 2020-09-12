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

		����: while (true) {
			// ---- ���� �޴� �κ� -------

			System.out.println("����������������������������������������");
			System.out.println("             ���θ޴�                     ");
			System.out.println("����������������������������������������");
			System.out.println("  1. ���� �Է�");
			System.out.println("  2. ���� ���");
			System.out.println("  3. ����");
			System.out.printf("  ���� >");
			menu = scan.nextInt();

			switch (menu) {

			case MENU_INPUT:
				// ---- ���� �Էºκ� -------
				System.out.println("����������������������������������������");
				System.out.println("             �����Է� ");
				System.out.println("����������������������������������������");

				for (int i = 0; i < SIZE; i++)
					do {
						System.out.printf("����%d:", i + 1);
						kors[i] = scan.nextInt();

						if (kors[i] < 0 || kors[i] > 100)
							System.out.println("��������(0~100)�� ������ϴ�.");

					} while (kors[i] < 0 || kors[i] > 100);

				break;

			// ---- ���� ��� �κ� -------
			case MENU_PRINT:
				
				for(int i=0; i<SIZE; i++)
					total += kors[i];
				
				avg = total / 3.0f;

				System.out.println("����������������������������������������");
				System.out.println("             �������                     ");
				System.out.println("����������������������������������������");

				for (int i = 0; i < SIZE; i++)
					System.out.printf("����%d: : %3d\n", i + 1, kors[i]);

				System.out.printf("���� : %3d\n", total);
				System.out.printf("��� : %6.2f\n", avg);

				break;

			case MENU_EXIT:
				break ����;
			default:
				System.out.println("1~3 �߿��� ��ȣ�� �������ּ���. > ");
			}
		}

		System.out.println("good bye~");
	}
}