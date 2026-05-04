public class Main {
    /* Menurut saya, polimorfisme itu konsep di mana satu method yang sama 
    bisa punya banyak bentuk atau perilaku tergantung objek yang menjalankannya. 
    Jadi walaupun kita manggil method yang sama, misalnya bersuara(), 
    hasilnya bisa beda—kalau objeknya kucing jadi “meong”, kalau anjing jadi “guk-guk”. 
    Ibaratnya kayak kalo ke manusia satu perintah yang sama bisa dilakuin berbeda di orang yg berbeda
    karena masing-masing punya cara sendiri untuk merespons. */
    public static void main(String[] args) {

        // 2b
        Mahasiswa m1 = new Mahasiswa();
        m1.setProgramStudi();
        m1.tampil();

        Mahasiswa m2 = new Mahasiswa();
        m2.setProgramStudi("Informatika");
        m2.tampil();

        Mahasiswa m3 = new Mahasiswa();
        m3.setProgramStudi(m2);
        m3.tampil();


        // 2c
        Mahasiswa a = new Mahasiswa();
        a.tampil();

        // 2d
        Mahasiswa b = new Mahasiswa("24060124130065", "Elza Khoirisma Carrynda", " Informatika");
        b.tampil();

        // 2e
        Mahasiswa c = new Mahasiswa(b);
        c.tampil();

        //3
        Anabul[] daftarHewan = { 
            new Kucing("Sucipto"),
            new Anjing("Santoso"), 
            new Burung("Setiawan") 
        }; 
        
        for (Anabul hewan : daftarHewan) { 
            hewan.gerak(); 
            hewan.bersuara(); 
            System.out.println(); 
        }

        // 4e 2 dosen
        Dosen d1 = new Dosen("Pak Kinger", "D001");
        Dosen d2 = new Dosen("Bu Queenie", "D002");

        // 4e 5 mahasiswa
        Mahasiswa2 M1 = new Mahasiswa2("Pomni", "M001");
        Mahasiswa2 M2 = new Mahasiswa2("Jax", "M002");
        Mahasiswa2 M3 = new Mahasiswa2("Ragatha", "M003");
        Mahasiswa2 M4 = new Mahasiswa2("Gangle", "M004");
        Mahasiswa2 M5 = new Mahasiswa2("Zooble", "M005");

        // 4i set dosen wali
        M1.setWali(d1);
        M2.setWali(d1);
        M3.setWali(d2);
        M4.setWali(d2);
        M5.setWali(d1);

        Seminar seminar = new Seminar();

        // 4f registrasi 7 peserta
        seminar.registrasi(d1);
        seminar.registrasi(d2);
        seminar.registrasi(M1);
        seminar.registrasi(M2);
        seminar.registrasi(M3);
        seminar.registrasi(M4);
        seminar.registrasi(M5);

        // 4g tampil peserta
        seminar.tampilPeserta();

        // 4c jumlah peserta
        System.out.println("Total peserta: " + seminar.countPeserta());

        // 4h jumlah mahasiswa
        System.out.println("Jumlah mahasiswa: " + seminar.countMahasiswa());

        // 4j tampil data mahasiswa
        M1.tampilDataMahasiswa();
    }
}
