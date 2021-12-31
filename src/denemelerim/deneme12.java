package denemelerim;

import java.util.Scanner;

public class deneme12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Soru 4) Kullanicidan ismini, soyismini ve bosluk birakmadan 16 hane olarak
		 * kredi karti numarasini alin. Isim ve soyismi ilk harfleri buyuk diger harfler
		 * kucuk olacak sekilde, KK numarasini ise 4 rakamlik 4 blok ve aralarinda
		 * bosluk olacak sekilde duzelten 2 method yazin, ve programda kullanabilmek
		 * icin duzenlenmis hallerini geri dondurun.
		 * 
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("isim");
		String isim = scan.nextLine();
		System.out.println("soyisim");
		String soyisim = scan.nextLine();
		System.out.println("kart numarasi");
		String kartno = scan.nextLine();

		System.out.println(isimler(isim, soyisim));
		if (kartno.length() != 16) {

			System.out.println("lutfen 16 basamakli numaranizi girin");

		} else {
			System.out.println(kart(kartno));
		}

	}//main sonu

	public static String kart(String kartno) {

		String kartnoo = kartno.substring(0, 4) + " " + kartno.substring(4, 8) + " " + kartno.substring(8, 12) + " "
				+ kartno.substring(12);

		return (kartnoo);

	}

	private static String isimler(String isim, String soyisim) {

		String isimm = isim.substring(0, 1).toUpperCase() + isim.substring(1) + " "
				+ soyisim.substring(0, 1).toUpperCase() + soyisim.substring(1);

		return (isimm);

	}
}