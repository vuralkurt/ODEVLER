package HAFTA1;

import java.util.Scanner;

public class alis3 {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen teknoloji alaniyla ilgili mesleginizin ilk harfini buyuk olaral giriniz");
		String tekno=scan.next();
		
		switch(tekno){
		   case "S":System.out.println("Software");
           break;
		   case "D":System.out.println("Developper");
		   break;
		   case "E":System.out.println("Engineer");
		   break;
		   case "T":System.out.println("Tester");
		   break;
		   default:System.out.println("Lutfen belitilen sekilde veri giriniz");
		}
		
	}

}
