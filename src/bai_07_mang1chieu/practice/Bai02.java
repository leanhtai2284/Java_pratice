package bai_07_mang1chieu.practice;

import java.security.SecureRandom;
import java.util.Scanner;

public class Bai02 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        String[] hoTen = new String[5];
        int[] tuoi = new int[5];
        String[] gioiTinh = new String[5];
        double[] luongCoBan = new double[5];
        double[] diemTB = new double[5];

        System.out.println("Nhap thong tin ");
        for (int i = 0; i < 5; i++) {
            System.out.println("Nhap  nhan vien thu " + (i+1) + ": ");
            inPut(i,hoTen,tuoi,gioiTinh,luongCoBan,diemTB);
        }
        System.out.println("Danh sach thong tin nhan vien");
        System.out.printf("%-20s %-10s %-10s %-15s %-10s\n","Ho ten","Tuoi","Gioi tinh","Luong con ban","Diem trung binh");
        for (int i = 0; i < 5; i++){
            outPut(i,hoTen,tuoi,gioiTinh,luongCoBan,diemTB);
        }

    }

    public static void inPut(int i, String[] hoTen, int[] tuoi, String[] gioiTinh, double[] luongCoBan, double[] diemTB) {
        System.out.println("Nhap ho ten: ");
        hoTen[i] = sc.nextLine();
        System.out.println("Nhap tuoi: ");
        tuoi[i] = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap gioi tinh: ");
        gioiTinh[i] = sc.nextLine();
        System.out.println("Nhap luong co ban: ");
        luongCoBan[i] = sc.nextDouble();
        System.out.println("Nhap diem trung binh: ");
        diemTB[i] = sc.nextDouble();
        sc.nextLine();


    }

    public static void outPut(int i, String[] hoTen, int[] tuoi, String[] gioiTinh, double[] luongCoBan, double[] diemTB) {
        System.out.printf("%-20s %-10d %-10s %-15.0f %-10.2f\n ", hoTen[i], tuoi[i], gioiTinh[i], luongCoBan[i], diemTB[i]);
    }


}
