public class MPegawai {
    public static void main(String[] args) {

        System.out.println("-----DOSEN TETAP-----");

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

        System.out.println("-----DOSEN TAMU-----");


        Date lahir2 = new Date(15, 7, 2001);
        Date tmt2 = new Date(1, 9, 2023);
        Date akhirKontrak = new Date(1, 9, 2025);

        DosenTamu d2 = new DosenTamu("1234567890", "11223344", "Midoriya Izuku", lahir2,                     
        tmt2, 4500000, "Fakultas Superhero", akhirKontrak);
        d2.printInfo();

        System.out.println("-----TENDIK-----");
        Date lahir3 = new Date(1, 12, 1998);   
        Date tmt3 = new Date(1, 1, 2020);

        Tendik t = new Tendik("9876543210", "Twilight Sparkle", lahir3, tmt3, 4000000,"Fakultas Magis" );

        t.printInfo();
    }
    
}