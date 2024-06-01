/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poly.edu.lab7;

/**
 *
 * @author ASUS
 */
public class vuong extends ChuNhat{
    public vuong(double canh){
        super(canh,canh);
        double rong = canh;
    }
    public void xuat(){
        System.out.printf("Dien tich hinh vuong la : %.2f | chu vi hinh vuong la : %.2f",getDienTich(),getChuVi());
    }
    
}
