public class Persegi extends BangunDatar{
    private double sisi;

    public Persegi() {
        setJmlSisi(4);
    }

    public Persegi (double sisi, String warna, String border) {
        this.sisi = sisi;
        setWarna(warna);
        setBorder(border);
        setJmlSisi(4);
    }

    public double getSisi(){
        return sisi;
    }

    public void setSisi (double sisi) {
        this.sisi = sisi;
    }

    public double getLuas(){
        return sisi*sisi;
    }

    public double getKeliling(){
        return sisi*4;
    }

    public double getDiagonal(){
        return Math.sqrt((sisi*sisi)*2);
    }

}
