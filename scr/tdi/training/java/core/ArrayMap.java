package tdi.training.java.core;

import java.util.Map;
import java.util.HashMap;

public class ArrayMap{

    public static void main(String[] args){
        
        Map berkas = new HashMap();
        berkas.put("001","Muhamad Yusuf");
        berkas.put("002","Dimas Maryanto");
        berkas.put("003","Hari Sapto Adi");
        berkas.put("004","Putri Harahap");
        berkas.put("005","Dewa Nyoman Santosa");
        berkas.put("006","Hariaty");
        berkas.put("010","Karina Virgi");

        System.out.println(String.format(
                "nama saya %s, nipnya 010", berkas.get("010")
            ));

        berkas.forEach((kunci,nilai)->{
            System.out.println(String.format(
                "nama saya %s, nipnya %s", nilai,kunci
            ));
        });
    }
}