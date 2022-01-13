package StringManipulation;

import java.util.Scanner;

public class Alistirma3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("e mail adresi gir");
		String cumle = scan.nextLine();
		
		if(!cumle.contains("@gmail.com")){
			
			System.out.println("lutfen gmail adresi giriniz");		
			
		}else if(cumle.endsWith("@gmail.com")){
			System.out.println("basarili giris");
			
		}else System.out.println("bu ifadenin sonda oldugundan eminmisiniz");
		
		
		
	}

}
