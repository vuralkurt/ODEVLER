package denemelerim;

import java.util.Scanner;

public class deneme13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Soru 1 ) Kullanicidan bir sayi alin. Bu sayinin tek mi cift mi oldugunu,
		 * sifirdan buyuk mu kucuk mu oldugunu, ayrica ve 100’den buyukse birler,onlar
		 * ve yuzler basamagindaki rakamlarin toplamini, 100’den kucukse sadece 1’ler
		 * basamagini yazdiran 3 method olusturun.
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen sayi giriniz");

		int sayi = scan.nextInt();

		tekMiciftMI(sayi);
		negatifPozitif(sayi);
		yuzeGore(sayi);
		scan.close();
	}

	private static void yuzeGore(int sayi) {

		if (sayi >= 100 && sayi <= 1000) {
			System.out.println("sayinin basamaktaki rakamlar toplami:" + ((sayi % 10) + ((sayi / 10) % 10) + sayi / 100));
		} else {
			System.out.println("Sayi yuzden kucuktur ve birler basamagi:"+(sayi%10));
		}

	}

	private static void negatifPozitif(int sayi) {

		if (sayi < 0) {
			System.out.println("sayi negatiftir");
		} else {
			System.out.println("sayi pozitiftir");
		}

	}

	private static void tekMiciftMI(int sayi) {

		if (sayi % 2 == 0) {
			System.out.println("Sayi cifttir");
		} else {
			System.out.println("sayi tektir");
		}

	}

}
