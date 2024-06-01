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
public abstract class NhanVien {
    private String manv;
    private String tenv;
    private double luongNV;

    public NhanVien() {
    }

    public NhanVien(String manv, String tenv, double luongNV) {
        this.manv = manv;
        this.tenv = tenv;
        this.luongNV = luongNV;
    }

    public String getManv() {
        return manv;
    }

    public void setManv(String manv) {
        this.manv = manv;
    }

    public String getTenv() {
        return tenv;
    }

    public void setTenv(String tenv) {
        this.tenv = tenv;
    }

    public double getluongNV() {
        return luongNV;
    }

    public void setLuongCB(double luongNV) {
        this.luongNV = luongNV;
    }
    
    public void NhapTT(){
        Scanner s=new Scanner(System.in);
        System.err.println("Nhap ma nv:");
        manv= s.nextLine();
        System.err.println("Nhap ten nv:");
        tenv=s.nextLine();
        System.err.println("Nhap luong:");
        luongNV=s.nextDouble();
    }
    public void XuatTT(){
        System.err.println(manv+"-"+tenv+""+luongNV);
}
    public abstract double getThuNhap();
    public double getTHUETN(){
        double thue=0;
        if(getThuNhap()<9000000){
            thue=0;
        }else if(getThuNhap()>=9000000&&getThuNhap()<15000000){
            thue=getThuNhap()*0.1;
        }else if(getThuNhap()>15000000){
            thue=getThuNhap()*0.12;
        }
        return thue;
    }
    
      
}
