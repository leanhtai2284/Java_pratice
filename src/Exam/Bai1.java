package Exam;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        // a
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap x: ");
        int n = sc.nextInt();
        do {
            if (n < 1) {
                System.out.println("Vui long nhap lai!");
            }
        } while (n < 1);
        if (soChinhPhuong(n)){
            System.out.println("Day la so chinh phuong");
        } else {
            System.out.println("Day khong phai so chinh phuong");
        }
    }

    public static boolean soChinhPhuong(int n) {
        if (n < 0) {
            return false ;
        }
        double squareRoot = Math.sqrt(n);
        return squareRoot * squareRoot == n;
    }


}
