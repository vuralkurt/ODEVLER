package DoWhileLoop;

import java.util.Scanner;

public class Alistirma4 {

	public static void main(String[] args) {
		int toplam=0;
		int sayac=0;

		Scanner scan=new Scanner(System.in);
		
		
		while (toplam<=500) {
			for (int i = 0; i < 502; i++) {
				System.out.println("lutfen sayi giriniz");
				int sayi=scan.nextInt();
				toplam+=sayi;
				sayac++;
				
				if (toplam>=500) {
					break;
					
				}
				
			}
			
			System.out.println("toplam:"+toplam);
			System.out.println("sayi sayisi:"+(sayac));
		}
		
		
	}

}
