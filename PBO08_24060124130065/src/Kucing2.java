public class Kucing2 extends Anabul {
    private double bobot; 

    public Kucing2(String nama, double bobot) {
        super(nama);
        this.bobot = bobot;
    }

    public double getBobot() {
        return bobot;
    }

    public void setBobot(double bobot) {
        this.bobot = bobot;
    }

    @Override
    public void gerak() {
        System.out.println(getNama() + " berjalan dengan melata");
    }

    @Override
    public void bersuara() {
        System.out.println(getNama() + " berbunyi: mraow meow meong rawwr");
    }
}