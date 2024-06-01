/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poly.edu.lab7;

/**
 *
 * @author ASUS
 */
public class SinhVienBiz extends bai2{
    protected double diemMarketting;
    protected double diemsales;

    public SinhVienBiz(double diemMarketting, double diémales, String hoTen, String nganh) {
        super(hoTen, nganh);
        this.diemMarketting = diemMarketting;
        this.diemsales = diémales;
    }
    
    @Override
    double getDiem(){
        return (2 * diemMarketting + diemsales )/3;
    }
}
