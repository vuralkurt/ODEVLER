package IfStatements;

import java.util.Scanner;

public class Alistirma2 {

	public static void main(String[] args) {
		
		
		Scanner scan=new Scanner (System.in);
		System.out.println("lutfen karakter girniz");
		
		char krk=scan.next().charAt(0);
		
		if((krk>='a' && krk<='z' ) || (krk>='A' && krk<='Z' ))  {
			System.out.println("kaeker harftir");
		}else System.out.println("karekter harf degildir");
		
		
		

	}

}
