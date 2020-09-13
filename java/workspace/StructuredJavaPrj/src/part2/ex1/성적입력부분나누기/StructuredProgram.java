package part2.ex1.�����Էºκг�����;

import java.util.Scanner;

public class StructuredProgram {

	public static void main(String[] args) {

		int[] korList = new int[3];

		boolean keepLoop = true;
		int menu;

		while (keepLoop) {
			menu = inputMenu();

			switch (menu) {
			case 1:
				inputKors(korList);
				break;
			case 2:
				printKors(korList);
				break;
			case 3:
				System.out.println("Bye~");

				keepLoop = false;
				break;

			default:
				System.out.println("1~3 �߿� �ϳ��� �������ּ���.");
			}

		}

	}

	static void inputKors(int kors[]) {

		Scanner scan = new Scanner(System.in);
		int kor;
		System.out.println("--------");
		System.out.println("  �����Է�");
		System.out.println("--------");
		System.out.println();

		for (int i = 0; i < 3; i++) {
			do {
				System.out.printf("����%d : ", i + 1);
				kor = scan.nextInt();

				if (kor < 0 || 100 < kor)
					System.out.println("������ ������ 0~100 �Դϴ�.");
			} while (kor < 0 || 100 < kor);

			kors[i] = kor;
		}

		System.out.println();
	}

	static void printKors(int[] kors) {

		int total = 0;
		float avg;

		System.out.println("--------");
		System.out.println("  �������");
		System.out.println("--------");

		for (int i = 0; i < 3; i++) {
			total += kors[i];
			System.out.printf("����%d ����:%d\n", i + 1, kors[i]);
		}
		avg = total / 3;
		System.out.printf("����:%3d\n", total);
		System.out.printf("���:%6.2f\n", avg);
	}

	static int inputMenu() {
		Scanner scan = new Scanner(System.in);
		System.out.println("--------");
		System.out.println("  ���θ޴�");
		System.out.println("--------");
		System.out.println("1. �����Է�");
		System.out.println("2. �������");
		System.out.println("3. ����");
		System.out.print("����> ");
		int menu = scan.nextInt();

		return menu;
	}
}
