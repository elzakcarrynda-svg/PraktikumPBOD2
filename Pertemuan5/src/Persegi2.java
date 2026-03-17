public class Persegi2 extends BangunDatar2 implements IResize{
    private double sisi;

    public Persegi2() {
        setJmlSisi(4);
    }

    public Persegi2(double sisi) {
        this.sisi = sisi;
        setJmlSisi(4);
    }

    public Persegi2 (double sisi, String warna, String border) {
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

    @Override
    public double getLuas() {
        return sisi * sisi;
    }

    @Override
    public double getKeliling() {
        return 4 * sisi;
    }

    public double getDiagonal(){
        return Math.sqrt((sisi*sisi)*2);
    }

    @Override
    public void zoomIn(){
        sisi = sisi * 1.1;
    }

    @Override
    public void zoomOut(){
        sisi = sisi * 0.9;
    }

    @Override
    public void zoom(int percent){
        sisi = sisi * percent/100;
    }
}
