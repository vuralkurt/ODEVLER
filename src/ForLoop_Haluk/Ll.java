package ForLoop_Haluk;

import java.util.Scanner;

public class Ll {

	public static void main(String[] args) {

		/*
		 * Bir sayinin m�kemmel olup olmadi�ini bulan bir program yaziniz. M�kemmel sayi
		 * : bir sayinin kendisi hari� b�lenlerinin toplam�, kendisine e�itse o sayi
		 * m�kemmeldir. ORNEK: INPUT : 6 OUTPUT : 1,2,3 1+2+3 = 6 = 6 (M�kemmel)
		 * mukemmel sayi kontrolu 1. kullanicidan sayi alalim 2. bir toplam degiskeni
		 * olusturuyoruz 3. sayinin bolenleri bul 4. bolenleri toplamla topla 5. sayiyla
		 * toplamin esitligini kontrol et
		 */

		/*
		 * Scanner scan=new Scanner(System.in); System.out.println("sayi gir"); int
		 * sayi=scan.nextInt(); int muk=0;
		 * 
		 * for (int i = 1; i < sayi; i++) {
		 * 
		 * if(sayi%i==0) { muk+=i; }
		 * 
		 * }
		 * 
		 * if(muk==sayi) { System.out.println(sayi+"  mukemmel sayidir"); }else
		 * System.out.println("yapacak birsey yok haci");
		 * 
		 * 
		 */

		Scanner scan = new Scanner(System.in);
		System.out.print("Lutfen bir sayi giriniz : ");
		int sayi = scan.nextInt();

		System.out.println(checkPerfectNumber(sayi));
		boolean flag;
		flag = checkPerfectNumber(sayi);
		System.out.println(flag);

		String result = checkPerfectNumber(sayi) ? "Sayi mukemmel sayidir" : "Sayi mukemmel sayi degildir";
		System.out.println(result);
	}

	public static boolean checkPerfectNumber(int sayi) {
		int toplam = 0;
		boolean flag = false; // durum kontrolu (acik kapali gibi) "flag ismi bir onem arzetmiyor"
		for (int i = 1; i < sayi; i++) {
			if (sayi % i == 0) {
				toplam = toplam + i; // toplam += i;
			}
		}
		if (toplam == sayi) {
			flag = true;
		}

		return flag;

	}

}
