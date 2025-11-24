package bai_03_vonglap1.lesson;

import java.util.Scanner;

public class SwitchCase {
//    Được sử dụng khi cần thực thi một trong nhiều khối lệnh
//    Dựa trên giá trị của một biến hoặc biểu thức

    //    Nhập vào một số từ 2 đến 8 và xuất ra thứ của tuần tương ứng
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap ngay: ");
        int day = sc.nextInt();

//        Cach 1 : if else
//        if (day == 2) {
//            System.out.println("thu 2");
//        } else if (day == 3) {
//            System.out.println("thu 3");
//        } else if (day == 4) {
//            System.out.println("thu 4");
//        } else if (day == 5) {
//            System.out.println("thu 5");
//        } else if (day == 6) {
//            System.out.println("thu 6");
//        } else if (day == 7) {
//            System.out.println("thu 7");
//        } else if (day == 8) {
//            System.out.println("chu nhat");
//        } else {
//            System.out.println("Ngay khong hop le");
//        }

//        Cach 2 : switch case
        switch (day) {
            case 2 :
                System.out.println("thu 2");
                break;
            case 3 :
                System.out.println("thu 3");
                break;
            case 4 :
                System.out.println("thu 4");
                break;
            case 5 :
                System.out.println("thu 5");
                break;
            case 6 :
                System.out.println("thu 6");
                break;
            case 7 :
                System.out.println("thu 7");
                break;
            case 8 :
                System.out.println("chu nhat");
                break;
            default:
                System.out.println("Ngay khong hop le!");
        }
    }
}
