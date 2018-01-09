package tdi.training.java.core.data.model;

import tdi.training.java.core.data.model.Kelas;

public class Mahasiswa{
    
    private String nim, nama;
    private LocalDate tanggalLahir;
    private Integer angkatan;
    private Kelas kelas;


    public String getNama(){
        return this.nama;
    }
    public void setNama(String nama){
        this.nama = nama;
    }

    public String getNim(){
        return this.nim;
    }
    public void setNim(String nim){
        this.nim = nim;
    }

    public LocalDate getTanggalLahir(){
        return this.tanggalLahir;
    }
    public void setTanggalLahir(LocalDate TanggalLahir){
        this.tanggalLahir = tanggalLahir;
    }

    public String getAngkatan(){
        return this.angkatan;
    }
    public void setAngkatan(String angkatan){
        this.angkatan = angkatan;
    }

     public String getKelas(){
        return this.kelas;
    }
    public void setKelas(String kelas){
        this.kelas = kelas;
    }

    @Override
    public String toString(){
        return String.format(
            "{nim: %s, nama: %s, tanggal lahir: %s, angatan: %s, kelas: %s}", nim, nama, tanggalLahir, angkatan, kelas
        );
}