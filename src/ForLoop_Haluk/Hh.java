package ForLoop_Haluk;

import java.util.Scanner;

public class Hh {

	public static void main(String[] args) {
		// Kullanicidan bir String isteyin. Kullanicinin girdigi
        // String’in palindrome olup olmadigini kontrol eden bir program yazin.
		
		Scanner scan = new Scanner(System.in);
		System.out.print("kelime giriniz : ");
		String kelime=scan.next();
		
		String terso="";
		for (int i = kelime.length()-1; i >=0 ; i--) {
			
			terso+=kelime.charAt(i);
			
		}
		System.out.println(terso);
		
		if (terso.equals(kelime)) {
			System.out.println("kelime palidrome");
			
		}else System.out.println("sikinti yok ");
	}

}
