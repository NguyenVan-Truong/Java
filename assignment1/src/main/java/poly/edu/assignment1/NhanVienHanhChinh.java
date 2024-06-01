/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poly.edu.assignment1;

/**
 *
 * @author ASUS
 */
public class NhanVienHanhChinh extends NhanVien{

    public NhanVienHanhChinh(){
    }
    
    public NhanVienHanhChinh(String manv, String tenv, double luongCB) {
        super(manv, tenv, luongCB);
    }
    
    
    
    @Override
    public double getThuNhap() {
        return super.getLuongCB();
    }
    
}
