package ForLoop_Haluk;

import java.util.Scanner;

public class Mm {

	public static void main(String[] args) {

		/*
		 * Kullanýcýdan 1'den büyük bir tam sayý girmesini isteyin ve 1'den girilen tam
		 * sayýya kadar olan sayýlarýn karelerinin toplamýný hesaplayan kodu yazýnýz.
		 * Örnek Ekran Çýktýsý Girilen sayý=4 Kareler toplamý=30
		 */

		
		Scanner scan = new Scanner(System.in);
		System.out.print("Lutfen bir sayi giriniz : ");
		int sayi = scan.nextInt();
		
		int sepet=0;
		for (int i = 1; i < sayi+1; i++) {
			int top=i*i;
			sepet+=top;
			
		}
		
		System.out.println("kareler toplami:"+sepet);
		
		
	}

}
