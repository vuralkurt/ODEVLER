package StringManipulation;

import java.util.Scanner;

public class Alistirma1 {

	public static void main(String[] args) {
		
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("kelime gir");
		
		String kelime =scan.next();
		
		System.out.println("harf gir");
		
		int  harf=scan.next().charAt(0);
		
         int index= kelime.indexOf(harf); // girilen karakterin cumledeki index'ini verir
		
		if (index==(-1)) {
			
			System.out.println("Girdiginiz harf verilen cumlede yok");
			
		} else {
			
			System.out.println("Girdiginiz harf verilen cumlede var");
		}

		scan.close();
		

	}

}
