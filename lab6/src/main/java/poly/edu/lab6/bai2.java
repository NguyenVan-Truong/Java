/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poly.edu.lab6;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class bai2 {
    public static void main(String[] args) {
        ArrayList<sanpham> list = new ArrayList<>();
        for ( int i = 0; i<3;i++){
            sanpham sp = new sanpham();
            sp.nhap();
            list.add(sp);
        }
        
        for(sanpham sp : list){
            if (sp.getHang().equalsIgnoreCase("Nokia")){
                sp.xuat();
                System.out.println();
            }
        }
    }
}