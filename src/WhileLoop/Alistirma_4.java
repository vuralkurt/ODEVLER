package WhileLoop;

import java.util.Scanner;

public class Alistirma_4 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("birinci harfi giriniz");
		String x=scan.next();
		System.out.println("ikinci harfi giriniz");
		String y=scan.next();
		
		 
		char i= x.toUpperCase().charAt(0);
		while ( i<=y.toUpperCase().charAt(0)) {
						
			 System.out.print(i+" ");
			 i++;
		}
		
		
		
		/*
		 SORU6:
			Konsolda Alfabeyi Yazdıran programi yaziniz.
			OUTPUT :
			a b c .. .. .. .. y z
​
		 
		
		for(char c = 'a'; c <='z'; c++) {
			System.out.print(c + " " );
		}
		
		
		///////////// KOD SONU //////////////////
		
		System.out.println();
		
		///////////// WHİLE LOOP İLE ////////////////
​*/
		/*
		char c='a';
		
		while(c<='z') {
			System.out.print(c + " ");
			c++;
		}
		*/
	}

}
