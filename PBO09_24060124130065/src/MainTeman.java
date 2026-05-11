public class MainTeman {
    public static void main(String[] args) {
        Teman<String> KoleksiTeman = new Teman<>();

        System.out.println("Menambahkan Teman ke Koleksi");

        KoleksiTeman.addNama("ALI MASKAN FERRY PURWANTO");
        KoleksiTeman.addNama("AZKA WAYASY AL HAFIZH");
        KoleksiTeman.addNama("BASIL AYMAN HARIADI");
        KoleksiTeman.addNama("CAESAR FERDIANA SUWANDI");
        KoleksiTeman.addNama("CRYSTIANO BAYU SATYA ALVES");
        KoleksiTeman.addNama("DEVANO TRESTANTO");
        KoleksiTeman.addNama("DINDA ISYARIANI");
        KoleksiTeman.addNama("ELZA KHOIRISMA CARRYNDA");
        KoleksiTeman.addNama("FERDY PRASETYA PUTRA");
        KoleksiTeman.addNama("GHATFAN MUHAMMAD ATIWIAR");
        KoleksiTeman.addNama("HANIF IHSANUL HUDA");
        KoleksiTeman.addNama("HASTA PUTRA WILDANTARA");
        KoleksiTeman.addNama("IZZATU KHOIRUL FATA");
        KoleksiTeman.addNama("MARCHELLA ARKHINA RATUNESIA");
        KoleksiTeman.addNama("MENZA ISAIAH TAMPUBOLON");
        KoleksiTeman.addNama("MOHAMMAD ANDHIKA RAMADHAN");
        KoleksiTeman.addNama("MUHAMMAD LUTFI FEBRIANSYAH");
        KoleksiTeman.addNama("NAUFAL DWI YUSMAWAN");
        KoleksiTeman.addNama("NAUFAL RAYAN ATTALLAH");
        KoleksiTeman.addNama("NOVELYA CHERINA");


        System.out.println("\n Daftar Teman");
        KoleksiTeman.showNama();

        // getNbelm()
        System.out.println("\nJumlah teman : " + KoleksiTeman.getNbelm());

        // getNama(indeks)
        System.out.println("\nTeman pada indeks ke-3 : ");
        System.out.println(KoleksiTeman.getNama(3));

        // setNama(indeks, nama)
        System.out.println("\nMengubah nama pada indeks ke-0");
        KoleksiTeman.setNama(0, "ALI MASKAN");

        System.out.println("Hasil setelah setNama : ");
        KoleksiTeman.showNama();

        // isMember(nama)
        System.out.println("\nCek member : ");
        System.out.println(
            KoleksiTeman.isMember("ELZA KHOIRISMA CARRYNDA")
        );

        // gantiNama(nama, namabaru)
        System.out.println("\nMengganti nama ELZA");

        KoleksiTeman.gantiNama(
            "ELZA KHOIRISMA CARRYNDA",
            "ELZA GACOR"
        );

        System.out.println("Hasil setelah gantiNama : ");
        KoleksiTeman.showNama();

        // delNama(nama)
        System.out.println("\nMenghapus DINDA ISYARIANI");

        KoleksiTeman.delNama("DINDA ISYARIANI");

        System.out.println("Hasil setelah delNama : ");
        KoleksiTeman.showNama();


        // KOLEKSI KELAS BENTUKAN
        Piaraan klinik = new Piaraan();

        Anggora k1 = new Anggora("Doreng", 3.5);
        Kembangtelon k2 = new Kembangtelon("Sipus", 4.2);
        Anjing a1 = new Anjing("Tama");
        Burung b1 = new Burung("Owl");

        klinik.enqueueAnabul(k1);
        klinik.enqueueAnabul(k2);
        klinik.enqueueAnabul(a1);
        klinik.enqueueAnabul(b1);

        System.out.println("=== Daftar Anabul ===");
        klinik.showAnabul();

        System.out.println("\nJumlah Anabul : ");
        System.out.println(klinik.getNbelm());

        System.out.println("\nAnabul paling depan : ");
        System.out.println(klinik.getAnabul().getNama());

        System.out.println("\nJumlah keluarga kucing : ");
        System.out.println(klinik.countKucing());

        System.out.println("\nTotal bobot kucing : ");
        System.out.println(klinik.bobotKucing());

        System.out.println("\nJenis Anabul : ");
        klinik.showJenisAnabul();

        System.out.println("\nDequeue Anabul : ");
        System.out.println(klinik.dequeueAnabul().getNama());

        System.out.println("\nIsi antrean setelah dequeue : ");
        klinik.showAnabul();
    }
}