/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poly.edu.baithithu;

/**
 *
 * @author ASUS
 */
public class CanBoHopDong extends CanBo{
     public int thangHopDong;
    
    public void CanBoHopDong(){
    }

    public CanBoHopDong(int thangHopDong, String HoTen, String maCB, String chucVu) {
        super(HoTen, maCB, chucVu);
        this.thangHopDong = thangHopDong;
    }

        public int getThangHopDong() {
        return thangHopDong;
    }

    public void setThangHopDong(int thangHopDong) {
        this.thangHopDong = thangHopDong;
    }

    public void InThongTin() {
        super.InThongTin();
        System.out.print(" "+this.thangHopDong);
    }
    

    
    
}
