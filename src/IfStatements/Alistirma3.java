package IfStatements;

import java.util.Scanner;

public class Alistirma3 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen yili girniz");

		int yil = scan.nextInt();

		if ((yil % 400 == 0) || ((yil % 4 == 0) && (yil % 100 != 0)))
			System.out.println(+yil + " y�l� art�k bir y�ld�r");
		else
			System.out.println(yil + " y�l� art�k y�l de�ildir");

	}

}
