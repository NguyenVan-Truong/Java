/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment2;

/**
 *
 * @author DELLS
 */


import java.util.Scanner;


public class Assignment2 extends ThucHienChucNang {
    
    
    
  public void menu() {
        Scanner Scanner = new Scanner(System.in);
        String z;
        System.out.println("=============================================");
        System.out.println("|                     menu                  |");
        System.out.println("| 1. Nhap danh sach nhan vien               |");
        System.out.println("| 2. Xuat danh sach sinh vien               |");
        System.out.println("| 3. Tim va hien thi nhan vien theo ma nhap |");
        System.out.println("| 4. Xoa nhan vien theo ma nhap             |");
        System.out.println("| 5. Cap nhap nhan vien theo ma nhap        |");
        System.out.println("| 6. Tim cac nhan vien theo khoang luong    |");
        System.out.println("| 7. Sap xep nhan vien theo ho va ten       |");
        System.out.println("| 8. Sap xep nhan vien theo thu nhap        |");
        System.out.println("| 9. Xuat 5 nhan vien co thu nhap cao nhat  |");
        System.out.println("| 10. Thoat                                 |");
        System.out.println("=============================================");
        do{    
            System.out.println("moi ban chon chuc nang :");
            z = Scanner.nextLine();
            switch (z){
                case "1" : 
                    Nhapdanhsach();
                break;
                case "2" :
                    XuatDanhSach();
                    break;
                case "3" :
                    TimNhanVien();
                    break;
                case "4" :
                    XoaNhanVien();
                    break;
                case "5" :
                    CapNhatNhanVien();
                    break;
                case "6" :
                    TimNhanVienTheoKhoangLuong();
                    break;
                case "7" :
                    SapXepTheoTen();
                    break;
                case "8" :
                    SapXepTheoThuNhap();
                    break;
                case "9" :
                    Top5();
                    break;
                case "10" :
                    System.out.println("Thoat ");
                    break;
                default :
                    System.out.println("khong ton tai dap an");
                    break;
            }
        }while (true);
    }
  public static void main(String[] args) {
        Assignment2 sc=new Assignment2();
        sc.menu();
    }
}
