package ForLoop_Haluk;

import java.util.Scanner;

public class Nn {

	public static void main(String[] args) {

		/*
		 * Kullanicidan bir cumle ve bir harf alin, Cumlede harfin kac kere
		 * kullanildigini bulup, yazdirin
		 *
		 * ORNEK:
		 *
		 * INPUT : Cumle: Java ogrenmek cok guzel. Harf :e
		 *
		 * OUTPUT : Girdiginiz cumlede "e" harfi 3 kere kullanilmis.
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("kelime gir : ");
		String kelime=scan.nextLine().toLowerCase();
		
		System.out.print("harf : ");
		char harf=scan.next().toLowerCase().charAt(0);
		
		int sayac=0;
		for (int i = 0; i < kelime.length();i++){
			
			if (harf==kelime.charAt(i)) {
				
				sayac++;
			}
			
			
		}
		
		System.out.println("harf kelimede  "+sayac+"  var");
		

	}

}
