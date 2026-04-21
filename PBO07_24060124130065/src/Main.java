public class Main {
    public static void main(String[] args) {

        // b
        Mahasiswa m1 = new Mahasiswa();
        m1.setProgramStudi();
        m1.tampil();

        Mahasiswa m2 = new Mahasiswa();
        m2.setProgramStudi("Informatika");
        m2.tampil();

        Mahasiswa m3 = new Mahasiswa();
        m3.setProgramStudi(m2);
        m3.tampil();


        // c
        Mahasiswa a = new Mahasiswa();
        a.tampil();

        // d
        Mahasiswa b = new Mahasiswa("24060124130065", "Elza Khoirisma Carrynda", " Informatika");
        b.tampil();

        // e
        Mahasiswa c = new Mahasiswa(b);
        c.tampil();
    }
}