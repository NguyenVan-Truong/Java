/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poly.edu.lab5;

/**
 *
 * @author ASUS
 */
public class sanpham {
    private String tensp;
    private double gia;
    
    public sanpham(){
        this.tensp = null;
        this.gia = 0;    
    }
    
    
    public sanpham(String tensp , double gia){
        this.tensp = tensp;
        this.gia = gia;
        
    
    }

    public String getTensp() {
        return tensp;
    }

    public void setTensp(String tensp) {
        this.tensp = tensp;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }
}