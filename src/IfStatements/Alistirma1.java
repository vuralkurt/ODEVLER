package IfStatements;

import java.util.Scanner;

public class Alistirma1 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner (System.in);
		System.out.println("lutfen gun girniz");
		String gun=scan.next();
		String xx=gun.toLowerCase();
		if (xx.equals("cuma")) {
			System.out.println("muslumanlar icin kutsal gun");
			
		} else if (xx.equals("cumartesi")) {
			System.out.println("museviler icin kutsal gun");

		} else if (xx.equals("pazar")){
			System.out.println("hiristiyanlarlar icin kutsal gun");
		}else System.out.println("bu gunler kimse icin kutsal degildir");
		
		

	}

}
