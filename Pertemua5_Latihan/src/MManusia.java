public class MManusia {
    public static void main(String[] args) {

        Date tgl1 = new Date(1, 1, 2020);
        Date tgl2 = new Date(1, 1, 2018);
        Date tgl3 = new Date(1, 1, 2019);

        PNS pns = new PNS("Budi", tgl1, "Jakarta", 5000000, "123");
        Pengusaha pengusaha = new Pengusaha("Siti", tgl2, "Bandung", 10000000, "456");
        Petani petani = new Petani("Joko", tgl3, "Solo", 3000000, "Klaten");

        pns.cetakInfo();
        System.out.println("Masa kerja: " + pns.hitungMasaKerja());
        System.out.println("Pajak: " + pns.hitungPajak());
    }
}