package NestedForLoop;

import java.util.Scanner;

public class Alistirma_3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("bir sayi giriniz");
		int sayi = scan.nextInt();
		
		for (int i = 1; i <=sayi; i++) {

			for (int j = 1; j <=sayi; j++) {
				System.out.print(i*j+"- ");
			}
			System.out.println(" ");
		}
		
		

	}

}
