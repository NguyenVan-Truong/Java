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
public class Bài2 {
    public static void main(String[] srgs){
        Scanner sc  = new Scanner(System.in);
        double a,b,c,x1,x2;
        double delta = 0; 
        System.out.println(" nhap a");
        a=sc.nextDouble();
        System.out.println(" nhap b");
        b=sc.nextDouble();
        System.out.println(" nhap c");
        c=sc.nextDouble();
        if(a==0){
           System.out.println("phuong trinh bac 1"); 
           if(b==0){
               if(c==0){
                   System.out.println("phuong trinh vo so nghiem"); 
               }else{
                   System.out.println("phuong trinh vo nghiem"); 
               }
           }else{
               x1 = -c/b;
               System.out.println("x="+x1); 
           }
        }else{
             delta = b * b - 4 * a * c;
             System.out.println("delra: " + delta );
           if(delta <= 0){
               if(delta < 0){
                 System.out.println("phuong trinh vo nghiem");   
               }else{
                System.out.println("phuong trinh co nghiem kep "); 
                x1 = x2 = -b/(2*a);
                 System.out.println("x1  "+ x1);
                 System.out.println("x2  "+ x2);
            }
        }else{
          x1 = ((-b) + Math.sqrt(delta))/(2*a);
          x2 = ((-b) - Math.sqrt(delta))/(2*a);
          System.out.println("x1"+ x1);
          System.out.println("x2  "+ x2);
        }
    }
        }
}      

