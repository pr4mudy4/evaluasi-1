/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.setha;

import com.setha.domain.User;

/**
 *
 * @author aviani
 */
public class Pertemuan74 {
    public static void main(String[] args) {
        //error code
//        Integer tes =a;
        User usr =null;
      try{
          System.out.println("apakah User berbulu? "+ usr.getNama());
      }catch(NullPointerException npe){
          System.out.println("null bos");
          
          //ketika menambahkan baris 28 akan terjadi array index out of bounds
          //cara menanganinya adalah pakai blok baris 31 - 35
          Integer[] angka = new Integer[3];
          angka[0] = 1;
          angka[1] = 2;
          angka[2] = 3;
          //angka[3] = 4;
          
          if(angka.length > 3){
              angka[3] = 4;
              angka[4] = 5;
          }else {
              System.out.println("panjang array hanya 3, jangan dilebihin");
          }
              System.out.println("angka ke 5 " + angka[2]);
      }          
    }
    
}
