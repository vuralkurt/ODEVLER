package DoWhileLoop;

import java.util.Scanner;

public class Alistirma5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner scan=new Scanner(System.in);
	        System.out.println("Lutfenrakamlar toplamini bulmak icin pozitif bir tam sayi giriniz");
	        int sayi=scan.nextInt();
	        
	        int rakamlarToplami=0;
	        int rakam=0;
	        
	        while(sayi>0) {
	            rakam=sayi%10;
	            rakamlarToplami+=rakam;
	            sayi/=10;
	        }
	        System.out.println("girdiginiz sayinin rakamlar toplami : " + rakamlarToplami);
	        
	        scan.close();
	        
	}

}
