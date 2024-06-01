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
public class Bai4 {
    public static void main(String[] srgs){
        Scanner sc  = new Scanner(System.in);
        int choice;
        System.out.println(" nhap chuc nang :");
         choice=sc.nextInt();
        switch(choice){
        case 1:
           System.out.println("Giai Phuong trinh bac 1 :"); 
           bai1();
           break;    
           case 2:
           System.out.println("Giai Phuong trinh bac 2 :"); 
           bai2();
           break;
           case 3:
           System.out.println("tien dien"); 
           bai3();
           break;
           case 4:
           System.out.println("ket thuc");
           System.exit(0);
           break;
    }
    }
    
    
    
    
    
    
    public static void bai1(){
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
    
  
    public static void bai2(){
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
    
  public static void bai3(){
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



