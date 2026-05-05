import java.util.ArrayList;

public class Teman<T> {
    private int nbelm;
    private ArrayList<T> Lnama;


    public Teman(int size) {
        Lnama = new ArrayList<>();
        nbelm = 0;
    }

    public int getNbelm() {
        return nbelm;
    }

    public T getNama( int indeks ) {
        if (indeks >= 1 && indeks <= nbelm) {
            return Lnama.get(indeks - 1);
        } else {
            throw new IndexOutOfBoundsException("Kosong");
        }
    }

    public void setNama( int indeks, T nama) {
        if (Lnama.get(indeks- 1) == null && nama != null) {
                nbelm++; 
            }
            Lnama.set(indeks-1, nama);
        } 
    
    public void addNama(T nama) {
        setNama(nbelm, nama);
        nbelm++;
    }

    public void delNama(T nama) {
        if(nbelm!=0){
            for(int i=0; i <nbelm-1; i++) {
                if(getNama(i) == nama){
                    for(int j=1; j < nbelm-2; j++){
                        setNama(j, getNama(j+1));
                    }
                }
            }
            nbelm--;
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