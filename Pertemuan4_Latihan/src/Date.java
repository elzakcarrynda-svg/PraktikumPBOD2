public class Date {

    private int hari;
    private int bulan;
    private int tahun;

    public Date() {
    }

    public int getHari() {
        return hari;
    }

    public void setHari(int hari) {
        this.hari = hari;
    }

    public int getBulan() {
        return bulan;
    }

    public void setBulan(int bulan) {
        this.bulan = bulan;
    }

    public int getTahun() {
        return tahun;
    }

    public void setTahun(int tahun) {
        this.tahun = tahun;
    }

    public String getNamaBulan() {

        String[] nama = {
            "Januari","Februari","Maret","April","Mei","Juni",
            "Juli","Agustus","September","Oktober","November","Desember"
        };

        return nama[bulan-1];
    }

    public String formatTanggal() {
        return hari + " " + getNamaBulan() + " " + tahun;
    }
}