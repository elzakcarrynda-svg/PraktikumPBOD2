public class Kendaraan {
    private String noPlat;
    private String jenis;

    Kendaraan(String noPlat, String jenis){
        this.noPlat = noPlat;
        this.jenis = jenis;
    }
    Kendaraan(){
        this("0", "0");
    }
    public String getnoplat(){
        return noPlat;
    }
    public String getjenis(){
        return jenis;
    }
    public void setnoplat(String x){
        noPlat = x;
    }
    public void setjenis(String x){
        jenis = x;
    }
}


