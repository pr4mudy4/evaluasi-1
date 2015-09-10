/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.setha.service;

import com.setha.domain.Barang;
import com.setha.domain.Penjualan;
import com.setha.domain.User;


import java.io.BufferedWriter;

import java.io.File;

import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author aviani
 */
public class Interface
        implements Implement {

    @Override
    public void save(Barang r) {
       String sql ="INSERT INTO `barang` "
                + "(`idBarang`, `nama`, `harga`) "
                + "VALUES (NULL, 'sabun mandi', '5000'), "
                + "(NULL, 'pewangi pakaian', '10000'),(NULL, 'pasta gigi','7000'),"
               + " (NULL, 'tusuk gigi','1500')";
        this.koneksi(sql);
        System.out.println("save data barang");
    }

    public void update(Barang r) {
        String sql = "UPDATE `barang` SET `nama` "
                + "= 'pelembut baju' WHERE idBarang = '2' ";
        this.koneksi(sql);
        System.out.println("update nama barang");
    }

    public void delete(Barang r) {
        String sql ="DELETE FROM `barang` WHERE `idBarang` = '3'";
        this.koneksi(sql);
        System.out.println("delete data barang");
    }

    public List<Barang> selectBarang() {
        String sql = ("select * from barang");
        this.koneksi4(sql);
            return null;
    }

    public void save(User s) {
        String sql ="INSERT INTO `user` "
                + "(`idUser`, `nama`, `password`) "
                + "VALUES (NULL, 'setha', 'avracadavra'), "
                + "(NULL, 'aviani', 'gokil666'),(NULL, 'yayuk','123')";
        this.koneksi(sql);
        System.out.println("save data user");
    }

    public void update(User s) {
        String sql = "UPDATE `user` SET `password` "
                + "= 'alohomora' WHERE idUser = '1' ";
        this.koneksi(sql);
        System.out.println("update password user");
    }

    public void delete(User s) {
        String sql ="DELETE FROM `user` WHERE `idUser` = '3'";
        this.koneksi(sql);
        System.out.println("delete data user");
    }

    public List<User> selectUser() {  
        String sql = ("select * from user");
        this.koneksi2(sql);
            return null;
    }

    public void save(Penjualan t) {
        String sql="INSERT INTO `penjualan` "
                + "(`idBarang`, `nama`, `jumlah`, `tglTransaksi`)"
                + " VALUES (NULL, 'sabun mandi', '10', '2015-09-09'),"
                + " (NULL, 'pewangi pakaian', '12', '2015-09-09'),"
                + "(NULL, 'pasta gigi','40','2015-09-09'),"
                + "(NULL, 'Tusuk Gigi','50','2015-09-09')";
           this.koneksi(sql);
        System.out.println("save data penjualan");
    }

    public void update(Penjualan t) {
        String sql = "UPDATE `penjualan` SET `nama` "
                + "= 'pelembut baju' WHERE idBarang = '2' ";
        this.koneksi(sql);
        System.out.println("update nama barang penjualan");
    }

    public void delete(Penjualan t) {
         String sql ="DELETE FROM `penjualan` WHERE `idBarang` = '3'";
        this.koneksi(sql);
        System.out.println("delete data penjualan");
    }

    public List<Penjualan> selectPenjualan() {
        String sql = ("select * from penjualan");
        this.koneksi3(sql);
            return null;
    }

    public void koneksi(String sql) {
        Connection conn = null;
        Statement statement = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            try {
                conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/evaluasi", "root", "1200t");
                
                statement = conn.createStatement();
                statement.executeUpdate(sql);
                System.out.println("sukes konek ke mysql");
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } finally {
            try {
                statement.close();
                conn.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }}
     public void koneksi2(String sql) {
        Connection conn = null;
        Statement statement = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            try {
                conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/evaluasi", "root", "1200t");
                statement = conn.createStatement();
                statement.executeQuery(sql);
                System.out.println("sukes konek ke mysql");
                    System.out.println("ambil data dari table");
                    ResultSet rsUser = statement.executeQuery("select * from user");
                    while (rsUser.next()){
                        
                        System.out.println(rsUser.getString(1)+"|"+rsUser.getString(2)+"|"+rsUser.getString(3));
                    }

                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            } finally {
                try {
                    statement.closeOnCompletion();
                    conn.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }}
        
        public void koneksi3(String sql) {
        Connection conn = null;
        Statement statement = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            try {
                conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/evaluasi", "root", "1200t");
                statement = conn.createStatement();
                statement.executeQuery(sql);
                System.out.println("sukes konek ke mysql");
                    System.out.println("ambil data dari table");
                    ResultSet rsPenjualan = statement.executeQuery("select * from penjualan");
                    while (rsPenjualan.next()){
                        
                        System.out.println(rsPenjualan.getString(1)+"|"+rsPenjualan.getString(2)+"|"+rsPenjualan.getString(3)+"|"+rsPenjualan.getString(4));
                    }

                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            } finally {
                try {
                    statement.closeOnCompletion();
                    conn.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }}

public void koneksi4(String sql) {
        Connection conn = null;
        Statement statement = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            try {
                conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/evaluasi", "root", "1200t");
                statement = conn.createStatement();
                statement.executeQuery(sql);
                System.out.println("sukes konek ke mysql");
                    System.out.println("ambil data dari table");
                    ResultSet rsBarang = statement.executeQuery("select * from barang");
                    while (rsBarang.next()){
                        
                        System.out.println(rsBarang.getString(1)+"|"+rsBarang.getString(2)+"|"+rsBarang.getString(3));
                    }

                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            } finally {
                try {
                    statement.closeOnCompletion();
                    //conn.commit();
                    conn.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
       }
}
    
    public void convertUser (User s) {
        Connection conn = null;
        Statement statement = null;
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            {
                FileWriter fstream = null;
                
                try {
                    conn = DriverManager.getConnection(
                            "jdbc:mysql://localhost:3306/evaluasi", "root", "1200t");
                    
                    ResultSet rs;
                    String file = ("/home/aviani/selectUser.txt");
                    String query="select * from user";
                    statement = conn.createStatement();
                    rs = statement.executeQuery(query);
                    FileWriter out = new FileWriter(file);
                    while (rs.next()) {
                        System.out.println("data user telah tersimpan pada file .txt");
                        System.out.println(rs.getString(1)+"|"+rs.getString(2)+"|"+rs.getString(3));
                        out.append(rs.getString(1));
                        out.append(",");
                        out.append(rs.getString(2));
                        out.append(",");
                        out.append(rs.getString(3));
                        out.append("\n");      
                    }
                        out.flush();
                        out.close();
            
                } catch (IOException ex) {
                     System.out.println("lihat exception!");
                        System.out.println(ex.getMessage());
                }catch (SQLException ex) {
                       ex.printStackTrace();
                   } finally {
                }
               }
                 } catch (ClassNotFoundException ex) {
                try {
                statement.closeOnCompletion();
                conn.close();
                ex.printStackTrace();
                  } catch (SQLException ex1) {
                ex1.printStackTrace();
            }
        }}

    public void convertBarang(Barang r) {
        Connection conn = null;
        Statement statement = null;
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            {
                FileWriter fstream = null;
                
                try {
                    conn = DriverManager.getConnection(
                            "jdbc:mysql://localhost:3306/evaluasi", "root", "1200t");
                    
                    ResultSet rs;
                    String file = ("/home/aviani/selectBarang.txt");
                    String query="select * from barang";
                    statement = conn.createStatement();
                    rs = statement.executeQuery(query);
                    FileWriter out = new FileWriter(file);
                    while (rs.next()) {
                        System.out.println("data Barang telah tersimpan pada file .txt");
                        System.out.println(rs.getString(1)+"|"+rs.getString(2)+"|"+rs.getString(3));
                        out.append(rs.getString(1));
                        out.append(",");
                        out.append(rs.getString(2));
                        out.append(",");
                        out.append(rs.getString(3));
                        out.append("\n");      
                    }
                        out.flush();
                        out.close();
            
                } catch (IOException ex) {
                     System.out.println("lihat exception!");
                        System.out.println(ex.getMessage());
                }catch (SQLException ex) {
                       ex.printStackTrace();
                   } finally {
                }
               }
                 } catch (ClassNotFoundException ex) {
                try {
                statement.closeOnCompletion();
                conn.close();
                ex.printStackTrace();
                  } catch (SQLException ex1) {
                ex1.printStackTrace();
            }
    }
}

    public void convertPenjualan(Penjualan t) {
        Connection conn = null;
        Statement statement = null;
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            {
                FileWriter fstream = null;
                
                try {
                    conn = DriverManager.getConnection(
                            "jdbc:mysql://localhost:3306/evaluasi", "root", "1200t");
                    
                    ResultSet rs;
                    String file = ("/home/aviani/selectPenjualan.txt");
                    String query="select * from penjualan";
                    statement = conn.createStatement();
                    rs = statement.executeQuery(query);
                    FileWriter out = new FileWriter(file);
                    while (rs.next()) {
                        System.out.println("data Penjualan telah tersimpan pada file .txt");
                        System.out.println(rs.getString(1)+"|"+rs.getString(2)+"|"+rs.getString(3)+"|"+rs.getString(4));
                        out.append(rs.getString(1));
                        out.append(",");
                        out.append(rs.getString(2));
                        out.append(",");
                        out.append(rs.getString(3));
                        out.append(",");
                        out.append(rs.getString(4));
                        out.append("\n");      
                    }
                        out.flush();
                        out.close();
            
                } catch (IOException ex) {
                     System.out.println("lihat exception!");
                        System.out.println(ex.getMessage());
                }catch (SQLException ex) {
                       ex.printStackTrace();
                   } finally {
                }
               }
                 } catch (ClassNotFoundException ex) {
                try {
                statement.closeOnCompletion();
                conn.close();
                ex.printStackTrace();
                  } catch (SQLException ex1) {
                ex1.printStackTrace();
            }
    }
  }}


        