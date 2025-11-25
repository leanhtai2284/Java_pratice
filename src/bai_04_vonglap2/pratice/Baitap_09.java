package bai_04_vonglap2.pratice;

import java.util.Scanner;

public class Baitap_09 {
    //    # Bài tập 9: Tính tổng S = 1 + 1/2 + 1/3 + ... + 1/n
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        do {
            System.out.print("Nhap n= ");
            n = sc.nextInt();
            if (n < 1) {
                System.out.println("Xin nhap lai");
            } else {
                System.out.println("n = " + n);
            }
        } while (n < 1);

        double sum = 0.0;
        for (int i = 1; i <= n; i++){
            sum = sum + 1.0 / i;
        }
        System.out.println("Ket qua = " + sum);
    }
}
