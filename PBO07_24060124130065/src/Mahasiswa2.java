public class Mahasiswa2 extends CivitasAkademika {
    private String nim;
    private Dosen dosenWali;

    public Mahasiswa2(String nama, String nim) {
        super(nama);
        this.nim = nim;
    }

    @Override
    public String getNomor() {
        return nim;
    }

    public void setWali(Dosen d) {
        this.dosenWali = d;
    }

    public void tampilDataMahasiswa() {
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        if (dosenWali != null) {
            System.out.println("Dosen Wali: " + dosenWali.getNama());
        }
        System.out.println();
    }
}