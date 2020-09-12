package ex16.star;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		for(int j=0; j<10; j++) {
			for(int i=0; i<j+1; i++)
				System.out.printf("%c",'¡Ù');
			
			System.out.println();
		}
		
		for(int j=0; j<10; j++) {
			for(int i=0; i<10-j; i++)
				System.out.printf("%c",'¡Ù');
			
			System.out.println();
		}
	}
}
