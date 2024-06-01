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
public class NhanVienTiepThi extends NhanVien {
    private double doanhSo;
    private double hoaHong;

    public NhanVienTiepThi() {
    }

    public NhanVienTiepThi(double doanhSo, double luongNV, String manv, String tenv, double hoaHong) {
        super(manv, tenv, luongNV);
        this.doanhSo= doanhSo;
        this.hoaHong= hoaHong; 
    }

    public double getdoanhSo() {
        return doanhSo;
    }

    public void setdoanhSo(double doanhSo) {
        this.doanhSo = doanhSo;
    }

    public double getHoaHong() {
        return hoaHong;
    }

    public void setHoaHong(double hoaHong) {
        this.hoaHong = hoaHong;
    }
    
    public void NhapTT(){
    super.NhapTT();
    Scanner s = new Scanner(System.in);
    System.out.println("Nhap doanhSo: ");
    doanhSo= s.nextDouble();
        System.err.println("Nhap hoa hong: ");
        hoaHong=s.nextDouble();
}
    public void XuatTT(){
    super.XuatTT();
        System.out.println("LKD:"+doanhSo+"-"+hoaHong);
}
    
    
    
    @Override
    public double getThuNhap(){
        return super.getluongNV()+doanhSo*hoaHong/100;
    }
}
