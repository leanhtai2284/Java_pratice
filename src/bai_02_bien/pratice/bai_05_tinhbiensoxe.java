package bai_02_bien.pratice;

import java.util.Scanner;

public class bai_05_tinhbiensoxe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap bien so xe cua ban :");
        String bienSo = sc.nextLine();

        if(bienSo.length() == 0 || bienSo.length() > 5 ){
            System.out.println("bien so cua ban nhap qua 5 chu so !");
            return;
        }

        for(int i = 0; i < bienSo.length(); i++){
            if(!Character.isDigit(bienSo.charAt(i))){
                System.out.println("Chi nhap so khong nhap ki tu");
                return;
            }
        }

        int tong = 0;
        for (int i = 0 ; i < bienSo.length(); i++){
            int digit = bienSo.charAt(i) - '0';
            tong += digit;
        }

        int soNut = tong % 10;


        System.out.println("Tong so cong lai cua bien so xe cua ban la: " + tong );
        System.out.println("So nut tuong ung voi bien so xe la: "  + soNut);
    }
}
