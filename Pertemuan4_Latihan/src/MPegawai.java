public class MPegawai {
    public static void main(String[] args) {

        Date lahir = new Date();
        lahir.setHari(5);
        lahir.setBulan(5);
        lahir.setTahun(1990);

        Date tmt = new Date();
        tmt.setHari(1);
        tmt.setBulan(1);
        tmt.setTahun(2015);

        DosenTetap d = new DosenTetap();

        d.setNip("9545647548");
        d.setNidn("78647324");
        d.setNama("Andi");
        d.setTanggalLahir(lahir);
        d.setTmt(tmt);
        d.setFakultas("Fakultas Sains dan Matematika");
        d.setGajiPokok(5000000);

        d.printInfo();
    }
}