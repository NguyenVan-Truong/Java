/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poly.edu;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;
public class Bai3 {
     public static void main(String[] srgs){
         Scanner sc  = new Scanner(System.in);
         int sodien,tiendien=0;
         System.out.println(" nhap so dien :");
         sodien=sc.nextInt();
         if(sodien<50){
             tiendien=sodien*1000;
         }else{
             tiendien=50 * 1000 * (sodien-50)*1200; 
         }
         System.out.println("Tien Dien "+ tiendien);
     }
}
