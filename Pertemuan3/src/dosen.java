
public class dosen {
    private String nip;
    private String nama;
    private String prodi;

    dosen(String nip, String nama, String prodi){
        this.nip = nip;
        this.nama = nama;
        this.prodi = prodi; 
    }

    dosen(){
        this("0", "0", "0");
    }
    public String getnip(){
        return nip;
    }
    public String getnama(){
        return nama;
    }
    public String getprodi(){
        return prodi;
    }
    public void setnip(String x){
        nip = x;
    }
    public void setnama(String x){
        nama = x;
    }
    public void setprodi(String x){
        prodi = x;
    }
}


