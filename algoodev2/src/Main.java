import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        LinkedList < HashMap< String , String>> ogrenciler = new LinkedList<>();

        for (int i = 1; i <= 3 ; i++) {
            HashMap<String,String> ogrencibilgileri = new HashMap<>();

            System.out.println("öğrenci # " + i + " bilgilerini giriniz = ");

            System.out.print("isim = ");
            ogrencibilgileri.put("isim" , scn.nextLine());

            System.out.print("soyisim = ");
            ogrencibilgileri.put("soyisim" , scn.nextLine());

            System.out.print("vize  = ");
            ogrencibilgileri.put("vize" , scn.nextLine());

            System.out.print("final = ");
            ogrencibilgileri.put("final" , scn.nextLine());

            ogrenciler.add (ogrencibilgileri);
        }
        System.out.println("öğrenci listesi = ");
        System.out.println(ogrenciler);

        System.out.print("aranacak adı giriniz = ");
        String aranacaad = scn.nextLine();
        System.out.print("aranacak soyadı giriniz = ");
        String arancaksoyad = scn.nextLine();

        boolean varmi = false;

        for (HashMap <String, String> ogrencibilgi : ogrenciler){
            if (ogrencibilgi.get("isim").equals(aranacaad) && ogrencibilgi.get("soyisim").equals(arancaksoyad)){
                System.out.println( "çğrenci bulundu = ");
                String msg = String.format("isim = %5s , soyisim =  %5s , vize = %2s , final = %2s " , ogrencibilgi.get("isim") ,ogrencibilgi.get("soyisim") , ogrencibilgi.get("vize") , ogrencibilgi.get("final"));

                System.out.println(msg);
                varmi = true;
            }
        }
        if(!varmi){
            System.out.println("öğrenci bulunamadı !");
        }













    }
}

