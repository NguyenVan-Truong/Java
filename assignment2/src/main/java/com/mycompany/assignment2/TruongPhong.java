/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment2;
import java.util.Scanner;
/**
 *
 * @author DELLS
 */
public class TruongPhong extends NhanVien {
    private double luongTrachNhiem;

    public TruongPhong() {
        
    }

    public TruongPhong(String manv, String tenv, double luongNV, double luongTrachNhiem) {
        super(manv, tenv, luongNV);
        this.luongTrachNhiem=luongTrachNhiem;
    }

    public double getLuongTN() {
        return luongTrachNhiem;
    }

    public void setLuongTN(double luongTN) {
        this.luongTrachNhiem = luongTN;
    }

    @Override
    public void NhapTT() {
        super.NhapTT(); 
        Scanner s=new Scanner(System.in);
        System.out.println("nhập lương trách nhiệm:");
        luongTrachNhiem=s.nextDouble();
    }

    @Override
    public void XuatTT() {
        super.XuatTT(); 
        System.out.println("luongTN"+luongTrachNhiem);
        
    }
    
    
    @Override
    public double getThuNhap(){
        return super.getluongNV()+luongTrachNhiem;
    }
    
}
