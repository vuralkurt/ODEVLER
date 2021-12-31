package denemelerim;

import java.util.Scanner;

public class C02_Alistirma2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner (System.in);
		System.out.println("lutfen adinizi giriniz");
		String isim=scan.nextLine();
		System.out.println("lutfen soyadinizi giriniz");
		String soyisim=scan.nextLine();
		System.out.println("lutfen kart no giriniz(16 haneli)");
		String kartno=scan.nextLine();
		
		System.out.println("tercihinizi giriniz");
		int tercih=scan.nextInt();
	
		
		isimler(isim,soyisim);
		isimler2(isim,soyisim);
		kartno(kartno);
		kartnoo1(kartno);
		if(kartno.length()==16) {
			
		    if(tercih==1) {
			   System.out.println(isimler(isim,soyisim)+"\n"+kartno(kartno));
		     }else if(tercih==2) {
			   System.out.println(isimler2(isim,soyisim)+"\n"+kartnoo1(kartno));
		     }else {
			System.out.println("lutfen dogru sikki giriniz");
		    }
			
		}else System.out.println("lutfen kart no kontrol ediniz");
			
		 
		
		
		
		
		
		
	}

	private static String kartnoo1(String kartno) {
		// TODO Auto-generated method stub
		
		String kartnoo1=kartno.substring(0,4).replaceAll("\\d", "*")+" "+kartno.substring(4,8).replaceAll("\\d", "*")+" "+
		kartno.substring(8,12).replaceAll("\\d", "*")+" "+kartno.substring(12);
		return(kartnoo1);
	}

	private static String kartno(String kartno) {
		// TODO Auto-generated method stub
		String kartnoo=kartno.substring(0,4)+" "+kartno.substring(4,8)+" "+kartno.substring(8,12)+" "+kartno.substring(12);
		
		return(kartnoo);
	}

	private static String isimler2(String isim, String soyisim) {
		// TODO Auto-generated method stub
		String isimm2=isim.substring(0,1).toUpperCase()+isim.substring(1).replaceAll("\\w", "*")+" "+
				soyisim.substring(0,1).toUpperCase()+soyisim.substring(1).replaceAll("\\w", "*");
		
		return(isimm2);
		
	}

	

	private static String isimler(String isim, String soyisim) {
		// TODO Auto-generated method stub
       String isimm=isim.substring(0,1).toUpperCase()+isim.substring(1)+" "+soyisim.substring(0,1).toUpperCase()+soyisim.substring(1);
       return(isimm);

		
		
	}	
}
