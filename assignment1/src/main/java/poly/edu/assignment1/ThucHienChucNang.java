/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poly.edu.assignment1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class ThucHienChucNang {
    ArrayList<NhanVien> list = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    public void NhapDanhSach(){
        System.out.println("1.NVHC");
        System.out.println("2.NVT");
        System.out.println("3.TP");
       do{
           System.out.println("Moi ban chon:");
           int chon = sc.nextInt();
           switch(chon){
               case 1:
                   NhanVienHanhChinh nvhc = new NhanVienHanhChinh();
                   nvhc.nhap();
                   list.add(nvhc);
                   break;
               case 2:
                   TruongPhong tp = new TruongPhong();
                   tp.nhap();
                   list.add(tp);
                   break;
               case 3:
                   NhanVienTiep nvt = new NhanVienTiep();
                   nvt.nhap();
                   list.add(nvt);
                   break;          
           }
           if(chon==0){
                break;   
           }
       }while(true);
    }
    
    public void XuatDanhSach(){
        for(NhanVien nv : list){
            if(nv instanceof NhanVienHanhChinh){
                ((NhanVienHanhChinh)nv).xuat();
            }else if (nv instanceof TruongPhong){
                ((TruongPhong)nv).xuat();
            }else if (nv instanceof NhanVienTiep){
                ((NhanVienTiep)nv).xuat();
            }
        }
    }
    
    public void TimNhanVien(){
        sc.nextLine();
        System.out.println("Nhap ma sinh vien can tim : ");
        String ma = sc.nextLine();
        boolean flag = false;
        
        for(NhanVien nv : list){
            if(nv.getManv().equalsIgnoreCase(ma)){
                flag = true;
                if(nv instanceof NhanVienHanhChinh){
                    ((NhanVienHanhChinh)nv).xuat();
                }else if (nv instanceof TruongPhong){
                    ((TruongPhong)nv).xuat();
                }else if (nv instanceof NhanVienTiep){
                    ((NhanVienTiep)nv).xuat();
                }
                break;
            }
        }
        if(flag == false){
            System.out.println("ko tim thay nhan vien");
        }   
    }
    
        public void XoaNhanVien(){
        sc.nextLine();
        System.out.println("Nhap ma sinh vien can xoa : ");
        String ma = sc.nextLine();
        boolean flag = false;
        
        for(NhanVien nv : list){
            if(nv.getManv().equalsIgnoreCase(ma)){
                flag = true;
                list.remove(nv);
                break;
            }
        }
        if(flag == false){
            System.out.println("ko tim thay nhan vien");
        }   
    }
}
