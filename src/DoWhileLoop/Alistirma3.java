package DoWhileLoop;

import java.util.Scanner;

public class Alistirma3 {

	public static void main(String[] args) {
		

		Scanner scan=new Scanner (System.in);
		int sayi=1;
		int toplam=0;
		int sayac=0;
		
		while (sayi !=0) {
			System.out.println("lutfen toplamak icin bir sayi girniz \n bitirmek icin 0 basiniz.");
			sayi=scan.nextInt();
			toplam+=sayi;
			sayac++;
			
		}
		System.out.println("sayilar toplami:"+toplam);
		System.out.println("girilrn sayi sayisi:"+(sayac-1));
	
		
		
	}

}
