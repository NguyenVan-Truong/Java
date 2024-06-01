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
public class NhanVienTiep extends NhanVien{
    private double luongKD;
    private double hoaHong;
    
    public NhanVienTiep(){
    }

    public NhanVienTiep(double luongKD, double hoaHong, String manv, String tenv, double luongCB) {
        super(manv, tenv, luongCB);
        this.luongKD = luongKD;
        this.hoaHong = hoaHong;
    }



    public double getLuongKD() {
        return luongKD;
    }

    public void setLuongKD(double luongKD) {
        this.luongKD = luongKD;
    }

    public double getHoaHong() {
        return hoaHong;
    }

    public void setHoaHong(double hoaHong) {
        this.hoaHong = hoaHong;
    }
    
    
    public void nhap(){
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap Luong Kinh Doanh:");
        luongKD = sc.nextDouble();
        System.out.println("nhap hoa hong");
        hoaHong = sc.nextDouble();
    } 
    
    public void xuat(){
        super.xuat();
        System.out.println("- Luongkd: " +  luongKD + " - " + hoaHong);
    }
    
    @Override
    public double getThuNhap() {
        return super.getLuongCB() + luongKD + hoaHong;
    }
    
}
