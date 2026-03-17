public class DosenTetap extends Dosen {

    private String nidn;

    public DosenTetap() {
    }

    public DosenTetap(String nip, String nidn, String nama, Date tanggalLahir, Date tmt,
    double gajiPokok, String fakultas) {

        super(nip, nama, tanggalLahir, tmt, gajiPokok, fakultas);
        this.nidn = nidn;
    }

    public String getNidn() {
        return nidn;
    }

    public void setNidn(String nidn) {
        this.nidn = nidn;
    }

    public int getBUP() {
        return 65;
    }

    public String hitungTanggalPensiun() {

        int tahun = getTanggalLahir().getTahun() + getBUP();
        int bulan = getTanggalLahir().getBulan() + 1;

        String[] namaBulan = {
            "Januari","Februari","Maret","April","Mei","Juni",
            "Juli","Agustus","September","Oktober","November","Desember"
        };

        return "1 " + namaBulan[bulan-1] + " " + tahun;
    }

    public double hitungTunjangan() {

        int masaKerja = hitungMasaKerjaTahun();
        return 0.02 * masaKerja * getGajiPokok();
    }

    @Override
    public void printInfo() {

        super.printInfo();

        int masaKerja = hitungMasaKerjaTahun();

        System.out.println("NIDN : " + nidn);
        System.out.println("Jabatan : Dosen Tetap");
        System.out.println("Fakultas : " + getFakultas());
        System.out.println("Masa Kerja : " + getMasaKerja());
        System.out.println("Tanggal Pensiun : " + hitungTanggalPensiun());
        System.out.println("Gaji Pokok : Rp " + getGajiPokok());

        System.out.println(
                "Tunjangan : 2% x " + masaKerja +
                " x Rp " + getGajiPokok() +
                " = Rp " + hitungTunjangan()
        );
    }
}