/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.setha.service;

import com.setha.domain.Barang;
import com.setha.domain.Penjualan;
import com.setha.domain.User;
import java.io.IOException;
import java.util.List;
/**
 *
 * @author aviani
 */

public interface Implement {
    public void save(Barang r);
    public void update(Barang r);
    public void delete(Barang r);
    public List<Barang> selectBarang();
    
    public void save(User s);
    public void update(User s);
    public void delete(User s);
    public List<User> selectUser();
    
    public void save(Penjualan t);
    public void update(Penjualan t);
    public void delete(Penjualan t);
    public List<Penjualan> selectPenjualan();
    
    public void koneksi(String sql);
    public void koneksi2(String sql);
    
    public void convertUser (User s);
    public void convertBarang (Barang r);
    public void convertPenjualan (Penjualan t);
}
