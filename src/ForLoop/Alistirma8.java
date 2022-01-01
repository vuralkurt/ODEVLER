package ForLoop;

import java.util.Scanner;

public class Alistirma8 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir kelime giriniz");
		String kelime=scan.next();
	
	  
		
		if (kelime.equals(terskelime(kelime))) {
			System.out.println("kelime palindrome");
		} else System.out.println("kelime palindrome degildir");

        scan.close();
		
		
		
	}

	private static String terskelime(String kelime) {
		String kap="";
		for (int i =  kelime.length()-1; i >=0 ; i--) {
			kap+=kelime.substring(i, i+1);
		}
		return kap;
		
	}
}
