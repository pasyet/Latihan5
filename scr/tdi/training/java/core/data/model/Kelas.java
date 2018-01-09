package tdi.training.java.core.data.model;

public class Kelas{
    
    private String nama;
    private Integer tahunAjaran;
    private String jurusan;

    public String getNama(){
        return this.nama;
    }
    public void setNama(String nama){
        this.nama = nama;
    }

    public String getTahunAjaran(){
        return this.tahunAjaran;
    }
    public void setTahunAjaran(String tahunAjaran){
        this.tahunAjaran = tahunAjaran;
    }

    public String getJurusan(){
        return this.jurusan;
    }
    public void setJurusan(String jurusan){
        this.jurusan = jurusan;
    }
}