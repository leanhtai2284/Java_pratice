package bai_04_vonglap2.pratice;

import java.util.Scanner;

public class Baitap_04 {
    public static void main(String[] args) {
//        # Bài tập 4: In dãy số chẵn từ 2 đến 2n
        Scanner sc = new Scanner(System.in);
        int n;

        do {
            System.out.print("Nhap n= ");
            n = sc.nextInt();
            if (n < 1){
                System.out.println("Xin nhap lai");
            } else {
                System.out.println("Day so chan tu 2 den " + (2 * n) + " la:");
            }
        }while (n < 1);

       for (int i = 2; i <= 2*n ; i += 2){
           System.out.println(i);
       }

    }

}
