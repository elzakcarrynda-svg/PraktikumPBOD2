class Mahasiswa {
    String nim;
    String nama;
    String programStudi;

    // c tanpa parameter
    Mahasiswa() {
        nim = "-999";
        nama = "n/a";
        programStudi = "n/a";
    }

    // d 3 parameter
    Mahasiswa(String nim, String nama, String programStudi) {
        this.nim = nim;
        this.nama = nama;
        this.programStudi = programStudi;
    }

    // e cloning
    Mahasiswa(Mahasiswa m) {
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