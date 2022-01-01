package ForLoop;

import java.util.Scanner;

public class Alistirma9 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("sayilari giriniz");
		int sayi1 = scan.nextInt();
		int sayi2 = scan.nextInt();

		if (sayi1 < sayi2) {
			int top = 0;
			for (int i = sayi1; i <= sayi2; i++) {

				top = top + i;

			}
			System.out.println("sayilarin toplami:" + top);
		} else if (sayi1 > sayi2) {
			int top = 0;
			for (int i = sayi2; i <= sayi1; i++) {

				top = top + i;

			}
			System.out.println("sayilarin toplami:" + top);
		} else
			System.out.println("sayilar esit");

	}

}
