package bai_04_vonglap2.pratice;

import java.util.Scanner;

public class Baitap_03Cach2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        do {
            System.out.print("Nhap n= ");
            n = sc.nextInt();
            if (n < 1){
                System.out.println("Nhap lai!");
            } else {
                System.out.println("n= " + n);
            }
        } while (n < 1);

        int distance = 3;
        int count = 0;
        for(int i = 2; i <= n; i += 2){
            count ++;
            if (count == distance){
                System.out.println(-i);
                count = 0;
            } else {
                System.out.println(i);
            }
        }
    }
}
