public class main {
    public static void main(String[] args){
        BangunDatar BD = new BangunDatar();
        BD.setJmlSisi(4);
        BD.setWarna("biru");
        BD.setBorder("merah");
        System.out.println("Sisi Bangundatar = " + BD.getJmlSisi());
        System.out.println("Warna Bangundatar = " + BD.getWarna());
        System.out.println("Border Bangundatar = " + BD.getBorder());
        System.out.println("Info Bangundatar :");
        BD.printInfo();

        Persegi P1 = new Persegi(5, "ungu", "kuning");
        Lingkaran L1 = new Lingkaran(7, "merah", "biru");
        System.out.println("Luas Persegi = " + P1.getLuas());
        System.out.println("Keliling Persegi = " + P1.getKeliling());
        System.out.println("Luas Lingkaran = " + L1.getLuas());
        System.out.println("Keliling Lingkaran = " + L1.getKeliling());
        System.out.println("Info Persegi P1 :");
        P1.printInfo();
        System.out.println("Info Lingkaran L1 :");
        L1.printInfo();

    }
}
