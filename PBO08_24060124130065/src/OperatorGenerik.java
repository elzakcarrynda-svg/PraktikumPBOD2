public class OperatorGenerik {
    public static <T> void Tukar(Datum<T> a, Datum<T> b) {
        T temp = a.getIsi();
        a.setIsi(b.getIsi());
        b.setIsi(temp);
    }
     public static <T extends Kucing2> double Bobot2(T k1, T k2) {
        return k1.getBobot() + k2.getBobot();
    }
}