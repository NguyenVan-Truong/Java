/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poly.edu.lab5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class danhsachhoten {
    private ArrayList<String> ds = new ArrayList<>();
    public void nhap(){
        ds.clear();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap danh sach ho ten");
        while(true){
            System.out.println("Nhap ho ten");
            String ten = sc.nextLine();
            if (ten.isEmpty()){
                System.out.println("nhap du lieu thanh cong");
                break;
            }
            ds.add(ten);
        }
    }
    
//--------------------------------------------------------------------    
    public void xuat(){
        System.out.println("--------------------");
        for ( String item : ds){
            System.out.println(item);
        }
    }  
    
//---------------------------------------------------------------------  
    public void xuatngaunhien(){
        Collections.shuffle(ds);
        xuat();
    }
    
//----------------------------------------------------------------------
    public void sapxep(){
        Collections.sort(ds);
        Collections.reverse(ds);
        xuat();
    }
//----------------------------------------------------------------------- 
    public void xoa(){
      Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao ten muon xoa :");
        String hoten = sc.nextLine();
        for (String item : ds){
            if ( item.equalsIgnoreCase(hoten)){
                ds.remove(item);
                System.out.println("Xoa ho ten thanh cong ");
                break;
            }
            
        }
    }
//-----------------------------------------------------------------------
        public void menu(){
        Scanner sc = new Scanner(System.in);
        int chon = 0;
            System.out.println("Menu chuong trinh");
            System.out.println("1. Nhap danh sach ho ten");
            System.out.println("2. Hien thi danh sach ho ten");
            System.out.println("3. Sapxep ngau nhien");
            System.out.println("4. Sap xep");
            System.out.println("5. Xoa");
        do{
            System.out.println("Moi ban chon chuc nang");
            chon = sc.nextInt();
            switch (chon){
                case 0:
                    break;
                case 1: 
                    nhap();
                    break;
                case 2 :
                    xuat();
                    break;
                case 3 :
                    xuatngaunhien();
                    break;
                case 4 :
                    sapxep();
                    break;
                case 5:
                    xoa();
                    break;
            }
        }while(chon!=0);
    }
    
}
