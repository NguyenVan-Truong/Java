/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poly.edu.lab4;

import java.util.Scanner;

/**
 * 
 * @author ASUS
 */
public class SanPham {
    public String ten;//khai bao thuoc tinh ten
    public double gia;
    public double giamGia;
    private String tinhThueNhapKhau;

    public double tinhThueNhapKhau(){
        double tnk = gia * 0.1;
        return tnk;
    }
    public void xuat (){
        System.out.println("Thong tin san pham");
        System.out.println("Ten san pham :"+ten);
        System.out.println("Gia san pham :"+gia);
        System.out.println("Giam gia san pham : "+giamGia);
        System.out.println("THue nhap khau :"+tinhThueNhapKhau());
    }
    public void nhap (){
        System.out.println("\nmoi ban nhap thong tin san pham: ten; gia ; giam gia; thue " );
        Scanner sc = new Scanner(System.in);
        ten = sc.nextLine();
        gia = Double.parseDouble(sc.nextLine());
        giamGia = Double.parseDouble(sc.nextLine());
        
    }
}