public class Burung extends Anabul {
    public Burung(String nama) {
        super(nama);
    }

    @Override
    public void gerak() {
        System.out.println(getNama() + " berjalan dengan melata");
    }

    @Override
    public void bersuara() {
        System.out.println(getNama() + " berbunyi: cuitttttcwitcwitcitcitcitcit");
    }
}