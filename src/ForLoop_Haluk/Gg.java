package ForLoop_Haluk;

import java.util.Scanner;

public class Gg {

	public static void main(String[] args) {

		/*
		 * Problem Tan�m� Matrisin boyutunu kullan�c�dan okuyup. Sadece diyagonu
		 * (k��egeni) 1 olan ve di�er elemanlar� 0 olan bir kare matrisi ekrana
		 * bast�r�n. Ekran ��kt�s� Bir say� giriniz: 7 1000000 0100000 0010000 0001000
		 * 0000100 0000010 0000001 Bir sayi giriniz: 5 10000 01000 00100 00010 00001
		 */
		Scanner scan = new Scanner(System.in);
		System.out.print("pozitif bir tam say� giriniz : ");
		int sayi = scan.nextInt();

		for (int i = 1; i <= sayi; i++) {
			for (int j = 1; j <= sayi; j++) {

				if (i == j) {

					System.out.print("1");

				} else
					System.out.print("0");

			}
			System.out.println();
		}

	}

}
