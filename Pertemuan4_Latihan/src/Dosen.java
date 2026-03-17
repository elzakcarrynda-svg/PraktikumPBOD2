public class Dosen extends Pegawai {
    private String fakultas;

    public Dosen() {
    }

    public Dosen(String nip, String nama, Date tanggalLahir, Date tmt, double gajiPokok, String fakultas){

        super(nip, nama, tanggalLahir, tmt, gajiPokok);
        this.fakultas = fakultas;
    }

    public String getFakultas() {
        return fakultas;
    }

    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }

}