package NestedForLoop;

import java.util.Scanner;

public class Alistirma_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("bir sayi giriniz");
		int sayi = scan.nextInt();

		for (int i = 1; i <=sayi; i++) {

			for (int j = 1; j <=i; j++) {
				System.out.print("*"+" ");
			}
			System.out.println("");
		}
		scan.close();
	}
}
