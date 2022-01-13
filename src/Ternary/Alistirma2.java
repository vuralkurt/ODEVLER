package Ternary;

import java.util.Scanner;

public class Alistirma2 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner (System.in);
		
		System.out.println("sayi");
		
		int sayi1=scan.nextInt();
		
	//System.out.println(sayi1>0 ? "pozitif" : sayi1*sayi1);
		
	System.out.println((sayi1>5) ?   (sayi1<10)? 2*(sayi1) : 3*(sayi1)    :   (sayi1>10) ? (2+sayi1):(3+sayi1) );	
		

	}

}
