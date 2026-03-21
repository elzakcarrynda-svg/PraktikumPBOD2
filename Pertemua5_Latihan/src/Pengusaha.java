public class Pengusaha extends Manusia implements Pajak {
    private String npwp;
    private static int counterPengusaha = 0;

    public Pengusaha(String nama, Date tgl_mulai_kerja, String alamat, double pendapatan, String npwp) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.npwp = npwp;
        counterPengusaha++;
    }

    @Override
    public int hitungMasaKerja() {
        int tahunSekarang = 2026;
        return tahunSekarang - tgl_mulai_kerja.getTahun();
    }

    @Override
    public double hitungPajak() {
        return 0.15 * pendapatan;
    }
}