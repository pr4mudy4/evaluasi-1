/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.setha.domain;

import java.sql.Date;



/**
 *
 * @author aviani
 */
public class Penjualan {
    private int idBarang;
    private String nama;
    private int jumlah;
    private Date tglTransaksi;
    public static int jumlahUser=0;

    public int getIdBarang() {
        return idBarang;
    }

    public void setIdBarang(int idBarang) {
        this.jumlahUser++;
        this.idBarang = this.jumlahUser;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
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
