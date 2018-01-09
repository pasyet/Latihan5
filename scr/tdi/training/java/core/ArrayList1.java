package tdi.training.java.core;

import java.util.List;
import java.util.ArrayList;

public class ArrayList1{

    public static void main(String[] arg){
        
        List list = new ArrayList();
        list.add(1);
        list.add(3);
        list.add(5);
        list.add(10);
        list.add(1);
        list.add(20);
        list.add(10);
        list.add(1);
        list.add(20);
        list.add(9);
        list.add(1);
         
        System.out.print("index ke 0 adalah "+list.get(0)+", index ke 1 adalah "+list.get(1)+", index ke 3 adalah "+list.get(3));
    }
}