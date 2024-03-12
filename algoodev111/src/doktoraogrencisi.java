public class doktoraogrencisi extends ogrenci{
    public String tezkonusu;
    public String danisman ;
    public boolean yeterlilik ;

    public String getTezkonusu() {
        return tezkonusu;
    }

    public void setTezkonusu(String tezkonusu) {
        this.tezkonusu = tezkonusu;
    }

    public String getDanisman() {
        return danisman;
    }

    public void setDanisman(String danisman) {
        this.danisman = danisman;
    }

    public boolean isYeterlilik() {
        return yeterlilik;
    }

    public void setYeterlilik(boolean yeterlilik) {
        this.yeterlilik = yeterlilik;
    }

    public doktoraogrencisi(String ad, String soyad, int ogrencinumarsi, String bolum , String tezkonusu , String danisman , boolean yeterlilik) {
        super(ad, soyad, ogrencinumarsi, bolum);
        this.tezkonusu = tezkonusu;
        this.danisman = danisman;
        this.yeterlilik = yeterlilik ;
    }
    public void bilgi(){
        System.out.println("ad = " + ad + ", soyad = " + soyad + ", numara = " + ogrencinumarsi + ", bölüm = " + bolum + ",  tez konusu = " + tezkonusu + ", danışman = " + danisman + ", yeterlilik = " + yeterlilik);
    }
}
