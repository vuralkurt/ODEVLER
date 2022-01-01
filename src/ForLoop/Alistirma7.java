package ForLoop;

import java.util.Scanner;

public class Alistirma7 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir kelime giriniz");
		String kelime=scan.next();
		
		for (int i =  kelime.length()-1; i >=0 ; i--) {
			char x=kelime.substring(i).charAt(0);
			System.out.print(x);
		}
		
	}

}
