package bai_05_methods_in_java.practice;

import java.util.Scanner;

public class BaiTap04 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Nhap a: ");
        int a = sc.nextInt();
        System.out.print("Nhap b: ");
        int b = sc.nextInt();
        int timUSCLN = timUCLN(a,b);
        System.out.println("Uoc so chung lon nhat cua " + a + " va " + b + " la: " + timUSCLN);
    }

    public static int timUCLN(int a, int b) {
        if (a == 0 || b == 0) {
            return a + b;
        }
        int max = Math.max(a, b);
        int min = Math.min(a, b);

        if (max % min == 0) {
            return min;
        }

        for (int i = min / 2; i >= 1; i--) {
            if (a % i == 0 && b % i == 0) {
                return i;
            }
        }
        return 1;
    }
}
