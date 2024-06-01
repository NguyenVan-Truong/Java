/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poly.edu.assignment1;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public abstract class NhanVien {
    private String manv;
    private String tenv;
    private double luongCB;
    
    public NhanVien(){   
    }

    public NhanVien(String manv, String tenv, double luongCB) {
        this.manv = manv;
        this.tenv = tenv;
        this.luongCB = luongCB;
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

    public double getLuongCB() {
        return luongCB;
    }

    public void setLuongCB(double luongCB) {
        this.luongCB = luongCB;
    }
    
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma nhan vien :");
        manv = sc.nextLine();
        System.out.println("Nhap ten nhan vien :");
        tenv = sc.nextLine();
        System.out.println("Nhap luong nhan vien :");
        luongCB = sc.nextDouble();   
    }
    public void xuat(){
        System.out.print(manv + " - " + tenv + " - " +luongCB );
    }
    public abstract double getThuNhap();
    public double getThueTN(){
        double  thue = 0;
        if(getThuNhap() < 9000000){
            thue = 0;
        }else if (getThuNhap() >= 9000000 && getThuNhap() < 15000000){
            thue = getThuNhap() * 0.1;
        }else if (getThuNhap() >=15000000 ){
            thue = getThuNhap() *0.12;
        }
        return thue;
    }
        
}
