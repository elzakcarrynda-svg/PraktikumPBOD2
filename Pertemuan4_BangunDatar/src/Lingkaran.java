public class Lingkaran extends BangunDatar {
    private double jari;

    public Lingkaran(){
    }

    public Lingkaran(double diameter, String warna, String border){
        jari = diameter/2;
        setWarna(warna);
        setBorder(border);
        setJmlSisi(1);
    }
    
    public double getJari(){
        return jari;
    }
    public void setJari(double jari){
        this.jari=jari;
    }
    public double getLuas(){
        return 3.14 * (jari*jari);
    }
    public double getKeliling(){
        return 3.14 * (jari*2);
    }
}
