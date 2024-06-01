/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poly.edu.lab7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class DanhSachSinhVIen {
    ArrayList<bai2> list = new ArrayList<>();
    public void nhap(){
        do{
            Scanner sc = new Scanner(System.in);
            System.out.println("nhap ho ten sinh vien");
            String hoTen = sc.nextLine();
            if(hoTen == null || hoTen.equals("")){
                break;
            }
            System.out.print("Nhap ten nganh:");
            String nganh = sc.nextLine();
            if(nganh.equalsIgnoreCase("IT")){
                System.out.print("Diem Java :");
                double diemJava = sc.nextDouble();
                System.out.print("Diem css :");
                double diemCss= sc.nextDouble();
                System.out.print("Diem html :");
                double diemHtml = sc.nextDouble();
                bai2 newSV = new SinhVienIT(diemJava, diemCss, diemHtml, hoTen, nganh);
                list.add(newSV);
            }else if(nganh.equalsIgnoreCase("Biz")){
                System.out.print("Diem Marketting :");
                double diemMarketting = sc.nextDouble();
                System.out.print("Diem Sale :");
                double diemSales= sc.nextDouble();
                bai2 newSV = new SinhVienBiz(diemMarketting, diemSales, hoTen, nganh);
                list.add(newSV);
            }
        }while(true);
    }
    public void xuat(){
        for(bai2 sv : list){
            System.out.printf("ho ten : %s | nganh : %s | diem Tb:%.2f | hoc luc: %s\n",sv.getHoTen(),sv.getNganh(),sv.getDiem(),sv.getHocLuc());
        }
                
    }
 //-----------------------------------------------------------------------------------------------------------   
    public void xuatgioi(){
        for(bai2 sv : list){
            if(sv.getHocLuc().equalsIgnoreCase("gioi")){
                System.out.printf("ho ten : %s | nganh : %s | diem Tb:%.2f | hoc luc: %s\n",sv.getHoTen(),sv.getNganh(),sv.getDiem(),sv.getHocLuc());
            }
        }
    }
 //------------------------------------------------------------------------------------------------  
    Comparator<bai2> comp = new Comparator<bai2>() {
        @Override
        public int compare(bai2 o1, bai2 o2) {
            return Double.compare(o1.getDiem(),o2.getDiem());
    }
    };
        
    public void sapxeptheodiem(){
        Collections.sort(list,comp);
        System.out.println("Sap xep theo diem tang dan");
        xuat();
    }

//--------------------------------------------------------------------------------------    
    public void menu(){
    Scanner sc = new Scanner(System.in);
    int chon;
        System.out.println("Menu chuong trinh");
        System.out.println("1.nhap danh sach sinh vien");
        System.out.println("2.xuat thong tin danh sach sinh vien");
        System.out.println("3.xuat danh sach sinh vien co hoc luc gioi");
        System.out.println("4.sap xep danh sach sinh theo diem");
        System.out.println("0.thoat");
    do{
        System.out.println("Moi ban cho chuc nang");
        chon=sc.nextInt();
        if(chon!=0){
            switch(chon){
                case 0:
                    break;
                case 1:
                    nhap();
                    break;
                case 2:
                    xuat();
                    break;
                case 3:
                    xuatgioi();
                    break;
                case 4:
                    sapxeptheodiem();
                    break;
                default:
                    System.out.println("moi ban nhap lai");
                    break;
            }
        }
    }while(true);
}
    }    
 

     