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
public class Bai1 {
    public static void main (String[] args ) {
        float a,b,x;
        Scanner sc  = new Scanner(System.in);
        System.out.println(" nhap a");
        a=sc.nextFloat();
        System.out.println("nhap b");
        b=sc.nextFloat();
        if (a==0){
            if(b==0){   
                System.out.println("vo so nghiem");
            }else{
                System.out.println("vo nghiem");
            }
        }else{
              x=-b/a;
              System.out.println("x= " + x);  
        }       
    } 
}
