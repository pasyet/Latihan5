package tdi.training.java.core.data.model;

import java.util.List;
import java.util.ArrayList;
import java.time.LocalDate;

public class MainAplikasi{

    public static void main(String[] args){
        Kelas IF = new Kelas("IF",11,"Informatika       ");
        Kelas SI = new Kelas("SI",11,"Sistem Informasi");
        List<Mahasiswa> daftarMahasiswa = new ArrayList<>();
        daftarMahasiswa.add(new Mahasiswa(
            "10511148",
            "Dimas Maryanto",
            LocalDate.of(1993,3,11),
            2014,
            IF
        ));

        daftarMahasiswa.add(new Mahasiswa(
            "10511158",
            "Muhamad Yusuf",
            LocalDate.of(1994,1,20),
            2014,
            SI
        ));

        daftarMahasiswa.add(new Mahasiswa(
            "10511170",
            "Adib            ",
            LocalDate.of(1995,2,12),
            2014,
            IF
        ));

        daftarMahasiswa.add(new Mahasiswa(
            "10511160",
            "Hari Sapto Adi",
            LocalDate.of(1991,3,15),
            2014,
            SI
        ));

        daftarMahasiswa.add(new Mahasiswa(
            "10511110",
            "Hariaty        ",
            LocalDate.of(1992,4,16),
            2014,
            IF
        ));

        daftarMahasiswa.forEach((m)->{
            System.out.println(m.toString());
        });

    }
}