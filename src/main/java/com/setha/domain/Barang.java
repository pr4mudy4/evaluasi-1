/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.setha.domain;

import java.math.BigDecimal;

/**
 *
 * @author aviani
 */
public class Barang {
   
    private int idBarang;
    private String nama;
    private BigDecimal harga;
    private static int jumlahUser=0;

    public BigDecimal getHarga() {
        return harga;
    }

    public void setHarga(BigDecimal harga) {
        this.harga = harga;
    }

    public int getIdBarang() {
        return idBarang;
    }

    public void setIdBarang(int idBarang) {
        this.jumlahUser++;
        this.idBarang = this.jumlahUser;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    
    
}
