package bai_04_vonglap2.pratice;

import java.util.Scanner;

public class Baitap_10 {
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
//        Cach 1:
//        double sum = 0.0;
//        for (int i = 1; i <= n ; i++){
//            double fact = 1;
//            for (int j = 1; j <= (2*i-1);j++){
//                fact = fact * j;
//            }
//            sum = sum + 1.0/fact;
//        }
//        System.out.println("Ket qua = " + sum);


//    Cach 2:
        double sum = 0.0;
        double fact = 1;
        for (int i = 1; i <= n ; i++){
            sum = sum + 1/fact;
            fact = fact * (2 * i) * (2 * i + 1);
        }
        System.out.println("Ket qua = " + sum);
 }
}