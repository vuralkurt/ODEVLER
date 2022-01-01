package HAFTA1;

public class Alistirma1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// System.out.println("-------------------Arttırma");
		int a = 1;
		// System.out.println("a : "+(++a)); //2
		// System.out.println("a : "+(a++)); //2
		// System.out.println("a : "+a); //3

		// a=9;
		// System.out.println("son hali :"+(a++ + ++a)) ;
		// 5 + 7 = 12

		// System.out.println("-------------------Azaltma");
		// int b = 3;
		// System.out.println(--b); //4
		// System.out.println(b--); //4
		// System.out.println(b); //3

		// System.out.println("-------------SORU1-----------------");
		// int x = 10;
		// int y = 20
		// ;

		// System.out.println(++x + --y); //21 + 14 =35 x= 21 y=14
		// System.out.println(x);
		// System.out.println(y);

		// System.out.println("-----------------------------------");
		// System.out.println(++x + y--); // 21 + 15=36 x=21 y=14
		// System.out.println(x);
		// System.out.println(y);

		// int k=5;

		// int sonuc = ++k + k++ + k++ + --k + k-- + k;
		// 6 + 6 + 7 + 7 + 7 + 6 = 39 k=6

		// System.out.println("sonuc = " + sonuc);
		// System.out.println("k = " + k);

		String b = "Java 56789 ?!@$_";

		// \\d ifadesi tum rakamlari(digit) temsil eder.

		System.out.println(b);
		
		System.out.println(b.replaceAll("\\d", "*"));

		System.out.println(b.replaceAll("\\D", "*"));

		// ==> \\S space disindaki hersey
		System.out.println(b.replaceAll("\\S", "*"));
		
		System.out.println(b.replaceAll("\\s", "*"));
		
		System.out.println(b.replaceAll("\\w", "*"));
		
		System.out.println(b.replaceAll("\\W", "*"));
		// replace ile yapma
		System.out.println(b.replace(" ", "*"));

	}

}
