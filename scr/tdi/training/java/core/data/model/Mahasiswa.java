package tdi.training.java.core.data.model;

import java.time.LocalDate;

public class Mahasiswa{
    
    private String nim, nama;
    private LocalDate tanggalLahir;
    private Integer angkatan;
    private Kelas kelas;

    public Mahasiswa(String nama, String nim, LocalDate tanggalLahir, Integer angkatan, Kelas kelas){
        this.nama = nama;
        this.nim = nim;
        this.tanggalLahir = tanggalLahir;
        this.angkatan = angkatan;
        this.kelas = kelas;
    }

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

    public Integer getAngkatan(){
        return this.angkatan;
    }
    public void setAngkatan(Integer angkatan){
        this.angkatan = angkatan;
    }

    public Kelas getKelas(){
        return this.kelas;
    }
    public void setKelas(Kelas kelas){
        this.kelas = kelas;
    }

    @Override
    public String toString(){
        return String.format(
            "| %s \t| %s \t| %s \t| %s \t| %s \t| %s \t|", 
            this.nim, 
            this.nama, 
            this.tanggalLahir,
            this.angkatan, 
            this.kelas.getNama(),
            this.kelas.getJurusan()
        );
    }

}