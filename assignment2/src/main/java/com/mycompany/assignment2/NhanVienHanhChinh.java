/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment2;

/**
 *
 * @author DELLS
 */
public class NhanVienHanhChinh extends NhanVien {

    public NhanVienHanhChinh() {
    }

    public NhanVienHanhChinh(String manv, String tenv, double luongNV) {
        super(manv, tenv, luongNV);
    }

    
    @Override
    public   double getThuNhap(){
        return super.getluongNV();
    }
}
