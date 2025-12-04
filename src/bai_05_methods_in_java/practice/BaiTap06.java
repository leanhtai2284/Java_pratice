package bai_05_methods_in_java.practice;

import java.util.Scanner;

public class BaiTap06 {
    static Scanner sc = new Scanner(System.in);
    static String name;
    static int age;
    static  String sex;
    static double salaryBasic;
    static double score;

    public static void main(String[] args) {
        nhapThongTin();
        inThongTin();

    }
    public static void nhapThongTin(){
        System.out.print("Nhap ten: ");
        name = sc.nextLine();
        System.out.print("Nhap tuoi: ");
        age = sc.nextInt();
        System.out.print("Nhap gioi tinh: ");
        sex = sc.next();
        System.out.print("Nhap luong co ban: ");
        salaryBasic = sc.nextDouble();
        System.out.print("Nhap dien trung binh: ");
        score = sc.nextDouble();
    }

    public static void inThongTin(){
        System.out.println("Ten cua ban la: " + name);
        System.out.println("Tuoi cua ban la: " + age);
        System.out.println("Gioi tinh cua ban la: " + sex);
        System.out.println("Muc luong co ban cua ban la: " + salaryBasic);
        System.out.println("Diem trung binh tot nghiep dai hoc cua ban la: " + score);
    }

}
