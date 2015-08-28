/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.setha.service;

import com.setha.domain.Barang;
import com.setha.domain.Penjualan;
import com.setha.domain.User;
import java.util.List;

/**
 *
 * @author aviani
 */
public class Interface 
    implements Implement {
    
    @Override
    public void save(Barang r){
            System.out.println("save barang");
    }

    public void update(Barang r) {
        System.out.println("update barang");
    }

    public void delete(Barang r) {
        System.out.println("delete barang");
    }

    public List<Barang> selectBarang() {
        System.out.println("select barang");
        return null;
    }

    public void save(User s) {
        System.out.println("save user");
    }

    public void update(User s) {
        System.out.println("update user");
    }

    public void delete(User s) {
        System.out.println("delete user");
    }

    public List<User> selectUser() {
        System.out.println("select user");
        return null;
    }

    public void save(Penjualan t) {
        System.out.println("save penjualan");
    }

    public void update(Penjualan t) {
        System.out.println("update penjualan");
    }

    public void delete(Penjualan t) {
        System.out.println("delete penjualan");
    }

    public List<Penjualan> selectPenjualan() {
        System.out.println("select penjualan");
    return null;
    
    }

}