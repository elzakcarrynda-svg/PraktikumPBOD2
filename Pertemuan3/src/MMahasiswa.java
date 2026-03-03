public class MMahasiswa {
    public static void main(String[] args){
        MataKuliah PBO = new MataKuliah("PBO", "Pemrograman Berorientasi Objek", 3);
        MataKuliah MBD = new MataKuliah("MBD", "Manajemen Basis Data", 3);
        Mahasiswa M1 = new Mahasiswa("065", "Elza", "Informatika");
        dosen D1 = new dosen("123", "Elza", "Informatika");
        Kendaraan K1 = new Kendaraan("R2096JJ", "motor");
        M1.setdosenwali(D1);
        M1.setkendaraan(K1);
        M1.addMatkul(PBO);
        M1.addMatkul(MBD);
        M1.printMhs();
        M1.printDetailMhs();
        System.out.println("Jumlah Mata Kuliah = " + M1.getjumlahmatkul());
        System.out.println("Jumlah SKS = " + M1.getjumlahsks());
    }
}
