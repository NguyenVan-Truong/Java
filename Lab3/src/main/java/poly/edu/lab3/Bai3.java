/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poly.edu.lab3;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */

public class Bai3 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int n;
        System.out.print("Nhap so phan tu mang :");
        n = Sc.nextInt();
        int mang1[]= new int[n];
        for ( int i=0 ;i<n;i++){
            System.out.printf("nhập gía trị phần tử [%d] = ", i + 1 ); 
            mang1[i]=Sc.nextInt();         
        }
        Arrays.sort(mang1);
        System.out.println("mang vua nhap da sap xep la :" + Arrays.toString(mang1));
        int min = mang1[0];
        for (int i=0; i<n;i++){
            if (min> mang1[i]){
                min = mang1[i];
            }
        }
        System.out.println("Phan tu nho nhat la :" + min); 
        float count = 0;
        int tong = 0;
        for (int i = 0;i<n;i++){
             if(mang1[i] % 3 == 0 ){
			 tong+= mang1[i];
			 count++;
		 }        
        }
        float avg =( float)tong / count;
        System.out.println("trung binh cac so chia het cho 3 la :"+ avg);
    }
}
