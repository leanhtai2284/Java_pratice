package bai_02_bien.pratice;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class bai_04_tinhbankinhhinhtron {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("nhap ban kinh hinh tron : ");
        double ht = sc.nextDouble();

//      Công thức tính chu vi và diện tích hình tròn
        double cvht = Math.PI * (2*ht);
        double dtht = Math.PI * (ht*ht);

//        Kết quả in ra
        System.out.println("ban kinh hinh tron :" + ht);
        System.out.println("chu vi cua hinh tron :" + cvht);
        System.out.println("dien tich cua hinh tron :" + dtht);
    }
}
