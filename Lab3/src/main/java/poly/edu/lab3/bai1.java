/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poly.edu.lab3;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;
public class bai1 {
     public static void main(String[] args) {
	int n;
	Scanner scanner = new Scanner(System.in);
	System.out.println("nhap N");
	n = scanner.nextInt();
	boolean ok = true;
	for(int i = 2; i < n  ; i++){
		if (n % i ==0)
		{
			ok = false;
			break;
		}
	} 
	if (ok == true) {
		System.out.printf("%d la so nguyen to ",n);
	} else {
		System.out.printf("%d khong phai la so nguyen to ",n);
	}			
}  
}