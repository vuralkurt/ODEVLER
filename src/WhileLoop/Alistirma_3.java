package WhileLoop;

import java.util.Scanner;

public class Alistirma_3 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("birinci sayi giriniz");
		int sayi1 = scan.nextInt();
		System.out.println("ikinci sayi giriniz");
		int sayi2 = scan.nextInt();

		if (sayi1 < sayi2) {
			int i = sayi1;
			while (i <= sayi2) {
				if (i % 2 == 0)
					System.out.print(i + "-");
				i++;

			}

		} else if (sayi2 < sayi1) {
			int i = sayi2;
			while (i <= sayi1) {
				if (i % 2 == 0)
					System.out.print(i + "-");
				i++;

			}

		} else
			System.out.println("Sayilar esittir");
	}
}
