public class mbangundatar {
    public static void main(String[] args){

        BangunDatar2 BD = new Persegi2(4, "biru", "merah");
        System.out.println("Sisi BangunDatar = " + BD.getJmlSisi());
        System.out.println("Warna BangunDatar = " + BD.getWarna());
        System.out.println("Border BangunDatar = " + BD.getBorder());
        System.out.println("Info BangunDatar :");
        BD.printInfo();

        Persegi2 P1 = new Persegi2(5, "ungu", "kuning");
        Lingkaran2 L1 = new Lingkaran2(7, "merah", "biru");

        BangunDatar2 P2 = new Persegi2(10);
        BangunDatar2 L2 = new Lingkaran2(14);

        System.out.println("\nLuas Persegi = " + P1.getLuas());
        System.out.println("Keliling Persegi = " + P1.getKeliling());

        System.out.println("\nLuas Lingkaran = " + L1.getLuas());
        System.out.println("Keliling Lingkaran = " + L1.getKeliling());

        System.out.println("\nInfo Persegi P1 :");
        P1.printInfo();

        System.out.println("\nInfo Lingkaran L1 :");
        L1.printInfo();

 
        System.out.println("\n----PERBANDINGAN----");
        System.out.println("P1 vs L1 (Luas): " + P1.isEqualLuas(L1));
        System.out.println("P1 vs L1 (Keliling): " + P1.isEqualKeliling(L1));

        System.out.println("P2 vs L2 (Luas): " + P2.isEqualLuas(L2));
        System.out.println("P2 vs L2 (Keliling): " + P2.isEqualKeliling(L2));

        System.out.println("\n---RESIZE---");

        Persegi2 p = new Persegi2(10);
        System.out.println("Sisi awal: " + p.getSisi());
        p.zoomIn();
        System.out.println("Setelah zoomIn: " + p.getSisi());
        p.zoomOut();
        System.out.println("Setelah zoomOut: " + p.getSisi());
    }
}