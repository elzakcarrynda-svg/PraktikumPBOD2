public class Tendik extends Pegawai {

    private String bidang;

    public Tendik() {
    }

    public Tendik(String nip, String nama, Date tanggalLahir, Date tmt, double gajiPokok, String bidang) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok);
        this.bidang = bidang;
    }

    public String getBidang() {
        return bidang;
    }

    public void setBidang(String bidang) {
        this.bidang = bidang;
    }

    public int getBUP() {
        return 55;
    }

    public double hitungTunjangan() {

        int masaKerja = hitungMasaKerjaTahun();
        return 0.01 * masaKerja * getGajiPokok();
    }

    @Override
    public void printInfo() {

        super.printInfo();

        System.out.println("Jabatan : Tendik");
        System.out.println("Bidang : " + bidang);
        System.out.println("Masa Kerja : " + getMasaKerja());
        System.out.println("Gaji Pokok : Rp " + getGajiPokok());
        System.out.println("Tunjangan : Rp " + hitungTunjangan());
    }
}