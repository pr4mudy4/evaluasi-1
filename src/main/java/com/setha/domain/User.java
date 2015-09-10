/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.setha.domain;

/**
 *
 * @author aviani
 */
public class User {
    private int idUser;
    private String nama;
    private String password;
    private static int jumlahUser = 0;

   
    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.jumlahUser++;
        this.idUser = this.jumlahUser;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    
    }
    
}
