package ForLoop;

import java.util.Scanner;

public class Alistirma_10 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("sayiyi gir");
		int sayi = scan.nextInt();

		if (sayi >= 10 && sayi < 0) {
			System.out.println("lutfen dogru deger giriniz");
		} else {
			int sonuc = 1;
			for (int i = 1; i <= sayi; i++) {

				sonuc *= i;

			}
			System.out.println("Sayilarin faktoriyeli:" + sonuc);
		}

	}

}
