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
public class TruongPhong extends NhanVien{
    private double luongTN;

    TruongPhong() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public void TruongPhong(){
    }

    public TruongPhong(double luongTN, String manv, String tenv, double luongCB) {
        super(manv, tenv, luongCB);
        this.luongTN = luongTN;
    }

    public double getLuongTN() {
        return luongTN;
    }

    public void setLuongTN(double luongTN) {
        this.luongTN = luongTN;
    }

    @Override
    public void nhap() {
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.println(" Nhap Luong Trch nhiem:");
        luongTN = sc.nextDouble();
    }

    @Override
    public void xuat() {
        super.xuat(); 
        System.out.println("- LuongTN :" + luongTN);
    }
    
    
    
            
            
            
    @Override
    public double getThuNhap() {
        return super.getLuongCB() + luongTN;
    }
    
}
