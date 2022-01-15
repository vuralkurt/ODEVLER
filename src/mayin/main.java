package mayin;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Mayin tarlasina hosgeldiniz");
        System.out.println("Lutfen oynamak istediginiz boyutlari giriniz");
        int satirSayisi, sutunSayisi;


        satirSayisi = scan.nextInt();
        sutunSayisi = scan.nextInt();


        Mayin_Tarlasi mayin = new Mayin_Tarlasi(satirSayisi, sutunSayisi);

        mayin.run();




    }
}