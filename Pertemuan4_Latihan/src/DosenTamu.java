public class DosenTamu extends Dosen {

    private String nidk;
    private Date akhirKontrak;

    public DosenTamu() {
    }

    public String getNidk() {
        return nidk;
    }

    public void setNidk(String nidk) {
        this.nidk = nidk;
    }

    public Date getAkhirKontrak() {
        return akhirKontrak;
    }

    public void setAkhirKontrak(Date akhirKontrak) {
        this.akhirKontrak = akhirKontrak;
    }

    public double hitungTunjangan() {
        return 0.025 * getGajiPokok();
    }

    @Override
    public void printInfo() {

        super.printInfo();

        System.out.println("NIDK : " + nidk);
        System.out.println("Jabatan : Dosen Tamu");
        System.out.println("Fakultas : " + getFakultas());
        System.out.println("Akhir Kontrak : " + akhirKontrak.formatTanggal());
        System.out.println("Gaji Pokok : Rp " + getGajiPokok());
        System.out.println("Tunjangan : Rp " + hitungTunjangan());
    }
}