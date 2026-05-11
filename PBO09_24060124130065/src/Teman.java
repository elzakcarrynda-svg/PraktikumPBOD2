import java.util.ArrayList;

public class Teman<T> {
    private int nbelm;
    private ArrayList<T> Lnama;


    public Teman() {
        Lnama = new ArrayList<>();
        nbelm = 0;
        for(int i = 0; i < 100; i++) {
            Lnama.add(null);
        }
    }

    public int getNbelm() {
        return nbelm;
    }

    public T getNama( int indeks ) {
        if (indeks >= 0 && indeks <= nbelm) {
            return Lnama.get(indeks);
        } else {
            throw new IndexOutOfBoundsException("Indeks gk valid");
        }
    }

    public void setNama(int indeks, T nama) {
        if(Lnama.get(indeks) == null && nama != null) {
        nbelm++;
        }
        Lnama.set(indeks, nama);
    }
    
    public void addNama(T nama) {
        setNama(nbelm, nama);
    }

    public void delNama(T nama) {
        if(nbelm != 0){
            for(int i = 0; i < nbelm; i++) {
                if(getNama(i).equals(nama)) {
                    for(int j = i; j < nbelm - 1; j++) {
                        setNama(j, getNama(j + 1));
                    }
                Lnama.set(nbelm - 1, null);
                nbelm--;
                break;
            }
        }
    }
}

    public boolean isMember(T nama) {
        boolean member;
        member = false;
        if(nbelm != 0){
            for(int i=0; i<nbelm-1; i++){
                if(getNama(i) == nama){
                    member = true;
                }
            }                                                       
        }
        else{
            member = false;
        }
        return member;
    }

public void gantiNama(T nama, T namabaru){
    if(isMember(nama)){
        for(int i = 0; i<nbelm; i++){
            if(getNama(i) == nama){
                setNama(i, namabaru);
            }
        }
    }
}

public void showNama(){
    for(int i = 0; i<nbelm; i++){
        System.out.println(getNama(i));
    }
}

}