/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poly.edu.lab5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class danhsachsanpham {

    int i = 1;
    private ArrayList<sanpham> list = new ArrayList<sanpham>();

    public danhsachsanpham() {
        sanpham sp = new sanpham();
        sp = new sanpham("abc", 1000);
        list.add(sp);
        sp = new sanpham("def", 3000);
        list.add(sp);
        sp = new sanpham("afdsbc", 2000);
        list.add(sp);
    }

    public void nhap() {
        System.out.println("nhap danh sach san pham");
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhap ten san pham thu :" + i);
            String ten = sc.nextLine();
            if (ten == null || ten.equals("")) {
                System.out.println("ban da nhap thanh cong");
                break;
            }
            i++;
            System.out.println("Gia san pham : ");
            double gia = sc.nextDouble();
            list.add(new sanpham(ten, gia));
        } while (true);
    }

    //-----------------------------------------------------------------------  
    public void xuat() {
        System.out.println("danh sach san pham");
        System.out.println("ten\t\t|gia\t\t");
        for (sanpham sp : list) {
            System.out.println(" %s | %2.f\n" + sp.getTensp() + sp.getGia());
        }
    }
//-----------------------------------------------------------------------

    public void sapxep() {
        Comparator<sanpham> comp = new Comparator<sanpham>() {
            @Override
            public int compare(sanpham p1, sanpham p2) {
                return Double.compare(p1.getGia(), p2.getGia());
            }
        };
            Collections.sort (list, comp);
            xuat();
    }

    public void timvaxoa() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ten san pham can tim");
        String ten = sc.nextLine();
        sanpham sp = null;
        for (sanpham sp1 : list) {
            if (sp1.getTensp().equals(ten)) {
                sp = sp1;
                break;
            }
        }
        if (sp != null) {
            list.remove(sp);
            System.out.println("da xoa san pham");
        } else {
            System.out.println("ko tim thay san pham");

        }
    }

    public void tinhgiatrungbinh() {
        double avg = 0, sum = 0;
        for (sanpham sp : list) {
            sum += sp.getGia();
        }
        avg = sum / list.size();
        System.out.println("gia trung binh la :" + avg);
    }

    public void menu() {
        Scanner sc = new Scanner(System.in);
        int chon = 0;
        System.out.println("Menu chuong trinh");
        System.out.println("1. Nhap danh sach san pham");
        System.out.println("2. Hien thi danh sach san pham");
        System.out.println("3. Sapxep san pham theo gia");
        System.out.println("4. tim kiem san pham");
        System.out.println("5. tinh gia trung binh");
        do {
            System.out.println("Moi ban chon chuc nang");
            chon = sc.nextInt();
            switch (chon) {
                case 0:
                    break;
                case 1:
                    nhap();
                    break;
                case 2:
                    xuat();
                    break;
                case 3:
                    sapxep();
                    break;
                case 4:
                    timvaxoa();
                    break;
                case 5:
                    tinhgiatrungbinh();
                    break;
            }
        } while (chon != 0);
    }
}
