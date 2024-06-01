    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poly.edu.lab6;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class SinhVien {
    private String hoTen;
    private String phone;
    private String email;
    private String cmnd;
    
    public SinhVien(){
        
    }

    public SinhVien(String hoTen, String phone, String email, String cmnd) {
        this.hoTen = hoTen;
        this.phone = phone;
        this.email = email;
        this.cmnd = cmnd;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCmnd() {
        return cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }
    
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Nhap ho ten: ");
            hoTen = sc.nextLine();
            if (hoTen == null | hoTen.equals("")){
                System.out.println("Ho ten ko phu hop");
            }else{
                break;
            }       
        }while(true);
        Data ds = new Data();
        do{
            System.out.println("Nhap email:");
            email = sc.nextLine();
            if(ds.isEmail(email)){
                break;
            }
                System.out.println("Email ko hop le");
        }while(true);
        
        
        do{
            System.out.println("Moi ban nhap so dt");
            phone = sc.nextLine();
            if(ds.isPhone(phone)){
                break;
            }
            System.out.println("So DT ko hop le");
        }while(true);
        
        do{
            System.out.println("Moi ban nhap so cmnd");
            cmnd = sc.nextLine();
            if(ds.isCMND(cmnd)){
                break;
            }
            System.out.println("CMND ko hop le");
        }while(true);
    }
 
    public  void xuat(){
        System.out.println("Ho ten:%s - Email:%s-Sdt:%s-cmnd:%s\n"+hoTen+email+phone+cmnd);
    }
}
