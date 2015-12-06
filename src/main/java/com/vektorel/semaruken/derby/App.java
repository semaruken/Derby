package com.vektorel.semaruken.derby;

import com.vektorel.semaruken.derby.entity.Skart;
import com.vektorel.semaruken.derby.service.SkartService;
import java.util.Date;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        SkartService skartservice = new SkartService();
        Skart skart = new Skart();
        skart.setTanim("bilgisayar");
        skart.setKod("bg12335212525");
        skart.setBarkod(Long.MIN_VALUE);
        skart.setBirimFiyat(Long.MIN_VALUE);
        skart.setGelisTarihi(new Date(1, 1, 1995));
        skartservice.save(skart);

        List<Skart> l= skartservice.getAll();
         for (int i = 0; i< l.size() ; i++) {
             System.out.println(l.get(i).toString());
             
            
         }
         System.out.println("Kaydedildi");
    }
}
