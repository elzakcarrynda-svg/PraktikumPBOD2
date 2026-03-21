public class Petani extends Manusia implements Pajak {
    private String asal_kota;
    private static int counterPetani = 0;

    public Petani(String nama, Date tgl_mulai_kerja, String alamat, double pendapatan, String asal_kota) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.asal_kota = asal_kota;
        counterPetani++;
    }

    @Override
    public int hitungMasaKerja() {
        int tahunSekarang = 2026;
        return tahunSekarang - tgl_mulai_kerja.getTahun();
    }

    @Override
    public double hitungPajak() {
        return 0.05 * pendapatan;
    }
}