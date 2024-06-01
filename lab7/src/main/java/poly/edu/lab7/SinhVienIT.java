/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poly.edu.lab7;

/**
 *
 * @author ASUS
 */
public class SinhVienIT extends bai2{
    protected double diemJava;
    protected double diemCss;
    protected double diemHtml;

    public SinhVienIT(double diemJava, double diemCss, double diemHtml, String hoTen, String nganh) {
        super(hoTen, nganh);
        this.diemJava = diemJava;
        this.diemCss = diemCss;
        this.diemHtml = diemHtml;
    }  
    @Override
    double getDiem(){
        return (2 * diemJava + diemCss + diemHtml )/4;
    }
    
}
