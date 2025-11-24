package bai_03_vonglap1.lesson;

import java.util.Scanner;

public class ConditionalStatement {
    public static void main(String[] args) {
//        Câu lệnh điều kiện cho phép thực thi một khối lệnh nào đó
//        Dựa trên giá trị đúng hoặc sai của một biểu thức điều kiện
        /*
        * Xếp loại học viện :
        * Điểm < 5 : yếu
        * Điểm >= 5 : Khá
        * */

//        variatable
//        field
//        ctrl + alt + l => tu format
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap diem cua ban :");
        double score = sc.nextDouble();

        // Cach 1 : cau dieu kien thieu
//        if(score < 5){
//            System.out.println("Yeu");
//        }
//
//        if(score >= 5){
//            System.out.println("Kha");
//        }

//        Cach 2 : cau dieu kien du
//        if(score < 5){
//            System.out.println("Yeu");
//        } else {
//            System.out.println("Kha");
//        }

        /*
        Xếp loại học viện :
         Điểm < 5 : yếu
         Điểm >= 5 : Khá và điểm < 8 : khá
         Điểm >= 8 : Tốt
         */

//        if(score < 5){
//            System.out.println("Yeu");
//        }
//        if (score >= 5 && score < 8){
//            System.out.println("Kha");
//        }else {
//            System.out.println("Tot");
//        }

        if(score < 5){
            System.out.println("Yeu");
        } else if (score < 8) {
            System.out.println("Kha");
        } else {
            System.out.println("Tot");
        }



    }
}
