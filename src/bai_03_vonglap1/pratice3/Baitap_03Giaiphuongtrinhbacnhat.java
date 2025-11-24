package bai_03_vonglap1.pratice3;

import java.util.Scanner;

public class Baitap_03Giaiphuongtrinhbacnhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap vao a : ");
        double a = sc.nextDouble();
        System.out.println("Nhap vao b : ");
        double b = sc.nextDouble();
        
        if (a == 0){
            if( b == 0 ){
                System.out.println("Phuong trinh vo so nghiem");
            }else{
                System.out.println("Phuong trinh vo nghiem");
            }
        } else {
            double x = - b / a;
            System.out.println("Nghiem cua phuong trinh khi a != b : " + x);
        }
    }
    
}
