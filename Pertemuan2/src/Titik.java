/* Nama File   : Titik.java
 * Deskripsi   : berisi atribut dan method dalam class Titik
 * Pembuat     : Elza
 * Tanggal     : 24 feb
 */

public class Titik {

    /***************ATRIBUT****************/
    double absis;
    double ordinat;
    static int counterTitik =0;

    /***************METHOD****************/

    // konstruktor untuk membuat titik (0,0)
    Titik() {
        absis = 0;
        ordinat = 0;
        counterTitik++;
    }

    Titik(double x, double y){
        absis = x;
        ordinat = y;
        counterTitik++;
    }

    void printCounter(){
        System.out.println(counterTitik);
    }

    // mengembalikan nilai absis
    double getAbsis() {
        return absis;
    }

    // mengembalikan nilai ordinat
    double getOrdinat() {
        return ordinat;
    }

    // mengeset absis titik dengan nilai baru x
    void setAbsis(double x) {
        absis = x;
    }

    // mengeset ordinat titik dengan nilai baru y
    void setOrdinat(double y) {
        ordinat = y;
    }

    // menggeser nilai absis dan ordinat titik masing-masing sejauh x dan y
    void geser(double x, double y) {
        absis = absis + x;
        ordinat = ordinat + y;   // (di gambar tadi tertulis + x, itu typo)
    }

    // mencetak koordinat titik
    void printTitik() {
        System.out.println("Titik (" + absis + ", " + ordinat + ")");
    }

    int getKuadran() {
        if (absis>0 && ordinat >0){
            return 1;
        }
        else if (absis<0 && ordinat>0){
            return 2;
        }
        else if (absis<0 && ordinat<0){
            return 3;
        }
        else if (absis>0 && ordinat<0){
            return 4;
        }
        else{
            return 0;
        }
    }


    Titik getRefleksiX(){
        Titik T = new Titik(absis, ordinat*-1);
        return T;
    }

    Titik getRefleksiY(){
        Titik T = new Titik(absis*-1, ordinat);
        return T;
    }
} 
    
    // end class Titik

