package ex4.io.printf;

public class Program {

	public static void main(String[] args) {
		
		int kor1, kor2, kor3;
		int total;
		float avg;
		
		kor1 = 50;
		kor2 = 60;
		kor3 = 80;
		
		total = kor1 + kor2 + kor3;
		avg = total/3.0f;
		
		// ---- ���� ��� �κ� -------
		System.out.println("����������������������������������������");
		System.out.println("             �������                     ");
		System.out.println("����������������������������������������");
		
		System.out.printf("%1$d %1$d %1$d\n", 1);
		
		System.out.printf("����1 : %3d\n", kor1);
		System.out.printf("����2 : %3d\n", kor2);
		System.out.printf("����3 : %3d\n", kor3);
		System.out.printf("���� : %3d\n", total);
		System.out.printf("��� : %6.2f\n", avg);
		
		}

}