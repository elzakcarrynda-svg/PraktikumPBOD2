import java.util.ArrayList;

public class Piaraan {
    private int nbelm;
    private ArrayList<Anabul> Lanabul;

    public Piaraan() {
        Lanabul = new ArrayList<>();
        nbelm = 0;
        for(int i = 0; i < 100; i++) {
            Lanabul.add(null);
        }
    }

    public int getNbelm() {
        return nbelm;
    }

    public void enqueueAnabul(Anabul anabul) {
        Lanabul.set(nbelm, anabul);
        nbelm++;

    }

    public boolean isMember(Anabul anabul) {
        boolean member = false;
        for(int i = 0; i < nbelm; i++) {
            if(Lanabul.get(i) == anabul) {
                member = true;
            }
        }
        return member;
    }

    public Anabul getAnabul() {
        if(nbelm != 0) {
            return Lanabul.get(0);
        }
        else {
            return null;
        }
    }

    public Anabul dequeueAnabul() {
        if(nbelm == 0) {
            return null;
        }
        Anabul keluar = Lanabul.get(0);
        for(int i = 0; i < nbelm - 1; i++) {
            Lanabul.set(i, Lanabul.get(i + 1));

        }
        Lanabul.set(nbelm - 1, null);
        nbelm--;
        return keluar;
    }


    public void showAnabul() {
        for(int i = 0; i < nbelm; i++) {
            System.out.println(Lanabul.get(i).getNama());
        }
    }

    public int countKucing() {
        int count = 0;
        for(int i = 0; i < nbelm; i++) {
            if(Lanabul.get(i) instanceof Kucing) {
                count++;
            }
        }
        return count;
    }

    public double bobotKucing() {
        double total = 0;
        for(int i = 0; i < nbelm; i++) {
            if(Lanabul.get(i) instanceof Kucing) {
                total += ((Kucing) Lanabul.get(i)).getBobot();
            }
        }
        return total;
    }

    public void showJenisAnabul() {
        for(int i = 0; i < nbelm; i++) {
            System.out.println(
                Lanabul.get(i).getNama() + ":"+ Lanabul.get(i).getClass().getName()
            );

        }
    }
}