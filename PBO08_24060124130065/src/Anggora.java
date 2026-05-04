public class Anggora extends Kucing2 {
    public Anggora(String nama, double bobot) {
        super(nama, bobot);
    }

    @Override
    public void bersuara() {
        System.out.println(getNama() + " berbunyi: meooong lembut (Anggora)");
    }
}