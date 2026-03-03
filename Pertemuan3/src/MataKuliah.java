public class MataKuliah {
    private String idMatkul;
    private String nama;
    private int sks;

    MataKuliah(String idMatkul, String nama, int sks){
        this.idMatkul = idMatkul;
        this.nama = nama;
        this.sks = sks; 
    }

    MataKuliah(){
        this("0", "0", 0);
    }
    public String getidmat(){
        return idMatkul;
    }
    public String getnama(){
        return nama;
    }
    public int getsks(){
        return sks;
    }
    public void setidmat(String x){
        idMatkul = x;
    }
    public void setnama(String x){
        nama = x;
    }
    public void setsks(int x){
        sks = x;
    }
}
