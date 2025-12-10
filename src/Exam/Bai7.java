package Exam;

import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        String[] hoTen;
        int[] tuoi;
        String[] gioiTinh;
        double[] luongCoBan;
        double[] diemTB;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so nhan vien: ");
        int n = sc.nextInt();


    }
    public static void input(Scanner sc,int n, String[] hoTen, int[] tuoi, String[] gioiTinh, double[] luongCoBan, double[] diemTB ){
        for (int i = 0; i <= n; i++){
            System.out.println("Nhap ho ten: ");
            hoTen[i] = sc.next();
            System.out.println("Nhap tuoi: ");
            tuoi[i] = sc.nextInt();
            System.out.println("Nhap gioi tinh: ");
            gioiTinh[i] = sc.next();
            System.out.println("Nhap luong co ban: ");
            luongCoBan[i] = sc.nextDouble();
            System.out.println("Diem trung binh: ");
            diemTB[i] = sc.nextDouble();

        }
    }
}
