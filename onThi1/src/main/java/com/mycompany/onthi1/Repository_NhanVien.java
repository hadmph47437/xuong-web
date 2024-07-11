
package com.mycompany.onthi1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class Repository_NhanVien {
    
    private ArrayList<Model_NhanVien> ds = new ArrayList<>();
    
    public void add(Model_NhanVien nv){
        this.ds.add(nv);
    }
    
    public ArrayList<Model_NhanVien> getDS(){
        return ds;
    }
    
    public void xoa(int viTri){
        this.ds.remove(viTri);
    }
    
    public void loadDatabase(){
        try{
            DatabaseConnectionManager dcm = new DatabaseConnectionManager("QuanLyTrungTamTinHoc_SOF2041", "sa", "123456");
            Connection con = dcm.getConnection();
            String sql = "select MaNV,HoTen,MatKhau,VaiTro from NhanVien";
            PreparedStatement pre = con.prepareStatement(sql);
            ResultSet rs = pre.executeQuery();
            
            while(rs.next()){
                String ma = rs.getString("MaNV");
                String hoTen = rs.getString("HoTen");
                String matKhau = rs.getString("MatKhau");
                int vaiTro = rs.getInt("VaiTro");
                
                Model_NhanVien nv = new Model_NhanVien(ma, hoTen, matKhau, vaiTro);
                this.ds.add(nv);
            }
            
        } catch (SQLException e){
            e.printStackTrace();
        }
    }
    
    
}
