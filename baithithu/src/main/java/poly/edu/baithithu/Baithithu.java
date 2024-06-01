/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package poly.edu.baithithu;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Baithithu {

    public static void main(String[] args) {
        qlCB ql = new qlCB();
        ArrayList<CanBo> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        ql.add5CB();
        String z;
        System.out.println("=============================================");
        System.out.println("|                     menu                  |");
        System.out.println("| 1. Nhap danh sach can bo                  |");
        System.out.println("| 2. Xuat danh sach ca bo                   |");
        System.out.println("| 3. Xoa thong tin can bo theo ma nhap      |");
        System.out.println("| 4. sap xep danh sach can bo theo ho ten   |");
        System.out.println("| 5. ke thua                                |");
        System.out.println("| 0. Thoat                                  |");
        System.out.println("===============================================");
        do{    
            System.out.println("moi ban chon chuc nang :");
            z = sc.nextLine();
            switch (z){
                case "1" : 
                    ql.nhapTT();
                    break;
                case "2" :
                    ql.xuatTT();
                    break;
                case "3" :
                    ql.xoa();
                    break;
                case "4" :
                    ql.sapxep(list);
                    break;
                case "5" :
                    ql.keThua();
                    break;
                default :
                    System.out.println("khong ton tai dap an");
                    break;
            }
        }while (true);
    }

}
