/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poly.edu.baithithu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class qlCB {
    ArrayList<CanBo> list = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    public void nhapTT(){
        while(true){
        System.out.println("nhap ho ten :");
        String hoTen = sc.nextLine();
        System.out.println("nhap ma cb :");
        String maCB = sc.nextLine();
        System.out.println("nhap chuc vu");
        String chucVu = sc.nextLine();
        
        list.add(new CanBo(hoTen, maCB, chucVu));
        
            System.out.println("muon nhap tiep hay ko(y/n) :");
            String chon = sc.nextLine();
            if(chon.equalsIgnoreCase("n")){
                break;
            }
        }
    }
    
    
    public void xuatTT(){
        for (CanBo cb : list){
            cb.InThongTin();
        }
    }
    
    
    public void sapxep(ArrayList<CanBo> list){
            Comparator<CanBo> comp = new Comparator<CanBo>() {
            @Override
            public int compare(CanBo o1, CanBo o2) {
                return o1.getMaCB().compareTo(o2.getMaCB());
            }
        };
        Collections.sort(list, comp);
        System.out.println("Sap xep thanh cong");
        xuatTT();
}
   //--------------------------------------------------- 
        public int getIndex(String maCB) {
        int temp = -1;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getMaCB().equals(maCB)) {
                temp = i;
            }
        }
        return temp;
    }

    public void xoa(){
        System.out.print("Nhap ma cb can xoa:");
        String maCB = sc.nextLine();
        int temp = getIndex(maCB);
        if (temp == -1) {
            System.out.println("Ma CB khong co");
        } else {
            list.remove(temp);
            System.out.println("Xoa thanh cong");
            xuatTT();
        }

}   
        public void add5CB() {
        CanBo cb1 = new CanBo("101", "Nguyen Van A", "PP");
        list.add(cb1);
        CanBo cb2 = new CanBo("102", "Nguyen Van B", "TP");
        list.add(cb2);
        CanBo cb3 = new CanBo("104", "Nguyen Van D", "NV");
        list.add(cb3);
        CanBo cb4 = new CanBo("109", "Nguyen Van C", "NV");
        list.add(cb4);
        CanBo cb5 = new CanBo("103", "Nguyen Van E", "PP");
        list.add(cb5);
    }
        public void keThua(){
        CanBo cb;
        cb = new CanBoHopDong(12, "201", "le van b", "hd");
        cb.InThongTin();
        System.out.println("");
    }
} 