public class PNS extends Manusia implements Pajak {
    private String nip;
    private static int counterPNS = 0;

    public PNS(String nama, Date tgl_mulai_kerja, String alamat, double pendapatan, String nip) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.nip = nip;
        counterPNS++;
    }

    @Override
    public int hitungMasaKerja() {
        int tahunSekarang = 2026; 
        return tahunSekarang - tgl_mulai_kerja.getTahun();
    }

    @Override
    public double hitungPajak() {
        return 0.1 * pendapatan;
    }
}