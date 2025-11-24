package bai_03_vonglap1.pratice3;

import java.util.Scanner;

public class Baitap_05Tinhluongcoban {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap vao TNCT: ");
        int TNCT = sc.nextInt();

        int salaryBasic = 650000;
        double heso = 0;

//        if(TNCT < 12){
//            heso = 1.92;
//        } else  {
//            heso = 2.34;
//            if ( TNCT >= 36) {
//                heso = 3;
//            }else {
//                heso = 4.5;
//            }
//        }
        if(TNCT >= 60){
            heso = 4.5;
        } else if (TNCT > 36) {
            heso = 3;
        } else if (TNCT >= 12) {
            heso = 2.34;
        }else if (TNCT > 0) {
            heso = 1.92;
        } else {
            System.out.println("thang khong hop len la so am");
        }

        double luong =  heso * salaryBasic;

        System.out.println("Muc luong cua nhan vien :" + luong +"VND");
    }

}
