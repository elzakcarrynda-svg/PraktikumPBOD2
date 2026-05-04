public class Main8 {
    public static void main(String[] args) {
        //1
        System.out.println("\nNomer 1 GENERIK PADA CLASS");
        Anggora k1 = new Anggora("Doreng", 3.5);
        Kembangtelon k2 = new Kembangtelon("Sipus", 4.2);

        Datum<Anabul> d1 = new Datum<>(k1);
        Datum<Anabul> d2 = new Datum<>(k2);

        // akses isi
        d1.getIsi().gerak();
        d1.getIsi().bersuara();
        d2.getIsi().gerak();
        d2.getIsi().bersuara();

        // ubah isi
        d1.setIsi(k2);

        System.out.println("Setelah diubah:");
        d1.getIsi().bersuara();
        //data 1 doreng jadi sipus

        //2
        //integer
        System.out.println("\nNomer 2 GENERIK PADA OPERATOR");
        Datum<Integer> a = new Datum<>(6);
        Datum<Integer> b = new Datum<>(7);

        OperatorGenerik.Tukar(a, b);
        System.out.println("a = " + a.getIsi()); 
        System.out.println("b = " + b.getIsi()); 

        //String
        Datum<String> s1 = new Datum<>("Ohayo Sekai");
        Datum<String> s2 = new Datum<>("Good Morning World");

        OperatorGenerik.Tukar(s1, s2);
        System.out.println(s1.getIsi());
        System.out.println(s2.getIsi()); 

        //Keluarga Anabul
        Anggora k3 = new Anggora("Sapi", 3.5);
        Kembangtelon k4 = new Kembangtelon("Kosi", 4.2);

        Datum<Anabul> d3 = new Datum<>(k3);
        Datum<Anabul> d4 = new Datum<>(k4);

        OperatorGenerik.Tukar(d3, d4);
        d3.getIsi().bersuara(); 
        d4.getIsi().bersuara(); 

        //Bobot2
        double total = OperatorGenerik.Bobot2(k3, k4);
        System.out.println("Total bobot: " + total + " kg");

        // Aplikasi kelas data
        System.out.println("\nNomer 3 LARIK GENERIK");

        Data<Anabul> dataHewan = new Data<>();

        // b setIsi
        dataHewan.setIsi(1, new Anggora("Mbek", 3.0));
        dataHewan.setIsi(2, new Kembangtelon("Loreng", 4.5));
        dataHewan.setIsi(3, new Anjing("Tama"));
        dataHewan.setIsi(4, new Burung("Owl"));

        // c getIsi
        System.out.println("\n Menampilkan isi:");
        for (int i = 1; i <= 4; i++) {
            Anabul e = dataHewan.getIsi(i);
            if (e != null) {
            e.gerak();
            e.bersuara();
            }
        }

        // d getSize
        System.out.println("\n Jumlah elemen terisi: " + dataHewan.getSize());
    }
}