public class ogrenci {
    public String ad ;
    public String soyad ;
    public int ogrencinumarsi ;
    public String bolum ;

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public int getOgrencinumarsi() {
        return ogrencinumarsi;
    }

    public void setOgrencinumarsi(int ogrencinumarsi) {
        this.ogrencinumarsi = ogrencinumarsi;
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public ogrenci(String ad , String soyad , int ogrencinumarsi , String bolum){
        this.ad = ad ;
        this.soyad = soyad ;
        this.ogrencinumarsi =ogrencinumarsi ;
        this.bolum = bolum;
    }
}

