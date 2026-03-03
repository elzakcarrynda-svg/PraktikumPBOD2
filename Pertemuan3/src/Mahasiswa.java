import java.util.ArrayList;

public class Mahasiswa {
    private String nim;
    private String nama;
    private String prodi;
    ArrayList<MataKuliah> listMatkul;
    private dosen dosenwali;
    private Kendaraan kendaraan;

    public Mahasiswa(String nim, String nama, String prodi){
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.listMatkul = new ArrayList<>(); 
    }
    public Mahasiswa(){
        this("0", "0", "0");
    }

    public String getnim(){
        return nim;
    }
    public String getnama(){
        return nama;
    }
    public String getprodi(){
        return prodi;
    }
    public ArrayList<MataKuliah> getlistMatkul(){
        return listMatkul;
    }
    public dosen getdosenwali(){
        return dosenwali;
    }
    public Kendaraan getkendaraan(){
        return kendaraan;
    }
    public void setnim(String x){
        nim = x;
    }
    public void setnama(String x){
        nama = x;
    }
    public void setprodi(String x){
        prodi = x;
    }

    public void setdosenwali(dosen x){
        dosenwali = x;
    }
    public void setkendaraan(Kendaraan x){
        kendaraan = x;
    }
    public void addMatkul(MataKuliah newMatkul){
        listMatkul.add(newMatkul);
    }

    public int getjumlahsks(){
        int jumlah = 0;
        int i;
        for(i=0; i<listMatkul.size(); i++){
            int sks = listMatkul.get(i).getsks();
            jumlah+=sks;        
        }
        return jumlah;
    }
    public int getjumlahmatkul(){
        int jumlah = 0;
        int i;
        for(i=0; i<listMatkul.size(); i++){
            jumlah+=1;     
        }
        return jumlah;
    }

    public void printMhs(){
        System.out.println("NIM:" + nim);
        System.out.println("Nama:" + nama);
        System.out.println("Prodi:" + prodi);
    }

    public void printDetailMhs(){
        System.out.println("NIM:" + nim);
        System.out.println("Nama:" + nama);
        System.out.println("Prodi:" + prodi);
        int i;
        for(i=0; i<listMatkul.size(); i++){
            System.out.println(listMatkul.get(i).getnama());
        }
        System.out.println("Dosen:" + dosenwali.getnama());
        System.out.println("Kendaraan:" + kendaraan.getjenis());
    }

}
