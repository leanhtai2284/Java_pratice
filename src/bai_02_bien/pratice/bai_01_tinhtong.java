package bai_02_bien.pratice;

import java.util.Scanner;

public class bai_01_tinhtong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap vao a :");
        int a = sc.nextInt();
        System.out.println("Nhap vao b :");
        int b = sc.nextInt();

        try {
            System.out.println("Tong cua ab = " + (a+b));
            System.out.println("Hieu cua ab = " + (a-b));
            System.out.println("Tich cua ab = " + (a*b));
            System.out.println("Thuong cua ab = " + (a /  b));

        }catch (ArithmeticException ex){
            System.out.println("khong chia duoc cho 0" + ex);
        }
    }
}
