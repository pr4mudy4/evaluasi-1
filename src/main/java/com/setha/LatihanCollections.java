/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.setha;

import com.setha.domain.User;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author aviani
 */
public class LatihanCollections {

    public static void main(String[] args) {
        List lst = new ArrayList();

        lst.add("coba");
        lst.add(1); //harga
        lst.add(true);
        lst.add(2); //qty

        for (int i = 0; i < lst.size(); i++) {
            System.out.println("Data ke " + i + " = " + lst.get(i));
        }
        List<String> lstStr = new ArrayList<String>();
        lstStr.add("str1");
        lstStr.add("str2");
        for (String dtStr : lstStr) {
            System.out.println("Data lstStr " + dtStr);
        }
        List<Integer> lstInt = new ArrayList<Integer>();
        lstInt.add(1);
        lstInt.add(7);
        lstInt.add(3);
        lstInt.add(4);
        lstInt.add(2);
        lstInt.add(6);
        lstInt.add(5);
        Collections.sort(lstInt);
        System.out.println("---------------------------------------------");
        for (Integer dtInt : lstInt) {
            System.out.println("Data Int " + dtInt);
        }
        Integer cek = 2;
        System.out.println("Apakah  " + cek + " ada di dilist ? " + lstInt.contains(cek));

        List<User> users = new ArrayList<User>();
        User user = new User();
        user.setNama("joko");
        users.add(user);
        
        user =new User();
        user.setNama("joni");
        users.add(user);

        for (User u : users){
            System.out.println("Nama user = " + u.getNama());
        }
        user = new User();
        user.setNama("yayuk");
        System.out.println("Apakah User " + user.getNama() + " ada ? "+ users.contains(user));
      
        Map mp = new HashMap();
        mp.put("key1", "value1");
        mp.put("key2", "value2");
        
        System.out.println("Isi Map " + mp.size());
        System.out.println("Ambil Nilai dari key1 = " + mp.get("key1"));
        
        for (Iterator it = mp.entrySet().iterator(); it.hasNext();){
            Map.Entry dtMap = (Map.Entry) it.next();
            System.out.println("Key = " + dtMap.getKey() + " value " + dtMap.getValue());
         System.out.println(" apakah key 3 ada ? " + mp.containsKey("key3"));
        }
        Set<Integer> setInt = new HashSet<Integer>();
        setInt.add(1);
        setInt.add(2);
        setInt.add(3);
        for (Integer dtSetInt : setInt) {
            System.out.println("dtSetInt " + dtSetInt);
        
        Set<User> setUsers = new HashSet<User>();
        User setUser = new User();
        setUser.setNama("setha");
        setUsers.add(setUser);
  
        setUser = new User();
        setUser.setNama("setha");
        setUsers.add(setUser);
        
        setUser = new User();
        setUser.setNama("sakti");
        setUsers.add(setUser);
        
        for(User u :setUsers){
            System.out.println("nama user = " + u.getNama());
        }
           }
    }
}