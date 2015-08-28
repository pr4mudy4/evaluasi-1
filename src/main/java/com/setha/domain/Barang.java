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
    private String idBarang;
    private String nama;
    private BigDecimal harga;

    public BigDecimal getHarga() {
        return harga;
    }

    public void setHarga(BigDecimal harga) {
        this.harga = harga;
    }

    public String getIdBarang() {
        return idBarang;
    }

    public void setIdBarang(String idBarang) {
        this.idBarang = idBarang;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }


    
    
}
