/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package poly.edu.assignment1;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Assignment1 {
    public static void main(String[] args) {
        ThucHienChucNang chucNang = new ThucHienChucNang();
        Scanner Scanner = new Scanner(System.in);
        String z;
        System.out.println("=============================================");
        System.out.println("|                     menu                  \n|");
        System.out.println("| 1. Nhap danh sach nhan vien               \n|");
        System.out.println("| 2. Xuat danh sach sinh vien               \n|");
        System.out.println("| 3. Tim va hien thi nhan vien theo ma nhap \n|");
        System.out.println("| 4. Xoa nhan vien theo ma nhap             \n|");
        System.out.println("| 5. Cap nhap nhan vien theo ma nhap        \n|");
        System.out.println("| 6. Tim cac nhan vien theo khoang luong    \n|");
        System.out.println("| 7. Sap xep nhan vien theo ho va ten       \n|");
        System.out.println("| 8. Sap xep nhan vien theo thu nhap        \n|");
        System.out.println("| 9. Xuat 5 nhan vien co thu nhap cao nhat  \n|");
        System.out.println("| 10. Thoat                                 \n|");
        System.out.println("===============================================");
        do{    
            System.out.println("moi ban chon chuc nang :");
            z = Scanner.nextLine();
            switch (z){
                case "1" : 
                    chucNang.NhapDanhSach();
                    break;
                case "2" :
                    chucNang.XuatDanhSach();
                    break;
                case "3" :
                    chucNang.TimNhanVien();
                    break;
                case "4" :
                    chucNang.XoaNhanVien();
                    break;
                case "5" :
                    System.out.println("ban chon chuc nang so 5");
                    break;
                case "6" :
                    System.out.println("ban chon chuc nang so 6");
                    break;
                case "7" :
                    System.out.println("ban chon chuc nang so 7");
                    break;
                case "8" :
                    System.out.println("ban chon chuc nang so 8");
                    break;
                case "9" :
                    System.out.println("ban chon chuc nang so 9");
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
}
