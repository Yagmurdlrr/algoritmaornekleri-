public class yükseklisansogrencisi  extends ogrenci {
    public String tezkonusu;
    public String danisman;

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

    public yükseklisansogrencisi(String ad, String soyad, int ogrencinumarsi, String bolum, String tezkonusu, String danisman) {
        super(ad, soyad, ogrencinumarsi, bolum);
        this.tezkonusu = tezkonusu;
        this.danisman = danisman;
    }

    public void bilgi() {
        System.out.println("ad = " + ad + ", soyad = " + soyad + ", numara = " + ogrencinumarsi + ", bölüm = " + bolum + ",  tez konusu = " + tezkonusu + ", danışman = " + danisman);
    }
}
