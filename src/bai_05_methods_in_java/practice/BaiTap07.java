package bai_05_methods_in_java.practice;

import java.util.Scanner;

public class BaiTap07 {
    static Scanner sc = new Scanner(System.in);
    //NV1
    static String name;
    static int age;
    static  String sex;
    static double salaryBasic;
    static double score;
    //NV2
    static String name2;
    static int age2;
    static  String sex2;
    static double salaryBasic2;
    static double score2;
    //NV3
    static String name3;
    static int age3;
    static  String sex3;
    static double salaryBasic3;
    static double score3;
    //NV4
    static String name4;
    static int age4;
    static  String sex4;
    static double salaryBasic4;
    static double score4;
    //NV5
    static String name5;
    static int age5;
    static  String sex5;
    static double salaryBasic5;
    static double score5;

    //NV1
    public static void nhapThongTin(){
        System.out.print("Nhap ten NV1: ");
        name = sc.next();
        System.out.print("Nhap tuoi NV1: ");
        age = sc.nextInt();
        System.out.print("Nhap gioi tinh NV1: ");
        sex = sc.next();
        System.out.print("Nhap luong co ban NV1: ");
        salaryBasic = sc.nextDouble();
        System.out.print("Nhap dien trung binh NV1: ");
        score = sc.nextDouble();
    }
    public static void inThongTin(){
        System.out.println("Ten cua NV1 la: " + name);
        System.out.println("Tuoi cua NV1 la: " + age);
        System.out.println("Gioi tinh cua NV1 la: " + sex);
        System.out.println("Muc luong co ban cua NV1 la: " + salaryBasic);
        System.out.println("Diem trung binh tot nghiep dai hoc cua NV1 la: " + score);
    }
    //NV2
    public static void nhapThongTin2(){
        System.out.print("Nhap ten NV2: ");
        name2 = sc.next();
        System.out.print("Nhap tuoi NV2: ");
        age2 = sc.nextInt();
        System.out.print("Nhap gioi tinh NV2: ");
        sex2 = sc.next();
        System.out.print("Nhap luong co ban NV2: ");
        salaryBasic2 = sc.nextDouble();
        System.out.print("Nhap dien trung binh NV2: ");
        score2 = sc.nextDouble();
    }

    public static void inThongTin2(){
        System.out.println("Ten cua NV2 la: " + name2);
        System.out.println("Tuoi cua NV2 la: " + age2);
        System.out.println("Gioi tinh cua NV2 la: " + sex2);
        System.out.println("Muc luong co ban cua NV2 la: " + salaryBasic2);
        System.out.println("Diem trung binh tot nghiep dai hoc cua NV2 la: " + score2);
    }
    //NV3
    public static void nhapThongTin3(){
        System.out.print("Nhap ten NV3: ");
        name3 = sc.next();
        System.out.print("Nhap tuoi NV3: ");
        age3 = sc.nextInt();
        System.out.print("Nhap gioi tinh NV3: ");
        sex3 = sc.next();
        System.out.print("Nhap luong co ban NV3: ");
        salaryBasic3 = sc.nextDouble();
        System.out.print("Nhap dien trung binh NV3: ");
        score3 = sc.nextDouble();
    }

    public static void inThongTin3(){
        System.out.println("Ten cua NV3 la: " + name3);
        System.out.println("Tuoi cua NV3 la: " + age3);
        System.out.println("Gioi tinh cua NV3 la: " + sex3);
        System.out.println("Muc luong co ban cua NV3 la: " + salaryBasic3);
        System.out.println("Diem trung binh tot nghiep dai hoc cua NV3 la: " + score3);
    }
    //NV4
    public static void nhapThongTin4(){
        System.out.print("Nhap ten NV4: ");
        name4 = sc.next();
        System.out.print("Nhap tuoi NV4: ");
        age4 = sc.nextInt();
        System.out.print("Nhap gioi tinh NV4: ");
        sex4 = sc.next();
        System.out.print("Nhap luong co ban NV4: ");
        salaryBasic4 = sc.nextDouble();
        System.out.print("Nhap dien trung binh NV4: ");
        score4 = sc.nextDouble();
    }

    public static void inThongTin4(){
        System.out.println("Ten cua NV4 la: " + name4);
        System.out.println("Tuoi cua NV4 la: " + age4);
        System.out.println("Gioi tinh cua NV4 la: " + sex4);
        System.out.println("Muc luong co ban cua NV4 la: " + salaryBasic4);
        System.out.println("Diem trung binh tot nghiep dai hoc cua NV4 la: " + score4);
    }
    //NV5
    public static void nhapThongTin5(){
        System.out.print("Nhap ten NV5: ");
        name4 = sc.next();
        System.out.print("Nhap tuoi NV5: ");
        age4 = sc.nextInt();
        System.out.print("Nhap gioi tinh NV5: ");
        sex4 = sc.next();
        System.out.print("Nhap luong co ban NV5: ");
        salaryBasic4 = sc.nextDouble();
        System.out.print("Nhap dien trung binh NV5: ");
        score4 = sc.nextDouble();
    }

    public static void inThongTin5(){
        System.out.println("Ten cua NV5 la: " + name4);
        System.out.println("Tuoi cua NV5 la: " + age4);
        System.out.println("Gioi tinh cua NV5 la: " + sex4);
        System.out.println("Muc luong co ban cua NV5 la: " + salaryBasic4);
        System.out.println("Diem trung binh tot nghiep dai hoc cua NV5 la: " + score4);
    }

    public static void main(String[] args) {
        int n;
        do {
            System.out.println("Nhap n so nhan vien: ");
            n = sc.nextInt();
            if (n >= 5 ){
                System.out.println("So nhan vien vuot qua ! Nhap lai");
            }else {
                System.out.println("In " + n + " nhan vien: ");
            }
        } while (n >= 5);

        switch (n){
            case 1:
                nhapThongTin();
                inThongTin();
                break;
            case 2:
                nhapThongTin();
                nhapThongTin2();
                inThongTin();
                inThongTin2();
                break;
            case 3:
                nhapThongTin();
                nhapThongTin2();
                nhapThongTin3();
                inThongTin();
                inThongTin2();
                inThongTin3();
                break;
            case 4:
                nhapThongTin();
                nhapThongTin2();
                nhapThongTin3();
                nhapThongTin4();
                inThongTin();
                inThongTin2();
                inThongTin3();
                inThongTin4();
                break;
            case 5:
                nhapThongTin();
                nhapThongTin2();
                nhapThongTin3();
                nhapThongTin4();
                nhapThongTin5();
                inThongTin();
                inThongTin2();
                inThongTin3();
                inThongTin4();
                inThongTin5();
                break;
            default:
        }


    }

}
