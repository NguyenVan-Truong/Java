/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package poly.edu.lab6;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Lab6 {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.print(" Nhap ho ten");
        String hoTen = sc.nextLine();
        hoTen.trim();
        String ho = hoTen.substring(0, hoTen.indexOf(" "));
        String tenDem = hoTen.substring(hoTen.indexOf(" "), hoTen.lastIndexOf(" "));
        String ten = hoTen.substring(hoTen.lastIndexOf(" "));
        
        System.out.printf("%s %s %s",ho.toUpperCase(),tenDem,ten.toUpperCase());
        
        
    }
}
