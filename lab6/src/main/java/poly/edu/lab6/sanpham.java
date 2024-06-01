/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poly.edu.lab6;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class sanpham {
    private String tenSp;
    private double donGia;
    private String  hang;

    public String getTenSp() {
        return tenSp;
    }

    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public String getHang() {
        return hang;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }
    
    public void nhap(){
        Scanner sc = new Scanner(System.in);
         System.out.println("Nhap ten san Pham:");     
         tenSp = sc.nextLine();
         System.out.println("nhap don gia:");
         donGia = sc.nextDouble();
         sc.nextLine();
         System.out.println("Nhap hang");
         hang = sc.nextLine();
    }
    public void xuat(){
        System.out.println("------------------");
        System.out.println("Ten san pham :"+tenSp);
        System.out.println("don gia :"+donGia);
        System.out.println("hang : "+hang);
    }
}
