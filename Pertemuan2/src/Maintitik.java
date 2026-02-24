public class Maintitik {

    public static void main(String[] args) {

        Titik T1 = new Titik();   // Membuat objek titik T1 (0,0)

        T1.setAbsis(3);           // mengubah absis jadi 3
        T1.setOrdinat(4);         // mengubah ordinat jadi 4
        T1.printTitik();          // cetak

        T1.geser(3, 4);           // geser sejauh (3,4)
        T1.printTitik();          // cetak lagi

        Titik T2 = new Titik(3, 4);

        T2.printCounter();;

        System.out.println(T2.getKuadran());
        System.out.println(T1.getKuadran());
        Titik T3 = T2.getRefleksiX();
        T3.printTitik();
        T3 = T2.getRefleksiY();
        T3.printTitik();
    }
}