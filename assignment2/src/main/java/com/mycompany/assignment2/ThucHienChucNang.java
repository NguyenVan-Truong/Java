/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment2;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;


/**
 *
 * @author DELLS
 */
public class ThucHienChucNang {
    
        ArrayList<NhanVien> listNV= new ArrayList<>();
        Scanner s =new Scanner(System.in);
        
        public void Nhapdanhsach(){
            do{
                System.out.println("moi chon: 1.NVHC-2.TP-3.NVTT");
                int chon= s.nextInt();
                
                switch(chon){
                    case 1:
                        NhanVienHanhChinh nvhc= new NhanVienHanhChinh();
                        nvhc.NhapTT();
                        listNV.add(nvhc);
                        break;
                    case 2:
                        TruongPhong tp= new TruongPhong();
                        tp.NhapTT();
                        listNV.add(tp);
                        break;
                    case 3:
                        NhanVienTiepThi nvtt= new NhanVienTiepThi();
                        nvtt.NhapTT();
                        listNV.add(nvtt);
                        break;
                    case 0:
                        break;
                    
                }
                
            }while(true);
        }
        
    public void XuatDanhSach(){
        for(NhanVien nv : listNV){
            if(nv instanceof NhanVienHanhChinh){
                ((NhanVienHanhChinh)nv).XuatTT();
            } else if(nv instanceof TruongPhong){
                ((TruongPhong)nv).XuatTT();
        } else if(nv instanceof NhanVienTiepThi){
                ((NhanVienTiepThi)nv).XuatTT();
    }
        }
    }
    public void TimNhanVien(){
        
        System.err.println("\nNhap ma nhan vien can tim:");
        String ma=s.nextLine();
        boolean flag=false;
        for(NhanVien nv :listNV){
            if(nv.getManv().equalsIgnoreCase(ma)){
                flag=true;
                if(nv instanceof NhanVienHanhChinh){
                    ((NhanVienHanhChinh)nv).XuatTT();  
                }else if(nv instanceof TruongPhong){
                    ((TruongPhong)nv).XuatTT(); 
                    
                }else if(nv instanceof NhanVienTiepThi){
                    ((NhanVienTiepThi)nv).XuatTT(); 
                    
                } break;
            }
        }
        if(flag==false){
            System.out.println("Khong tim thay nhan vien");
        }
    }
    
    public void XoaNhanVien(){
        
        System.out.println("\nNhap ma nhan vien can xoa:");
        String ma=s.nextLine();
        boolean flag=false;
        for(NhanVien nv :listNV){
            if(nv.getManv().equalsIgnoreCase(ma)){
                flag=true;
                listNV.remove(nv);
                break;
            }
        
    }
        if(flag==false){
            System.out.println("Khong tim thay nhan vien");
        }
}
    
    public void CapNhatNhanVien(){
        
        System.err.println("Nhập ma nhan vien can tim:");
        String ma=s.nextLine();
        boolean flag=false;
        for(NhanVien nv :listNV){
            if(nv.getManv().equalsIgnoreCase(ma)){
                
                if(nv instanceof NhanVienHanhChinh){
                    ((NhanVienHanhChinh)nv).NhapTT();  
                }else if(nv instanceof TruongPhong){
                    ((TruongPhong)nv).NhapTT(); 
                    
                }else if(nv instanceof NhanVienTiepThi){
                    ((NhanVienTiepThi)nv).NhapTT(); 
                    
                } 
                flag= true;
                break;
            }
        }
        if(flag==false){
            System.out.println("Khong tim thay nhan vien");
        }
    }
    
    public void TimNhanVienTheoKhoangLuong(){
        double bd=0, kt=0;
        do{
        System.err.println("\nNhap khoang luong bat đau:");
         bd=s.nextDouble();
        System.err.println("Nhap khoang luong ket thuc");
         kt=s.nextDouble();
        
        if(bd>kt){
            System.err.println("Nhap lai");
        }else{
            break;
        }
        }while(true);
        boolean flag=false;
        for(NhanVien nv :listNV){
            if(nv.getThuNhap()>=bd&&nv.getThuNhap()<=kt){
                
                if(nv instanceof NhanVienHanhChinh){
                    ((NhanVienHanhChinh)nv).XuatTT();  
                }else if(nv instanceof TruongPhong){
                    ((TruongPhong)nv).XuatTT(); 
                    
                }else if(nv instanceof NhanVienTiepThi){
                    ((NhanVienTiepThi)nv).XuatTT(); 
                    
                }
                flag=true ;
                break;
            }
        }
        if(flag==false){
            System.out.println("Không tim thay nhan vien");
        }
    }
    
    
    public  void SapXepTheoTen(){
       Collections.sort(listNV, (nv1,nv2)->(int)(nv1.getTenv().compareTo(nv2.getTenv())));
          
      }
    public void SapXepTheoThuNhap(){
         Collections.sort(listNV, (nv1,nv2)->(int)(nv2.getThuNhap()-nv1.getThuNhap()));
}   
    public void Top5(){
         SapXepTheoThuNhap();
         for(int i=0;i<5;i++){
             listNV.get(i).XuatTT();
             if(listNV.get(i)instanceof NhanVienHanhChinh){
                 ((NhanVienHanhChinh)listNV.get(i)).XuatTT();
             }else if(listNV.get(i)instanceof TruongPhong){
                 ((TruongPhong)listNV.get(i)).XuatTT();
         }else if(listNV.get(i)instanceof NhanVienTiepThi){
                 ((NhanVienTiepThi)listNV.get(i)).XuatTT();
}
         }
    }
}


