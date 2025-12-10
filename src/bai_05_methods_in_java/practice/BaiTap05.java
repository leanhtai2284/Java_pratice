package bai_05_methods_in_java.practice;

import java.util.Scanner;

public class BaiTap05 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        inDayFibonaci(n);
    }

    public static void inDayFibonaci(int n) {
        System.out.println(n + " Phan tu dau tien trong day: ");
        int f1 = 0;
        int f2 = 1;
        int fn;

        for (int i = 0; i < n; i++) {
            System.out.println(f1 + " ");
            fn = f1 + f2;
            f1 = f2;
            f2 = fn;
        }
    }

}
