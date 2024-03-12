public class lisansogrencisi extends  ogrenci{

    public  String bitirmeprojesi ;
    public lisansogrencisi(String ad, String soyad, int ogrencinumarsi, String bolum , String bitirmeprojesi) {
        super(ad, soyad, ogrencinumarsi, bolum);
        this.bitirmeprojesi = bitirmeprojesi;

    }

    public String getBitirmeprojesi() {
        return bitirmeprojesi;
    }

    public void setBitirmeprojesi(String bitirmeprojesi) {
        this.bitirmeprojesi = bitirmeprojesi;
    }

    public  void bilgi(){
        System.out.println("ad = " + ad + ", soyad = " + soyad + ", numara = " + ogrencinumarsi + ", bölüm = " + bolum + ", bitirme projesi = " + bitirmeprojesi);
    }
}
