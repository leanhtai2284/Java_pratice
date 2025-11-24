package bai_03_vonglap1.pratice3;

import java.util.Scanner;

public class Baitap_04Giaiptbac2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap vao a : ");
        double a = sc.nextDouble();
        System.out.println("Nhap vao b : ");
        double b = sc.nextDouble();
        System.out.println("Nhap vao c : ");
        double c = sc.nextDouble();

        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Phuong trinh vo so nghiem");
                } else {
                    System.out.println("Phuong trinh vo nghiem");
                }
            }else {
                double x =  - c / b;
                System.out.println("Nghiem cua phuong trinh bac mot : " + x);
            }
        } else {
            double delta = Math.pow(b,2) - 4 * a * c;
            System.out.println("Delta = " + delta);
            if(delta < 0){
                System.out.println("Pt vo nghiem");
            } else if (delta == 0) {
                double x = -b / (2*a);
                System.out.println("Pt co nghiem kep la x1 = x2 = " + x);
            } else {
                double x1 = (-b + Math.sqrt(delta) / (2*a));
                double x2 = (-b - Math.sqrt(delta) / (2*a));

                System.out.println("Nghiem cua x1 = " + x1);
                System.out.println("Nghiem cua x2 = " + x2);
            }
        }
    }
}