package ForLoop_Haluk;

import java.util.Scanner;

public class Mm {

	public static void main(String[] args) {

		/*
		 * Kullan�c�dan 1'den b�y�k bir tam say� girmesini isteyin ve 1'den girilen tam
		 * say�ya kadar olan say�lar�n karelerinin toplam�n� hesaplayan kodu yaz�n�z.
		 * �rnek Ekran ��kt�s� Girilen say�=4 Kareler toplam�=30
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
