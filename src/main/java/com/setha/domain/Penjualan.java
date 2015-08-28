/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.setha.domain;

import java.util.Date;

/**
 *
 * @author aviani
 */
public class Penjualan {
    private String idBarang;
    private String nama;
    private Integer jumlah;
    private Date tglTransaksi;

    public String getIdBarang() {
        return idBarang;
    }

    public void setIdBarang(String idBarang) {
        this.idBarang = idBarang;
    }

    public Integer getJumlah() {
        return jumlah;
    }

    public void setJumlah(Integer jumlah) {
        this.jumlah = jumlah;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Date getTglTransaksi() {
        return tglTransaksi;
    }

    public void setTglTransaksi(Date tglTransaksi) {
        this.tglTransaksi = tglTransaksi;
    }
    
}
