/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poly.edu.baithithu;

/**
 *
 * @author ASUS
 */
public class CanBo {
    private String HoTen;
    private String maCB;
    private String chucVu;

    public CanBo(String HoTen, String maCB, String chucVu) {
        this.HoTen = HoTen;
        this.maCB = maCB;
        this.chucVu = chucVu;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public String getMaCB() {
        return maCB;
    }

    public void setMaCB(String maCB) {
        this.maCB = maCB;
    }

    public String getChucVu() {
        return chucVu;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }
    
    public void InThongTin(){
        System.out.println("ho ten "+HoTen);
        System.out.println("ma Can Bo "+maCB);
        System.out.println("chuc vu"+chucVu);
}

}
