public abstract class BangunDatar2 {
    private int jmlSisi;
    protected String warna;
    protected String border;

    public BangunDatar2 () {
    }

    public int getJmlSisi () {
        return jmlSisi;
    }

    public void setJmlSisi (int jmlSisi) {
        this.jmlSisi = jmlSisi;
    }

    public String getWarna () {
        return warna;
    }

    public void setWarna (String warna) {
        this.warna = warna;
    }

    public String getBorder () {
        return border;
    }

    public void setBorder (String border) {
        this.border = border;
    }

    public void printInfo () {
        System. out.println ("Jumlah sisi: " + jmlSisi) ;
        System. out.println ("Warna: " + warna) ;
        System. out.println ("Border: " + border) ;

    }
    
    public abstract double getLuas();
    public abstract double getKeliling();

    public boolean isEqualLuas(BangunDatar2 X){
        return this.getLuas() == X.getLuas();
    }

    public boolean isEqualKeliling(BangunDatar2 X){
        return this.getKeliling() == X.getKeliling();
    }
}