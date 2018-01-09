package tdi.training.java.core.data.model;

import java.util.List;
import java.util.ArrayList;
import java.time.LocalDate;

public class DaftarMahasiswa{

    public static void main(String[] args){
        Mahasiswa mah = new Mahasiswa("10511148","Dimas", new BigDecimal(1000));
        System.out.println(mah.toString());

        List<Nasabah> list = new ArrayList<>();
        list.add(nabila);
        list.add(
            new Nasabah("002","Nabila2",new BigDecimal(2000))
        );
        list.add(
            new Nasabah("003","Nabila3",new BigDecimal(3000))
        );

        Nasabah indexKe2 = list.get(2);
        System.out.println("index ke 2 adalah "+indexKe2.toString());

        for(Nasabah n: list){
            System.out.println(n.toString());
        }
    }
}