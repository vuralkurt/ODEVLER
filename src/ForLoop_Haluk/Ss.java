package ForLoop_Haluk;

public class Ss {

	public static void main(String[] args) {
	//	1 2 3 4 5 6
//      2 3 4 5 6
//       3 4 5 6
//        4 5 6
//         5 6
//          6       ÅŸeklini konsola yazdiriniz.
		
		
		
		
		for (int i = 0; i < 7; i++) {
			for (int bosluk = 0; bosluk < i; bosluk++) {// boþluk yazdýrma

				System.out.print(" ");
			}

			for (int j = i + 1; j < 7; j++) {

				System.out.print(j+" ");
			}
			System.out.println("");
		}
	}

}
