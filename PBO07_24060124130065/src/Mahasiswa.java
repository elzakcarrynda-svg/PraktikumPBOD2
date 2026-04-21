public class Mahasiswa {
    private String nim;
    private String nama;
    private String programStudi;

    // c. tanpa parameter
    public Mahasiswa() {
        nim = "-999";
        nama = "n/a";
        programStudi = "n/a";
    }

    // d 3 parameter
    public Mahasiswa(String nim, String nama, String programStudi) {
        this.nim = nim;
        this.nama = nama;
        this.programStudi = programStudi;
    }

    // e cloning
    public Mahasiswa(Mahasiswa m) {
        this.nim = m.nim;
        this.nama = m.nama;
        this.programStudi = m.programStudi;
    }

    // a Overloading setProgramStudi()

    // tanpa parameter
    void setProgramStudi() {
        programStudi = "Kosong";
    }

    // 1 parameter String
    void setProgramStudi(String prodi) {
        programStudi = prodi;
    }

    // 1 parameter objek Mahasiswa
    void setProgramStudi(Mahasiswa m) {
        programStudi = m.programStudi;
    }

    void tampil() {
        System.out.println("NIM           : " + nim);
        System.out.println("Nama          : " + nama);
        System.out.println("Program Studi : " + programStudi);
        System.out.println();
    }
}