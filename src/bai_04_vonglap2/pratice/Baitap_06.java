package bai_04_vonglap2.pratice;

import java.util.Scanner;

public class Baitap_06 {
//    # Bài tập 6(*): In dãy số Fibonacci đến n
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        do {
            System.out.print("Nhap n= ");
            n = sc.nextInt();
            if (n < 1){
                System.out.println("Xin nhap lai");
            } else {
                System.out.println("n = " + n);
            }
        } while (n < 1);

        int f1 = 0;
        int f2 = 1;
        int fn = 1;

        while (fn <= n) {
            System.out.println(fn);
            f1 = f2;
            f2 = fn;
            fn = f1 + f2;
        }
    }
}

