import java.util.Scanner;

public class odev {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("dersin adını giriniz ?");
        String ders = scn.next();
        System.out.print("derse ait kaç adet değerlendirme kriteri var  = ");
        int kritersayi = scn.nextInt();

        String[] kriteradlari = new String[kritersayi];
        int[] kriteretkileri = new int[kritersayi];

        for (int i = 0; i < kritersayi; i++) {
            System.out.print((i+1) + ". kriterin adı nedir = ");
            kriteradlari[i] = scn.next();
            System.out.print((i+1) + ". kriterin etkisi nedir =");
            kriteretkileri[i] = scn.nextInt();
        }

        System.out.print("kaç öğrenci notu giriceksiniz = ");
        int kacogrenci = scn.nextInt();

        String[][] matris = new String[1+kacogrenci][3+kritersayi];

        for (int i = 0; i < kritersayi ; i++) {
            matris[0][2+i] = kriteradlari[i];
        }

        matris[0][0] = "adı\t";
        matris[0][1] = "soyadı";
        matris[0][2+kritersayi] ="ortlama";
        double ortalama =0;
        double [] ortalamaalma = new double[kacogrenci];
        for (int i = 0; i <  kacogrenci; i++) {
            System.out.print((i+1) + ". öğrencinin adı  = ");
            matris [i+1][0] = scn.next();
            System.out.print((i+1) + ". öğrencinin soyadı = ");
            matris [i+1][1] = scn.next();
            for (int j = 0; j < kritersayi ; j++) {
                System.out.print((i+1) + ". öğrencinin " + kriteradlari[j] + "notu =");
                double not = scn.nextInt();
                ortalama += not*((double) kriteretkileri[j]/100);
                matris[i+1][2+j] = String.valueOf(not);
            }
            matris[i+1][2+kritersayi] = String.valueOf(ortalama);
            ortalama = 0;
        }
        odev3(matris, 3+kritersayi , 1+kacogrenci);
    }
    static void odev3 (String [][]liste , int sutun , int satir){
        for (int i = 0; i < satir; i++) {
            for (int j = 0; j <sutun; j++) {
                System.out.print(liste[i][j] + "\t\t");
            }
            System.out.println("\n");
        }
    }
}
