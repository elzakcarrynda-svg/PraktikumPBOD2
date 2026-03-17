public class Pegawai {

    private String nip;
    private String nama;
    private Date tanggalLahir;
    private Date tmt;
    private double gajiPokok;

    public Pegawai() {
    }

    public Pegawai(String nip, String nama, Date tanggalLahir, Date tmt, double gajiPokok) {
        this.nip = nip;
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
        this.tmt = tmt;
        this.gajiPokok = gajiPokok;
    }
    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Date getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(Date tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    public Date getTmt() {
        return tmt;
    }

    public void setTmt(Date tmt) {
        this.tmt = tmt;
    }

    public double getGajiPokok() {
        return gajiPokok;
    }

    public void setGajiPokok(double gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    public int hitungMasaKerjaTahun() {
        int tahunSekarang = 2025;
        return tahunSekarang - tmt.getTahun();
    }

    public int hitungMasaKerjaBulan() {
        int bulanSekarang = 3;
        return bulanSekarang - tmt.getBulan();
    }

    public String getMasaKerja() {
        return hitungMasaKerjaTahun() + " tahun " + hitungMasaKerjaBulan() + " bulan";
    }

    public void printInfo() {

        System.out.println("NIP : " + nip);
        System.out.println("Nama : " + nama);
        System.out.println("Tanggal Lahir : " + tanggalLahir.formatTanggal());
        System.out.println("TMT : " + tmt.formatTanggal());
    }
}