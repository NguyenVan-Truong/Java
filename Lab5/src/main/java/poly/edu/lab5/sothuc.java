/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poly.edu.lab5;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class sothuc {
    private ArrayList<Double> list=new ArrayList<>();
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        String qd;//quyet dinh nhap 
        Boolean yn=true;//bien dieu khien nhap
        while(yn){
            System.out.println("Moi nhap so :");
            double x = Double.parseDouble(sc.nextLine());
            list.add(x);
            qd = sc.nextLine();
            switch(qd){
                case "yes":
                    yn=true;
                    break;
                case "no":
                    yn=false;
                    break;
                default:
                    System.err.println("hay nhap lai 1 so");
            }
        }
    }
    public void xuat(){
        System.out.println("cac phan tu vua nhap:");
        double tong=0; 
        for ( Double x: list ){
            tong=tong+x;
            System.out.println(x);
        }
        System.out.println("tong la "+tong);
    }
}
