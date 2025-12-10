package Exam;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap x: ");
        int n = sc.nextInt();
        do {
            if (n < 1) {
                System.out.println("Vui long nhap lai!");
            }
        } while (n < 1);
        Fibonaci(n);
    }
    public static void Fibonaci(int n){
        int b = 0;
        int c = 1;
        for (int i = 0; i <= n; i++) {
            int Fibo = b + c;
            System.out.print(Fibo + " ");
            b = c;
            c = Fibo;
        }
    }

}
