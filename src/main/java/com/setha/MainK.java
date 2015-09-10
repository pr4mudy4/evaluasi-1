/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.setha;

import com.setha.domain.Barang;
import com.setha.domain.Penjualan;
import com.setha.domain.User;
import com.setha.service.Implement;
import com.setha.service.Interface;
import java.io.IOException;



/**
 *
 * @author aviani
 */
public class MainK {
    public static void main(String[] args) throws IOException {
 
            Implement service = new Interface();
            User u = new User();
            service.save(u);
            service.update(u);
            service.delete(u);
            service.selectUser();
            
            
            System.out.println("******************************");
            Barang b = new Barang();
            service.save(b);
            service.update(b);
            service.delete(b);
            service.selectBarang();
            
            System.out.println("******************************");  
            Penjualan p = new Penjualan();
            service.save(p);
            service.update(p);
            service.delete(p);
            service.selectPenjualan();
            
            System.out.println("******************************");
            service.convertUser(u);
            System.out.println("******************************");
            service.convertBarang(b);
            System.out.println("******************************");
            service.convertPenjualan(p);
                      
       
}
    }
