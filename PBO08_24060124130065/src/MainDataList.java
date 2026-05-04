import java.util.ArrayList;

class Data<T> {
    private ArrayList<T> ruang;
    private int banyak;

    public Data() {
        ruang = new ArrayList<>(100);
        for (int i = 0; i < 100; i++) {
            ruang.add(null); 
        }
        banyak = 0;
    }

    public void setIsi(int posisi, T objek) {
        if (posisi >= 1 && posisi <= 100) {
            if (ruang.get(posisi - 1) == null && objek != null) {
                banyak++; 
            }
            ruang.set(posisi - 1, objek);
        } else {
            throw new IndexOutOfBoundsException("Posisi harus 1-100");
        }
    }

    public T getIsi(int posisi) {
        if (posisi >= 1 && posisi <= 100) {
            return ruang.get(posisi - 1);
        } else {
            throw new IndexOutOfBoundsException("Posisi harus 1-100");
        }
    }

    public int getSize() {
        return banyak;
    }
}