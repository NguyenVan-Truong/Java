/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poly.edu.lab6;

import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class Danhsachsinhvien {
    private ArrayList<SinhVien> list = new ArrayList<>();
    
    public void nhap(){
        for (int i=0;i<2;i++){
            SinhVien sv = new SinhVien();
            sv.nhap();
            list.add(sv);    
        }
    }
    public void xuat(){
        System.out.println("-----------------------------------");
        System.out.println("Danh sach sinh vien");
        for (SinhVien item :list ){
            item.xuat();
        }
    }
}
