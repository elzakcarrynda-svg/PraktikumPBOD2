public class Kembangtelon extends Kucing2 {
    public Kembangtelon(String nama, double bobot) {
        super(nama, bobot);
    }

    @Override
    public void bersuara() {
        System.out.println(getNama() + " berbunyi: meong galak (Kembangtelon)");
    }
}