package denemelerim;

import java.util.Scanner;

public class denmeler14 {

	public static void main(String[] args) {
		
     Scanner scan= new Scanner (System.in);
     System.out.println("Lutfen cumleyi giriniz");
     String cumle=scan.nextLine();
     
     buyuk(cumle);
	 kucuk(cumle);	
	 
	 if(cumle.contains("buyuk")) {
		 System.out.println(buyuk(cumle));
	 }else if(cumle.contains("kucuk")) {
		 System.out.println(kucuk(cumle));
	 }else System.out.println("Cumle buyuk ya da kucuk icermiyor.");
	 
	 
	 
	}

	private static String kucuk(String cumle) {
		// TODO Auto-generated method stub
		String cumlee=cumle.toLowerCase();
		return(cumlee);
		
	}

	private static String buyuk(String cumle) {
		// TODO Auto-generated method stub
		String cumlee=cumle.toUpperCase();
		return(cumlee);
	}
}
