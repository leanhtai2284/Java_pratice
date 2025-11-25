package bai_04_vonglap2.pratice;

import java.util.Scanner;

public class Baitap_05 {
    public static void main(String[] args) {
//        # Bài tập 5: In dãy số 2, -4, 6, 8, -10, 12, 14, 16, -18, ..., n
        Scanner sc = new Scanner(System.in);
        int n;

        do {
            System.out.print("Nhap n= ");
            n = sc.nextInt();
            if (n < 1){
                System.out.println("Xin nhap lai");
            } else {
                System.out.println("n= " + n);
            }
        } while (n < 1);

        int distance = 1;
        int count = 0;
        for (int i = 2; i <= n; i += 2 ){
            if (count == distance){
                System.out.println(-i);
                count = 0;
                distance++;
            } else {
                System.out.println(i);
                count++;
            }

        }

    }
}
