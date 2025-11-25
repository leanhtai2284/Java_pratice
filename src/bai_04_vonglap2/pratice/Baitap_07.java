package bai_04_vonglap2.pratice;

import java.util.Scanner;

public class Baitap_07 {
//    # Bài tập 7: In dãy số 1, 3, 7, 15, 31, ... n
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

        int a = 1;
        while (a <= n){
            System.out.println(a);
            a = 2 * a + 1;
        }
    }
}
