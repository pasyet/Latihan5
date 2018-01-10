package tdi.training.java.core;

import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;

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
         
        System.out.print(
            "index ke 0 adalah "+list.get(0)+", index ke 1 adalah "+list.get(1)+", index ke 3 adalah "+list.get(3)+'\n');
        
        System.out.println("=======================");
        
        Set arrlist = new HashSet();
        arrlist.add(1);
        arrlist.add(3);
        arrlist.add(5);
        arrlist.add(9);

        for (Object obj:arrlist){
            System.out.println(obj);
        }


        


        
   
        

    }
}