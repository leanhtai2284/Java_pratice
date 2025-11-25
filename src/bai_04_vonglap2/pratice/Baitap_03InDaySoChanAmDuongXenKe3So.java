package bai_04_vonglap2.pratice;

import java.util.Scanner;

public class Baitap_03InDaySoChanAmDuongXenKe3So {
    public static void main(String[] args) {
//        # Bài tập 3: In dãy số chẵn từ 2 đến n với giá trị dương, âm xen kẽ mỗi 3 số
        Scanner sc = new Scanner(System.in);
        int n;


        do{
            System.out.print("Nhap n= ");
            n = sc.nextInt();
            if(n < 1){
                System.out.println("Nhap lai!");
            }else {
                System.out.println("n =" + n);
            }
        }while(n < 1);

//        cach 1
//        for (int i = 2; i <= n; i+=2){
//            if (i % 6 == 0){
//                System.out.println(-i);
//            }else {
//                System.out.println(i);
//            }
//        }



    }
}
