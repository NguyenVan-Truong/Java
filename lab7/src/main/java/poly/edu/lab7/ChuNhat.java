/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poly.edu.lab7;

/**
 *
 * @author ASUS
 */
public class ChuNhat {
    protected  double rong;
    protected  double dai;

    public ChuNhat(double rong, double dai) {
        this.rong = rong;
        this.dai = dai;
    }
    public double getChuVi(){
        return (dai+rong) * 2;
    }
    public double getDienTich(){
        return dai * rong;
    }
    public void xuat(){
        System.out.printf("Dien tich hinh chu nhat la : %.2f | chu vi hinh chu nhat la : %.2f",getDienTich(),getChuVi());
    }
}
