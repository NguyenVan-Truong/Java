/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poly.edu.lab7;

/**
 *
 * @author ASUS
 */
public abstract class bai2 {
    private String hoTen;
    private String nganh;

    public bai2(String hoTen, String nganh) {
        this.hoTen = hoTen;
        this.nganh = nganh;
    }


    public String getHoTen() {
        return hoTen;
    }

    public String getNganh() {
        return nganh;
    }
    
    abstract double getDiem();
    
    public String getHocLuc(){
        String hocLuc = null;
        double diem = getDiem();
        if(diem>=9){
            hocLuc="xuat xac";   
        }else if(diem >= 7.5){
            hocLuc="gioi";
        }else if(diem >=6.5){
            hocLuc="kha";
        }else if(diem >=5){
            hocLuc="trung binh";
        }else{
            hocLuc="yeu";
        }
        return hocLuc;
    }     

}
