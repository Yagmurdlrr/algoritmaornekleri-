import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("lisans ogrenci bilgisi = ");
        System.out.print("ad = ");
        String ad = scn.next();
        System.out.print("soyad = ");
        String soyad = scn.next();
        System.out.print("numara = ");
        int numara = scn.nextInt();
        System.out.print("bölüm = ");
        String bolum = scn.next();
        System.out.println("bitirme projesi = ");
        String bitirmeprojesi = scn.next();
        System.out.println();
        lisansogrencisi Lisansogrencisi = new lisansogrencisi(ad , soyad , numara , bolum , bitirmeprojesi);

        System.out.println("yüksek lisans oğrenci bilgisi = ");
        System.out.print("ad = ");
        String ad1 = scn.next();
        System.out.print("soyad = ");
        String soyad1 = scn.next();
        System.out.print("numara = ");
        int numara1 = scn.nextInt();
        System.out.print("bölüm = ");
        String bolum1 = scn.next();
        System.out.println("tez konusu = ");
        String tezkonusu1 = scn.next();
        System.out.println("danışman = ");
        String danisman1 = scn.next();
        System.out.println();
       yükseklisansogrencisi Yukseklisansogrencisi = new yükseklisansogrencisi(ad1, soyad1 , numara1 , bolum1 , tezkonusu1 , danisman1);

        System.out.println("doktora oğrenci bilgisi = ");
        System.out.print("ad = ");
        String ad2 = scn.next();
        System.out.print("soyad = ");
        String soyad2 = scn.next();
        System.out.print("numara = ");
        int numara2 = scn.nextInt();
        System.out.print("bölüm = ");
        String bolum2 = scn.next();
        System.out.println("tez konusu = ");
        String tezkonusu2 = scn.next();
        System.out.println("danışman = ");
        String danisman2 = scn.next();
        System.out.println("yeterlilik = ");
        boolean yeterlilik2 = scn.nextBoolean();
        System.out.println();
        doktoraogrencisi Doktoraogrenci = new doktoraogrencisi(ad2, soyad2 , numara2 , bolum2 , tezkonusu2 , danisman2 , yeterlilik2);

      Lisansogrencisi.bilgi();
      Yukseklisansogrencisi.bilgi();
      Doktoraogrenci.bilgi();

    }
}