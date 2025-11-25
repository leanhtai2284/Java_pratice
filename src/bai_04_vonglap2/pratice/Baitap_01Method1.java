package bai_04_vonglap2.pratice;

import java.util.Scanner;

public class Baitap_01Method1 {
    public static void main(String[] args) {
        // Bai tap 1 : In day so le tu 1 den n
        // In day so 1, 3, 5, 7, 9, ... n
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Nhap so nguyen duong n: ");
            n = sc.nextInt();
            if (n < 1) {
                System.out.println("n phai la so nguyen duong, xin nhap lai!");
            } else {
                System.out.println("n= " + n);
            }
        } while (n < 1);

//        Cach 1 :
//        for (int i = 1; i <= n; i++){
//            if (i % 2 != 0){
//                System.out.println(i);
//            }
//        }
//        Cach 2:
        for (int i = 1; i <= n; i += 2) {
            System.out.println(i);
        }


    }
}
