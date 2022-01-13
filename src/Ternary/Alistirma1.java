package Ternary;

import java.util.Scanner;

public class Alistirma1 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner (System.in);
		System.out.println("1.sayi");
		
		int sayi1=scan.nextInt();
		System.out.println("2.sayi");
		
		int sayi2=scan.nextInt();
		
		System.out.println((sayi2<sayi1)? (sayi1):(sayi2));
		
	}

}
