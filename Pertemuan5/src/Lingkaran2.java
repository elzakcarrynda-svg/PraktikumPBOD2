public class Lingkaran2 extends BangunDatar2 implements IResize{
    private double jari;

    public Lingkaran2(){
    }

    public Lingkaran2(double diameter) {
        this.jari = diameter / 2;
        setJmlSisi(1);
    }

    public Lingkaran2(double diameter, String warna, String border){
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

    @Override
    public double getLuas() {
        return 3.14 * jari * jari;
    }

    @Override
    public double getKeliling() {
        return 2 * 3.14 * jari;
    }

    @Override
    public void zoomIn(){
        jari = jari * 1.1;
    }

    @Override
    public void zoomOut(){
        jari = jari * 0.9;
    }

    @Override
    public void zoom(int percent){
        jari = jari * percent/100;
    }
}

