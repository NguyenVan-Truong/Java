/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poly.edu.lab3;

import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class bai4 {
  static String ten[] = new String[50];
  static double diem[] = new double [50]; 
  static int index = 0;
  static void inputs(){
      Scanner Sc;
      String choice = "Y";
      do {
          Sc = new Scanner(System.in);
          System.out.println("nhap ten");
          ten[index] = Sc.nextLine();
          System.out.println("nhap diem");
          diem[index] = Sc.nextDouble();
          index++;
          System.out.println("tiep tuc (y/n)");
          choice = Sc.next();
      } while (choice.equalsIgnoreCase( "y"));  
  }
  static void outputs(){
      for (int i=0;i<index;i++ ){
       System.out.println("ten : " + ten[i]
               + " - diem : " + diem[i] 
               + " - hoc luc :" + hocluc(diem[i]));
      }
  }
  static String hocluc(double diem){
      String xeploai = "";
      if (diem<5){
          xeploai = " Yeu";     
      }else {
          if (diem <6.5){
              xeploai = "Trung binh";
          }else{
              if(diem < 7.5){
                xeploai = " kha";  
              }else{
                  if ( diem <9){
                      xeploai = " gioi";
                  }else{
                      xeploai = " xuat sac";
                  }
              }
          }
          
      }
      return xeploai;
 }
  public static void sapxep(){
      System.out.println("-----Sau khi sap xep -----");
      for ( int i=0;i<index;i++){
          for ( int j=i; j<index;j++){
              if ( diem[i] < diem[j]){
                  double tempoint = diem[i];
                  diem[i]=diem[j] ;
                  diem[j]=tempoint;
                 String temname = ten[i];
                 ten[i]=ten[j];
                 ten[j]=temname;              
              }
          }
      }
      outputs();
  }

    public static void main(String[] args) {
        inputs();
        outputs();
        sapxep();
}
}