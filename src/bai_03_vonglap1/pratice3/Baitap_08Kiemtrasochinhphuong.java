package bai_03_vonglap1.pratice3;

import java.util.Scanner;

public class Baitap_08Kiemtrasochinhphuong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so nguyen duong x: ");
        int x = sc.nextInt();


        double squareRoot = Math.sqrt(x);
        if(squareRoot % 1 == 0){
            System.out.println("x la so chinh phuong");
        } else {
            System.out.println("x khong phai la so chinh phuong");
        }

        System.out.println("Ket qua la : " + squareRoot);
    }

}
