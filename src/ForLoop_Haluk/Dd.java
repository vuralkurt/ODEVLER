package ForLoop_Haluk;

import java.util.Scanner;

public class Dd {

	public static void main(String[] args) {
		
		int toplam=0;
		for (int i = 0; i <5; i++) {
			Scanner scan=new Scanner (System.in);
			System.out.println("lutfen sayi giriniz");
			int sayi =scan.nextInt();
			
			if (sayi>5 && sayi<10) {
				
				System.out.println("bunlar toplamaya girmez");
				continue;
			}
			toplam+=sayi;
		}	
		   
		System.out.println("sayilar toplami:"+toplam);
		

	}

}
